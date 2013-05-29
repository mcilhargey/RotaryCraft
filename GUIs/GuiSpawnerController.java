/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.GUIs;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.entity.player.EntityPlayer;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import Reika.DragonAPI.ImagedGuiButton;
import Reika.DragonAPI.Base.CoreContainer;
import Reika.DragonAPI.Libraries.ReikaPacketHelper;
import Reika.RotaryCraft.RotaryCraft;
import Reika.RotaryCraft.Base.GuiPowerOnlyMachine;
import Reika.RotaryCraft.TileEntities.TileEntitySpawnerController;

public class GuiSpawnerController extends GuiPowerOnlyMachine
{

	private int timer;
	private boolean disabled;

    private TileEntitySpawnerController spawnercontroller;
    //private World worldObj = ModLoader.getMinecraftInstance().theWorld;
    private EntityPlayer player;
    int x;
    int y;
    private GuiTextField input;
    boolean hasPower;

    public GuiSpawnerController(EntityPlayer player, TileEntitySpawnerController tile)
    {
        super(new CoreContainer(player, tile), tile);
        spawnercontroller = tile;
    	ySize = 75;
    	this.player = player;
    	timer = spawnercontroller.setDelay;
    	disabled = spawnercontroller.disable;
    	hasPower = (spawnercontroller.power >= spawnercontroller.machine.getMinPower());
    }

    @Override
    public void initGui() {
    	buttonList.clear();
        int j = (width - xSize) / 2+8;
        int k = (height - ySize) / 2 - 12;
        if (hasPower) {
	        buttonList.add(new GuiButton(0, j+xSize/2-48, -1+k+32, 80, 20, "Disable/Enable"));
	        input = new GuiTextField(fontRenderer, j+xSize/2-7, k+59, 26, 16);
	        input.setFocused(false);
	        input.setMaxStringLength(3);
        }
    }

    @Override
	public void keyTyped(char c, int i){
    	super.keyTyped(c, i);
    	if (hasPower)
    		input.textboxKeyTyped(c, i);
    }

    @Override
	public void mouseClicked(int i, int j, int k){
    	super.mouseClicked(i, j, k);
    	if (hasPower)
    		input.mouseClicked(i, j, k);
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
    	if (button.id == 0) {
    		if (spawnercontroller.disable)
    			disabled = false;
    		else
    			disabled = true;
    	}
    	int dat;
    	if (disabled)
    		dat = -1;
    	else
    		dat = timer;
    	ReikaPacketHelper.sendPacket(RotaryCraft.packetChannel, 8, spawnercontroller, player, dat);
    }

    @Override
	public void updateScreen() {
    	super.updateScreen();
    	x = Mouse.getX();
    	y = Mouse.getY();
    	if (hasPower) {
	    	if (input.getText().isEmpty()) {
	    		return;
	    	}
	    	if (!(input.getText().matches("^[0-9 ]+$"))) {
	    		timer = spawnercontroller.BASEDELAY;
	    		input.deleteFromCursor(-1);
	        	int dat;
	        	if (disabled)
	        		dat = -1;
	        	else
	        		dat = timer;
	        	ReikaPacketHelper.sendPacket(RotaryCraft.packetChannel, 8, spawnercontroller, player, dat);
	    		return;
	    	}
	    	//ModLoader.getMinecraftInstance().thePlayer.addChatMessage("435");
	    	//System.out.println(input.getText());
	    	timer = Integer.parseInt(input.getText());
	    	int dat;
	    	if (disabled)
	    		dat = -1;
	    	else
	    		dat = timer;
	    	if (timer >= 0)
	    		ReikaPacketHelper.sendPacket(RotaryCraft.packetChannel, 8, spawnercontroller, player, dat);
    	}
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    @Override
	protected void drawGuiContainerForegroundLayer(int a, int b)
    {
        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        //fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, (ySize - 96) + 2, 4210752);
        fontRenderer.drawString("Spawner Controller", j+xSize/2-48, k+5, 4210752);
        if (hasPower) {
	        int color = 4210752;
	        if (disabled)
	        	color = 0xcccccc;
	        fontRenderer.drawString("Spawn Delay:", j+xSize/2-64, k+51, color);
	        if (!input.isFocused() && !disabled) {
	        	fontRenderer.drawString(String.format("%d", spawnercontroller.setDelay), j+xSize/2+5, k+51, 0xffffffff);
	        }
        }
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    @Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        String i = "/Reika/RotaryCraft/Textures/GUI/spawnercontrollergui.png";
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(i);
        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        int v = 0;
        if (!hasPower)
        	v = ySize;
        this.drawTexturedModalRect(j, k, 0, v, xSize, ySize);

        if (hasPower) {
        	if (!disabled)
	        	input.drawTextBox();
	        int color = 4210752;
	        if (timer < spawnercontroller.getMinDelay())
	        	color = 0xff0000;
	        if (disabled) {
	        	color = 0xaaaaaa;
	        	ImagedGuiButton.drawCenteredStringNoShadow(fontRenderer, "Infinity", j+xSize/2+28, k+51, color);
	        }
	        else
	        	ImagedGuiButton.drawCenteredStringNoShadow(fontRenderer, String.format("(%d)", spawnercontroller.getDelay()), j+xSize/2+58, k+51, color);
        }

        this.drawPowerTab(j, k);
    }

}