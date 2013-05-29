/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.Blocks;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import Reika.RotaryCraft.Base.BlockBasicMachine;
import Reika.RotaryCraft.TileEntities.TileEntityGPR;

public class BlockGPR extends BlockBasicMachine {

	public BlockGPR(int blockID, Material mat) {
		super(blockID, mat);
		//this.blockIndexInTexture = 81;
	}

	public int getBlockTextureFromSideAndMetadata(int s, int dmg) {
		 // We want the texture next to our default texture from this block for the bottom and top side
		 // so we just add 1 when the side is 0 or 1 else we return the default one
        if (s == 1)
            return 82;
        if (s == 0)
        	return 83;
        return 81;
	}

    /**
     * Returns the TileEntity used by this block.
     */
    @Override
	public TileEntity createNewTileEntity(World world)
    {
        return new TileEntityGPR();
    }

    @Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving par5EntityLiving, ItemStack is)		//Directional code
    {
    	//if (MathHelper.abs(par5EntityLiving.rotationPitch) < 45) {
	        int i = MathHelper.floor_double((par5EntityLiving.rotationYaw * 4F) / 360F + 0.5D);
	        while (i > 3)
	        	i -= 4;
	        while (i < 0)
	        	i += 4;
	        getBiomeDesign(world, x, y, z);
	        int meta = world.getBlockMetadata(x, y, z);
	        TileEntityGPR tile = (TileEntityGPR)world.getBlockTileEntity(x, y, z);
	        if (tile == null)
	        	return;
	        switch (i) {
	        case 0:
	        case 2:
	            tile.xdir = true;
	        break;
	        case 1:
	        case 3:
	        	tile.xdir = false;
	        break;
	        }
    }

	public static int getBiomeDesign(World world, int x, int y, int z) {
        BiomeGenBase biome = world.getBiomeGenForCoords(x, z);
        if (biome == BiomeGenBase.forest || biome == BiomeGenBase.forestHills || biome == BiomeGenBase.plains)
        	return 0;
        else if (biome == BiomeGenBase.mushroomIsland || biome == BiomeGenBase.mushroomIslandShore)
        	return 1;
        else if (biome == BiomeGenBase.jungle || biome == BiomeGenBase.jungleHills)
        	return 2;
        else if (biome == BiomeGenBase.extremeHills || biome == BiomeGenBase.extremeHillsEdge)
        	return 3;
        else if (biome == BiomeGenBase.ocean || biome == BiomeGenBase.river)
        	return 4;
        else if (biome == BiomeGenBase.beach || biome == BiomeGenBase.desert || biome == BiomeGenBase.desertHills)
        	return 5;
        else if (biome == BiomeGenBase.taiga || biome == BiomeGenBase.taigaHills || biome == BiomeGenBase.iceMountains || biome == BiomeGenBase.icePlains)
        	return 6;
        else if (biome == BiomeGenBase.hell)
        	return 7;
        else if (biome == BiomeGenBase.sky)
        	return 8;
        else if (biome == BiomeGenBase.swampland)
        	return 9;
        else if (biome == BiomeGenBase.frozenOcean || biome == BiomeGenBase.frozenRiver)
        	return 10;
        else
        	return 0;
	}

	@Override
	public Icon getIcon(int s, int meta) {
		return icons[meta][s];
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 11; j++) {
				String biome;
				switch(j) {
				case 0:
					biome = "grass";
				break;
				case 1:
					biome = "mushroom";
				break;
				case 2:
					biome = "jungle";
				break;
				case 3:
					biome = "hills";
				break;
				case 4:
					biome = "ocean";
				break;
				case 5:
					biome = "desert";
				break;
				case 6:
					biome = "snow";
				break;
				case 7:
					biome = "nether";
				break;
				case 8:
					biome = "end";
				break;
				case 9:
					biome = "swamp";
				break;
				case 10:
					biome = "ice";
				break;
				default:
					biome = "";
				}
				icons[j][i] = par1IconRegister.registerIcon("RotaryCraft:steel");
				icons[j][1] = par1IconRegister.registerIcon("RotaryCraft:gpr_top_"+biome);
			}
	}
}