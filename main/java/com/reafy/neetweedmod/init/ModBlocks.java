package com.reafy.neetweedmod.init;

import java.util.ArrayList;
import java.util.List;

import com.reafy.neetweedmod.blocks.BlockBase;
import com.reafy.neetweedmod.blocks.NatriumOre;
import com.reafy.neetweedmod.blocks.NatriumdecBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	
public static final List<Block> BLOCKS = new ArrayList<Block>();

public static final Block NATRIUMDEC_BLOCK = new NatriumdecBlock("natriumdec_block", Material.IRON);
public static final Block NATRIUM_ORE = new NatriumOre("natrium_ore", Material.ROCK);

}
