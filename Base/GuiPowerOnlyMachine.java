/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.Base;

import net.minecraft.inventory.Container;

import org.lwjgl.opengl.GL11;

import Reika.DragonAPI.Libraries.ReikaGuiAPI;

public abstract class GuiPowerOnlyMachine extends GuiMachine {

	TileEntityPowerReceiver tile;

	public GuiPowerOnlyMachine(Container par1Container, TileEntityPowerReceiver te) {
		super(par1Container, te);
		tile = te;
	}

    @Override
	protected final void drawPowerTab(int var5, int var6) {
    	String var4 = "/Reika/RotaryCraft/Textures/GUI/powertab.png";
    	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    	mc.renderEngine.bindTexture(var4);
    	this.drawTexturedModalRect(xSize+var5, var6+4, 0, 4, 42, 24);
    	this.drawTexturedModalRect(xSize+var5, var6+4+23, 0, 157, 42, 6);

    	long frac = (tile.power*29L)/tile.MINPOWER;
    	if (frac > 29)
    		frac = 29;
    	this.drawTexturedModalRect(xSize+var5+5, ySize+var6-53-(ySize-75), 0, 0, (int)frac, 4);

    	ReikaGuiAPI.instance.drawCenteredStringNoShadow(fontRenderer, "Power:", xSize+var5+20, var6+9, 0xff000000);
    	//this.drawCenteredStringNoShadow(fontRenderer, String.format("%d/%d", spawnercontroller.power, spawnercontroller.MINPOWER), xSize+var5+16, var6+16, 0xff000000);
    }

}
