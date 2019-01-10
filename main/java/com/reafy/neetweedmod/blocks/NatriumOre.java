package com.reafy.neetweedmod.blocks;

import java.util.Random;

import com.reafy.neetweedmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class NatriumOre extends BlockBase {
	
	public NatriumOre(String name, Material material) {
		super(name,material);
		setSoundType(SoundType.METAL);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.NATRIUM_INGOT;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		//return 3;
		int max = 3;
		int min = 1;
		return rand.nextInt(max) + min;
		
	}
}
