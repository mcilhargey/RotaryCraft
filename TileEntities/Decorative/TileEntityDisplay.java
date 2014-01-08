/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.TileEntities.Decorative;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import Reika.DragonAPI.Base.OneSlotMachine;
import Reika.DragonAPI.Interfaces.GuiController;
import Reika.DragonAPI.Libraries.Registry.ReikaDyeHelper;
import Reika.RotaryCraft.Auxiliary.Interfaces.InertIInv;
import Reika.RotaryCraft.Base.TileEntity.TileEntitySpringPowered;
import Reika.RotaryCraft.Registry.MachineRegistry;
import Reika.RotaryCraft.Renders.M.RenderDisplay;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityDisplay extends TileEntitySpringPowered implements InertIInv, GuiController, OneSlotMachine {

	private float scroll;
	private int[] rgb = new int[3];
	private int[] Brgb = new int[3];
	private static final int[] ArRGB = {0, 128, 255};
	private static final int[] ArBRGB = {0, 255, 255};
	private String message = "";
	public static final int displayHeight = 12; //in lines
	public static final int displayWidth = 27; //in chars
	public static final int lineHeight = 12;
	public static final int charWidth = 10;

	private boolean display;

	@Override
	public void animateWithTick(World world, int x, int y, int z) {
		if (this.getMessageLength() <= displayHeight)
			return;
		scroll += 0.05F;
		if (scroll > this.getMessageLength())
			scroll = 0;
	}

	@Override
	public int getMachineIndex() {
		return MachineRegistry.DISPLAY.ordinal();
	}

	@Override
	public boolean hasModelTransparency() {
		return false;
	}

	@Override
	public int getRedstoneOverride() {
		return 0;
	}

	@Override
	public void updateEntity(World world, int x, int y, int z, int meta) {
		this.updateCoil();
		tickcount++;
	}

	private void updateCoil() {
		if (!this.hasCoil()) {
			display = false;
			return;
		}
		display = true;
		tickcount++;
		if (tickcount > this.getUnwindTime()) {
			ItemStack is = this.getDecrementedCharged();
			inv[0] = is;
			tickcount = 0;
		}
	}

	public boolean canDisplay() {
		return display;
	}

	public boolean hasList() {
		if (message == null)
			return false;
		if (message.isEmpty())
			return false;
		return true;
	}

	public int getMessageLength() {
		return message.length();
	}

	public float getScrollPos() {
		return scroll;
	}

	public boolean isReadyToLoadNewLine() {
		float frac = scroll-(int)scroll;
		return frac >= 0.5F;
	}

	public int getRoundedScroll() {
		float frac = scroll-(int)scroll;
		if (frac >= 0.5F)
			return (int)(scroll)+1;
		else
			return (int)(scroll);
	}

	@Override
	public AxisAlignedBB getRenderBoundingBox() {
		return INFINITE_EXTENT_AABB;
	}

	public boolean hasSpace() {
		World world = worldObj;
		int x = xCoord;
		int y = yCoord;
		int z = zCoord;
		int meta = this.getBlockMetadata();
		for (int j = -2; j <= 2; j++) {
			int a = 0;
			int b = 0;
			if (meta == 0 || meta == 1)
				b = j;
			else
				a = j;
			for (int i = 1; i <= 3; i++) {
				if (world.getBlockId(x+a, y+i, z+b) != 0)
					return false;
			}
		}
		return true;
	}

	public int getRed() {
		return rgb[0];
	}

	public int getGreen() {
		return rgb[1];
	}

	public int getBlue() {
		return rgb[2];
	}

	public int getBorderRed() {
		return Brgb[0];
	}

	public int getBorderGreen() {
		return Brgb[1];
	}

	public int getBorderBlue() {
		return Brgb[2];
	}

	public int getTextColor() {
		return 0xffffff;
	}

	public void setMessage(String str) {
		if (this.getSide() == Side.CLIENT)
			((RenderDisplay)this.getRenderer()).resetCache();
		message = str;
	}

	public void clearMessage() {
		if (this.getSide() == Side.CLIENT)
			((RenderDisplay)this.getRenderer()).resetCache();
		message = "";
	}

	public void setColor(ReikaDyeHelper dye) {
		int r = dye.getRed();
		int g = dye.getGreen();
		int b = dye.getBlue();
		rgb[0] = r;
		rgb[1] = g;
		rgb[2] = b;
		Brgb[0] = r;
		Brgb[1] = g;
		Brgb[2] = b;
	}

	/**
	 * Writes a tile entity to NBT.
	 */
	@Override
	public void writeToNBT(NBTTagCompound NBT)
	{
		super.writeToNBT(NBT);
		NBT.setIntArray("color", rgb);
		NBT.setIntArray("Bcolor", Brgb);

		NBT.setString("msg", message);
	}

	/**
	 * Reads a tile entity from NBT.
	 */
	@Override
	public void readFromNBT(NBTTagCompound NBT)
	{
		super.readFromNBT(NBT);
		//ReikaJavaLibrary.pConsole(Arrays.toString(NBT.getIntArray("Bcolor")));
		rgb = NBT.getIntArray("color");
		Brgb = NBT.getIntArray("Bcolor");

		message = NBT.getString("msg");
	}

	public void setColorToArgon() {
		rgb[0] = ArRGB[0];
		rgb[1] = ArRGB[1];
		rgb[2] = ArRGB[2];
		Brgb[0] = ArBRGB[0];
		Brgb[1] = ArBRGB[1];
		Brgb[2] = ArBRGB[2];
	}

	@SideOnly(Side.CLIENT)
	public List<String> getMessageForDisplay() {
		FontRenderer f = Minecraft.getMinecraft().fontRenderer;
		return f.listFormattedStringToWidth(message, displayWidth*f.FONT_HEIGHT);
	}

	@Override
	public int getBaseDischargeTime() {
		return 120;
	}
}