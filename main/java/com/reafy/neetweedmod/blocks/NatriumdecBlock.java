package com.reafy.neetweedmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class NatriumdecBlock extends BlockBase
{

	/**
	 * @param name
	 * @param material
	 */
	public NatriumdecBlock(String name, Material material)
	{
		super(name, material);		
		setSoundType(SoundType.METAL);
		setHardness(3.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(5.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

}
