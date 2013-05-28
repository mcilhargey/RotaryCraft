/*******************************************************************************
 * @author Reika
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.GUIs;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.packet.Packet250CustomPayload;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import Reika.DragonAPI.ImagedGuiButton;
import Reika.DragonAPI.Base.CoreContainer;
import Reika.DragonAPI.Libraries.ReikaGuiAPI;
import Reika.RotaryCraft.Base.GuiMachine;
import Reika.RotaryCraft.TileEntities.TileEntityBorer;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.relauncher.Side;

public class GuiBorer extends GuiMachine
{
	public String dropstatus;
	public boolean drops;
	public int mode;

	private TileEntityBorer borer;
	//private World worldObj = ModLoader.getMinecraftInstance().theWorld;
	private EntityPlayer player;
	int x;
	int y;
	private boolean[][] dig = new boolean[7][5];
	private int packetID;

	public GuiBorer(EntityPlayer player, TileEntityBorer Borer)
	{
		super(new CoreContainer(player, Borer), Borer);
		borer = Borer;
		ySize = 148;
		xSize = 176;
		dropstatus = "Drops On";
		this.player = player;
		drops = borer.drops;
		mode = borer.mode;
		for (int i = 0; i < 7; i++)
			for (int l = 0; l < 5; l++)
				dig[i][l] = Borer.cutShape[i][l];
	}

	@Override
	public void initGui() {
		buttonList.clear();
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;/*
            this.buttonList.add(new GuiButton(0, j+8, -1+k+32, 72, 20, "1x1 Square"));
            this.buttonList.add(new GuiButton(1, j+8, -1+k+52, 72, 20, "1x2 Hallway"));
            this.buttonList.add(new GuiButton(2, j+8, -1+k+72, 72, 20, "2x2 Square"));
            this.buttonList.add(new GuiButton(3, j+8, -1+k+92, 72, 20, "3x3 Square"));
            this.buttonList.add(new GuiButton(4, j+8, -1+k+112, 72, 20, "5x5 Circle"));
            this.buttonList.add(new GuiButton(5, j+8, -1+k+132, 72, 20, "7x4 Archway"));
            this.buttonList.add(new GuiButton(6, j+8, -1+k+152, 72, 20, "4x4 Tunnel"));*/

		String file = "/Reika/RotaryCraft/Textures/GUI/buttons.png";
		for (int i = 0; i < 7; i++)
			for (int l = 0; l < 5; l++) {
				int u = 0;
				if (i == 3 && l == 4)
					u = 36;
				if (dig[i][l])
					buttonList.add(new ImagedGuiButton(50+i+7*l, j+25+18*i, k+16+18*l, 18, 18, "", u, 0, 0, false, file));
				else
					buttonList.add(new ImagedGuiButton(10+i+7*l, j+25+18*i, k+16+18*l, 18, 18, "", u+18, 0, 0, false, file));
			}

		buttonList.add(new GuiButton(8, j+14, -1+k+116, 72, 20, "Reset Pos'n"));

		if (drops)
			buttonList.add(new GuiButton(7, j+90, -1+k+116, 72, 20, "Drops On"));
		else
			buttonList.add(new GuiButton(7, j+90, -1+k+116, 72, 20, "Drops Off"));
	}

	public void toggleDrops() {
		if (drops) {
			dropstatus = "Drops Off";
			drops = false;
		}
		else {
			dropstatus = "Drops On";
			drops = true;
		}

		this.sendPacket(1);
	}

	public void updateMode(int mode) {
		borer.mode = (byte)mode;
	}

	/**
	 * Returns true if this GUI should pause the game when it is displayed in single-player
	 */
	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}

	@Override
	public void actionPerformed(GuiButton button) {
		if (button.id == 7) {
			this.toggleDrops();
		}
		if (button.id == 8)
			this.sendPacket(3);
		if (button.id < 7) {
			//this.updateMode(button.id);
			mode = button.id;
			this.sendPacket(2);
		}
		if (button.id >= 10 && button.id < 50) {
			int rows = (button.id-10)/7;
			int cols = (button.id-10)-rows*7;
			//ModLoader.getMinecraftInstance().thePlayer.addChatMessage(String.format("%d -> row %d col %d", button.id, rows, cols));
			dig[cols][rows] = true;
			packetID = (button.id-10);
			if (button.id == 10)
				packetID = 100;
			this.sendPacket(0);
		}
		if (button.id >= 50) {
			int rows = (button.id-50)/7;
			int cols = (button.id-50)-rows*7;
			//ModLoader.getMinecraftInstance().thePlayer.addChatMessage(String.format("%d -> row %d col %d", button.id, rows, cols));
			dig[cols][rows] = false;
			packetID = (button.id-50);
			if (button.id == 50)
				packetID = 100;
			this.sendPacket(0);
		}
		this.updateScreen();

	}

	public void sendPacket(int a) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream(20); // 5 ints
		DataOutputStream outputStream = new DataOutputStream(bos);
		try {
			//ModLoader.getMinecraftInstance().thePlayer.addChatMessage(String.valueOf(drops));
			outputStream.writeInt(a);
			if (a == 1) {
				if (drops)
					outputStream.writeInt(1); //set drops to 0 (false)
				else
					outputStream.writeInt(0);
				//ModLoader.getMinecraftInstance().thePlayer.addChatMessage(String.valueOf(drops));
			}
			if (a == 2)
				outputStream.writeInt(mode);
			if (a > 2)
				outputStream.writeInt(-1);
			if (a == 0) {
				//ModLoader.getMinecraftInstance().thePlayer.addChatMessage(String.valueOf(3434));
				int rows = packetID/7;
				int cols = packetID-rows*7;
				if (packetID == 100) {
					rows = cols = 0;
				}
				//ModLoader.getMinecraftInstance().thePlayer.addChatMessage(String.format("%d -> row %d col %d", this.packetID, rows, cols));
				if (dig[cols][rows])
					outputStream.writeInt(-1*packetID);
				else
					outputStream.writeInt(packetID);
			}
			outputStream.writeInt(borer.xCoord);
			outputStream.writeInt(borer.yCoord);
			outputStream.writeInt(borer.zCoord);

		}
		catch (Exception ex) {
			ex.printStackTrace();
		}

		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = "RotaryCraftData";
		packet.data = bos.toByteArray();
		packet.length = bos.size();

		Side side = FMLCommonHandler.instance().getEffectiveSide();
		if (side == Side.SERVER) {
			// We are on the server side.
			EntityPlayerMP player2 = (EntityPlayerMP) player;
		} else if (side == Side.CLIENT) {
			// We are on the client side.
			EntityClientPlayerMP player2 = (EntityClientPlayerMP) player;
			PacketDispatcher.sendPacketToServer(packet);
		} else {
			// We are on the Bukkit server.
		}
		this.updateScreen();
	}

	@Override
	public void updateScreen() {
		super.updateScreen();
		x = Mouse.getX();
		y = Mouse.getY();
		this.initGui();
	}

    @Override
	protected void drawGuiContainerForegroundLayer(int a, int b)
    {
        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        ReikaGuiAPI.instance.drawCenteredStringNoShadow(fontRenderer, tile.getName(), j+xSize/2, k+5, 4210752);
    }

	/**
	 * Draw the background layer for the GuiContainer (everything behind the items)
	 */
	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
	{
		String i = "/Reika/RotaryCraft/Textures/GUI/borergui2.png";
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(i);
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		this.drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
		/*
        for (int i5 = 0; i5 < 7; i5++)
        	for (int l = 0; l < 5; l++)
        		if (this.dig[i5][l])
        			this.drawRect(5+i5*5, 5+l*5, 10+i5*5, 10+l*5, 0xffffffff);
        		else
        			this.drawRect(5+i5*5, 5+l*5, 10+i5*5, 10+l*5, 0xff000000);*/

		//int i1 = borerInventory.getCookProgressScaled(48);
		//drawTexturedModalRect(j + 79, k + 34, 176, 14, 1*(i1)+1, 16);

		this.drawPowerTab(j, k);
	}

	@Override
	protected void drawPowerTab(int var5, int var6) {
		String var4 = "/Reika/RotaryCraft/Textures/GUI/powertab.png";
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(var4);
		this.drawTexturedModalRect(xSize+var5-13, var6, 127, 4, 42, ySize);

		long frac = ((borer.power*29L)/borer.MINPOWER);
		if (frac > 29)
			frac = 29;
		this.drawTexturedModalRect(xSize+var5+5-13, ySize+var6-132, 0, 0, (int)frac, 4);

		frac = borer.omega*29L/borer.MINSPEED;
		if (frac > 29)
			frac = 29;
		this.drawTexturedModalRect(xSize+var5+5-13, ySize+var6-73, 0, 0, (int)frac, 4);

		frac = borer.torque*29L/borer.MINTORQUE;
		if (frac > 29)
			frac = 29;
		this.drawTexturedModalRect(xSize+var5+5-13, ySize+var6-14, 0, 0, (int)frac, 4);

		ReikaGuiAPI.instance.drawCenteredStringNoShadow(fontRenderer, "Power:", xSize+var5+20-13, var6+4, 0xff000000);
		ReikaGuiAPI.instance.drawCenteredStringNoShadow(fontRenderer, "Speed:", xSize+var5+20-13, var6+63, 0xff000000);
		ReikaGuiAPI.instance.drawCenteredStringNoShadow(fontRenderer, "Torque:", xSize+var5+20-13, var6+122, 0xff000000);
		//this.drawCenteredStringNoShadow(fontRenderer, String.format("%d/%d", borer.power, borer.MINPOWER), xSize+var5+16, var6+16, 0xff000000);
	}

}
