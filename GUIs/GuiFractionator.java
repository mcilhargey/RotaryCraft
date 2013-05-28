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

import net.minecraft.entity.player.EntityPlayer;

import org.lwjgl.opengl.GL11;

import Reika.DragonAPI.Libraries.ReikaGuiAPI;
import Reika.RotaryCraft.Base.GuiMachine;
import Reika.RotaryCraft.Containers.ContainerFractionator;
import Reika.RotaryCraft.TileEntities.TileEntityFractionator;

public class GuiFractionator extends GuiMachine
{
    private TileEntityFractionator tile;
    //private World worldObj = ModLoader.getMinecraftInstance().theWorld;
    private EntityPlayer player;
    int x;
    int y;

    public GuiFractionator(EntityPlayer player, TileEntityFractionator tilef)
    {
        super(new ContainerFractionator(player, tilef), tilef);
        tile = tilef;
        xSize = 176;
    	ySize = 166;
    	this.player = player;
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    @Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        String i = "/Reika/RotaryCraft/Textures/GUI/fractiongui.png";
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(i);
        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        this.drawTexturedModalRect(j, k, 0, 0, xSize, ySize);

        int i1 = tile.getStorageScaled(17);
        int i2 = tile.getFuelScaled(50);
        int i3 = tile.getMixScaled(30);
        if (i3 > 30)
        	i3 = 30;
        this.drawTexturedModalRect(j+64, k+25, 177, 1, i3, 38);
        this.drawTexturedModalRect(j+139, k+68-i2, 177, 95-i2, 6, i2);

        //int i1 = FractionInventory.getCookProgressScaled(48);
        //drawTexturedModalRect(j + 79, k + 34, 176, 14, 1*(i1)+1, 16);

        this.drawPowerTab(j, k);
    }

    @Override
	protected void drawPowerTab(int var5, int var6) {
    	String var4 = "/Reika/RotaryCraft/Textures/GUI/powertab.png";
    	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    	mc.renderEngine.bindTexture(var4);
    	this.drawTexturedModalRect(xSize+var5, var6+4, 0, 4, 42, ySize-4);

    	long frac = (tile.power*29L)/tile.MINPOWER;
    	if (frac > 29)
    		frac = 29;
    	this.drawTexturedModalRect(xSize+var5+5, ySize+var6-144, 0, 0, (int)frac, 4);

    	frac = tile.omega*29L/tile.MINSPEED;
    	if (frac > 29)
    		frac = 29;
    	this.drawTexturedModalRect(xSize+var5+5, ySize+var6-84, 0, 0, (int)frac, 4);

    	frac = tile.torque*29L/tile.MINTORQUE;
    	if (frac > 29)
    		frac = 29;
    	this.drawTexturedModalRect(xSize+var5+5, ySize+var6-24, 0, 0, (int)frac, 4);

    	ReikaGuiAPI.instance.drawCenteredStringNoShadow(fontRenderer, "Power:", xSize+var5+20, var6+9, 0xff000000);
    	ReikaGuiAPI.instance.drawCenteredStringNoShadow(fontRenderer, "Speed:", xSize+var5+20, var6+69, 0xff000000);
    	ReikaGuiAPI.instance.drawCenteredStringNoShadow(fontRenderer, "Torque:", xSize+var5+20, var6+129, 0xff000000);
    	//this.drawCenteredStringNoShadow(fontRenderer, String.format("%d/%d", tile.power, tile.MINPOWER), xSize+var5+16, var6+16, 0xff000000);
    }
}
