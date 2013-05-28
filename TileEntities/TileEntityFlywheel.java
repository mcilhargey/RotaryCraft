/*******************************************************************************
 * @author Reika
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.TileEntities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import Reika.DragonAPI.Libraries.ReikaEngLibrary;
import Reika.DragonAPI.Libraries.ReikaMathLibrary;
import Reika.DragonAPI.Libraries.ReikaPhysicsHelper;
import Reika.RotaryCraft.MachineRegistry;
import Reika.RotaryCraft.RotaryConfig;
import Reika.RotaryCraft.Base.RotaryModelBase;
import Reika.RotaryCraft.Base.TileEntityIOMachine;
import Reika.RotaryCraft.Models.ModelFlywheel;

public class TileEntityFlywheel extends TileEntityIOMachine {

	public static final int MINTORQUERATIO = 4;
	public static final int WOODFLYTORQUEMAX = 16;		// rho 0.8	-> 1	-> 1
	public static final int STONEFLYTORQUEMAX = 128;	// rho 3	-> 4	-> 8
	public static final int IRONFLYTORQUEMAX = 512;		// rho 8	-> 8	-> 32
	public static final int GOLDFLYTORQUEMAX = 4096;	// rho 19.3	-> 32	-> 256
	public double DECAY;

	private int omegain;
	private int maxtorque;
	public boolean failed = false;
	private int soundtick = 0;



	public void testFailure() {
		double factor = 0.25*Math.sqrt(omega);
		switch(this.getBlockMetadata()/4) {
		case 1:
			factor /= 2.5;
		case 3:
			factor *= 1.25;
		}
		factor *= ReikaMathLibrary.doubpow(omega/65536D, 1.5);
		double energy = ReikaEngLibrary.rotenergy(this.getDensity(), 0.25, omega, 0.75);
		//ReikaJavaLibrary.pConsole(ReikaPhysicsHelper.getExplosionFromEnergy(energy/factor)+"  fails: "+ReikaEngLibrary.mat_rotfailure(this.getDensity(), 0.75, omega, 100*this.getStrength()));
		if (ReikaEngLibrary.mat_rotfailure(this.getDensity(), 0.75, omega, 100*this.getStrength()))
			this.fail(worldObj, xCoord, yCoord, zCoord, energy/factor);
	}

	private void fail(World world, int x, int y, int z, double e) {
		failed = true;
		if (!world.isRemote)
			world.createExplosion(null, x+0.5, y+0.5, z+0.5, ReikaPhysicsHelper.getExplosionFromEnergy(e), true);
	}

	public double getDensity() {
		switch (this.getBlockMetadata()/4) {
		case 0:
			return ReikaEngLibrary.rhowood;
		case 1:
			return ReikaEngLibrary.rhorock;
		case 2:
			return ReikaEngLibrary.rhoiron;
		case 3:
			return ReikaEngLibrary.rhogold;
		}
		return 0;
	}

	public double getStrength() {
		switch (this.getBlockMetadata()/4) {
		case 0:
			return ReikaEngLibrary.Twood;
		case 1:
			return 0.9*ReikaEngLibrary.Tstone;
		case 2:
			return 5*ReikaEngLibrary.Tiron;
		case 3:
			return ReikaEngLibrary.Tgold;
		}
		return 0;
	}

	public int frictionLosses(int omega) {
		int fric = RotaryConfig.friction;
		return (omega*fric);
	}

	@Override
	public void updateEntity(World world, int x, int y, int z, int meta) {
		super.updateTileEntity();
		this.getType(meta/4);
		this.getIOSides(world, x, y, z, meta%4);
		if (failed) {
			omega = 0;
			torque = 0;
			power = 0;
			return;
		}
		this.process(world, x, y, z);
		power = omega*torque;
		this.testFailure();
		this.playSounds();

	}

	private void playSounds() {
		if (omega == 0) {
			soundtick = 20000;
			return;
		}
		float pitch = (float)Math.sqrt(omega/1024F);
		if (pitch == 0)
			pitch = 0.01F;
		soundtick++;
		if (soundtick < -3F/(pitch*pitch)+69/(pitch))
			return;
		soundtick = 0;
		worldObj.playSoundEffect(xCoord+0.5, yCoord+0.5, zCoord+0.5, "Reika.RotaryCraft.flywheel", 1, pitch);
	}

	public void getType(int meta) {
		switch (meta) {
		case 0:
			maxtorque = WOODFLYTORQUEMAX;
			DECAY = 0.9975;		//added two 9's right after decimal point to each
			break;
		case 1:
			maxtorque = STONEFLYTORQUEMAX;
			DECAY = 0.99984375;
			break;
		case 2:
			maxtorque = IRONFLYTORQUEMAX;
			DECAY = 0.999609375;		//except these two
			break;
		case 3:
			maxtorque = GOLDFLYTORQUEMAX;
			DECAY = 0.999951171875;
			break;
		default:
			maxtorque = 0;
			DECAY = 0;
			break;
		}
	}

	public void getIOSides(World world, int x, int y, int z, int metadata) {
		switch(metadata) {
		case 0:
			readx = xCoord-1;
			writex = xCoord+1;
			readz = writez = zCoord;
			break;
		case 1:
			readx = xCoord+1;
			writex = xCoord-1;
			readz = writez = zCoord;
			break;
		case 2:
			readz = zCoord-1;
			writez = zCoord+1;
			readx = writex = xCoord;
			break;
		case 3:
			readz = zCoord+1;
			writez = zCoord-1;
			readx = writex = xCoord;
			break;
		}
		//ModLoader.getMinecraftInstance().thePlayer.addChatMessage(String.format("%d  %d", this.readx, this.readz));
		//ReikaWorldHelper.legacySetBlockWithNotify(world, readx, this.yCoord, readz, 49);
		//ReikaWorldHelper.legacySetBlockWithNotify(world, readx, this.yCoord+1, readz, 76);
		//ReikaWorldHelper.legacySetBlockWithNotify(world, writex, this.yCoord, writez, 4);
		ready = yCoord;
	}

	public void process(World world, int x, int y, int z) {
		omegain = 0;
		MachineRegistry m = MachineRegistry.getMachine(world, readx, yCoord, readz);
		if (m == MachineRegistry.SHAFT) {
			TileEntityShaft devicein = (TileEntityShaft)world.getBlockTileEntity(readx, y, readz);
			if (devicein.getBlockMetadata() >= 6) {
				omegain = this.readFromCross(devicein, false);
				torquein = this.readFromCross(devicein, true);
			}
			else if (devicein.writex == x && devicein.writey == y && devicein.writez == z) {
				omegain = devicein.omega;
				torquein = devicein.torque;
			}
		}
		if (m == MachineRegistry.ENGINE) {
			TileEntityEngine devicein = (TileEntityEngine)world.getBlockTileEntity(readx, ready, readz);
			if ((devicein.writex == xCoord && devicein.writez == zCoord)) {
				omegain = devicein.omega;
				torquein = devicein.torque;
			}
		}
		if (m == MachineRegistry.SPLITTER) {
			TileEntitySplitter devicein = (TileEntitySplitter)world.getBlockTileEntity(readx, ready, readz);
			if (devicein.getBlockMetadata() >= 8) {
				this.readFromSplitter(devicein);
				return;
			}
			else if (devicein.writex == xCoord && devicein.writez == zCoord) {
				omegain = devicein.omega;
				torquein = devicein.torque;
			}
		}
		if (m == MachineRegistry.CLUTCH) {
			TileEntityClutch devicein = (TileEntityClutch)world.getBlockTileEntity(readx, ready, readz);
			if (devicein.writex == xCoord && devicein.writez == zCoord) {
				omegain = devicein.omega;
				torquein = devicein.torque;
			}
		}
		if (m == MachineRegistry.DYNAMOMETER) {
			TileEntityMonitor devicein = (TileEntityMonitor)world.getBlockTileEntity(readx, ready, readz);
			if (devicein.writex == xCoord && devicein.writez == zCoord) {
				omegain = devicein.omega;
				torquein = devicein.torque;
			}
		}
		if (m == MachineRegistry.ADVANCEDGEARS) {
			TileEntityAdvancedGear devicein = (TileEntityAdvancedGear)world.getBlockTileEntity(readx, ready, readz);
			if ((devicein.writex == xCoord && devicein.writez == zCoord)) {
				omegain = devicein.omega;
				torquein = devicein.torque;
			}
		}
		if (m == MachineRegistry.WINDER) {
			TileEntityWinder devicein = (TileEntityWinder)world.getBlockTileEntity(readx, ready, readz);
			if ((devicein.writex == xCoord && devicein.writez == zCoord)) {
				omegain = devicein.omega;
				torquein = devicein.torque;
			}
		}
		if (m == MachineRegistry.GEARBOX) {
			TileEntityGearbox devicein = (TileEntityGearbox)world.getBlockTileEntity(readx, ready, readz);
			if (devicein.writex == xCoord && devicein.writez == zCoord) {
				omegain = devicein.omega;
				torquein = devicein.torque;
			}
		}
		if (m == MachineRegistry.BEVELGEARS) {
			TileEntityGearBevel devicein = (TileEntityGearBevel)world.getBlockTileEntity(readx, ready, readz);
			if (devicein.writex == xCoord && devicein.writey == yCoord && devicein.writez == zCoord) {
				omegain = devicein.omega;
				torquein = devicein.torque;
			}
		}
		if (torquein >= maxtorque/MINTORQUERATIO) {
			if (omegain > 0)
				torque = torquein;
			if (omega <= omegain) {
				omega = omegain;
			}
			else {
				omega = (int)(omega*DECAY);
				torque = (int)ReikaMathLibrary.extremad((maxtorque*DECAY), torque, "min");
			}
		}
		else {
			omega = (int)(omega*DECAY);
			torque = (int)ReikaMathLibrary.extremad((maxtorque*DECAY), torque, "min");
		}
	}

	public int readFromCross(TileEntityShaft cross, boolean torque) {
		//ModLoader.getMinecraftInstance().thePlayer.addChatMessage(String.format("%d %d %d %d", cross.writex, cross.writex2, cross.writez, cross.writez2));
		if (xCoord == cross.writex && zCoord == cross.writez) {
			if (torque)
				return cross.readtorque[0];
			return cross.readomega[0];
		}
		else if (xCoord == cross.writex2 && zCoord == cross.writez2) {
			if (torque)
				return cross.readtorque[1];
			return cross.readomega[1];
		}
		else
			return 0; //not its output
	}

	private boolean hasInputMachine(World world, int x, int y, int z) {
		if (MachineRegistry.getMachine(world, readx, yCoord, readz) == MachineRegistry.SHAFT)
			return true;
		if (MachineRegistry.getMachine(world, readx, yCoord, readz) == MachineRegistry.ENGINE)
			return true;
		if (MachineRegistry.getMachine(world, readx, yCoord, readz) == MachineRegistry.SPLITTER)
			return true;
		if (MachineRegistry.getMachine(world, readx, yCoord, readz) == MachineRegistry.CLUTCH)
			return true;
		if (MachineRegistry.getMachine(world, readx, yCoord, readz) == MachineRegistry.DYNAMOMETER)
			return true;
		if (MachineRegistry.getMachine(world, readx, yCoord, readz) == MachineRegistry.ADVANCEDGEARS)
			return true;
		if (MachineRegistry.getMachine(world, readx, yCoord, readz) == MachineRegistry.WINDER)
			return true;
		if (MachineRegistry.getMachine(world, readx, yCoord, readz) == MachineRegistry.BEVELGEARS)
			return true;
		if (MachineRegistry.getMachine(world, readx, yCoord, readz) == MachineRegistry.GEARBOX)
			return true;
		return false;
	}

	public void readFromSplitter(TileEntitySplitter spl) { //Complex enough to deserve its own function
		int ratio = spl.getRatioFromMode();
		if (ratio == 0)
			return;
		boolean favorbent = false;
		if (ratio < 0) {
			favorbent = true;
			ratio = -ratio;
		}
		if (xCoord == spl.writeinline[0] && zCoord == spl.writeinline[1]) { //We are the inline
			omegain = spl.omega; //omega always constant
			//ModLoader.getMinecraftInstance().thePlayer.addChatMessage(String.format("INLINE!  %d  %d  FOR %d", spl.omega, spl.torque, ratio));
			if (ratio == 1) { //Even split, favorbent irrelevant
				//ModLoader.getMinecraftInstance().thePlayer.addChatMessage(String.format("%d  %d", torquein, omegain));
				return;
			}
			if (favorbent) {
			}
			else {
			}
		}
		else if (xCoord == spl.writebend[0] && zCoord == spl.writebend[1]) { //We are the bend
			omegain = spl.omega; //omega always constant
			//ModLoader.getMinecraftInstance().thePlayer.addChatMessage("BEND!");
			if (ratio == 1) { //Even split, favorbent irrelevant
				return;
			}
			if (favorbent) {
			}
			else {
			}
		}
		else //We are not one of its write-to blocks
			return;
	}

	/**
	 * Writes a tile entity to NBT.
	 */
	@Override
	public void writeToNBT(NBTTagCompound NBT)
	{
		super.writeToNBT(NBT);
		NBT.setInteger("torque", torque);
		NBT.setInteger("omega", omega);
		NBT.setBoolean("failed", failed);
	}

	/**
	 * Reads a tile entity from NBT.
	 */
	@Override
	public void readFromNBT(NBTTagCompound NBT)
	{
		super.readFromNBT(NBT);
		torque = NBT.getInteger("torque");
		omega = NBT.getInteger("omega");
		failed = NBT.getBoolean("failed");
	}

	@Override
	public boolean hasModelTransparency() {
		return false;
	}

	@Override
	public RotaryModelBase getTEModel(World world, int x, int y, int z) {
		return new ModelFlywheel();
	}

	@Override
	public void animateWithTick(World world, int x, int y, int z) {
		if (!this.isInWorld()) {
			phi = 0;
			return;
		}
		phi += ReikaMathLibrary.doubpow(ReikaMathLibrary.logbase(omega+1, 2), 1.05);
	}

	@Override
	public boolean canProvidePower() {
		return true;
	}

	@Override
	public int getMachineIndex() {
		return MachineRegistry.FLYWHEEL.ordinal();
	}
}
