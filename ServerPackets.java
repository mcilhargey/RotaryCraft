/*******************************************************************************
 * @author Reika
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet250CustomPayload;


public class ServerPackets extends PacketHandlerCore {

	@Override
	public void process(Packet250CustomPayload packet, EntityPlayer ep) {
		world = ep.worldObj;
		this.handleData(packet, world);
	}

}
