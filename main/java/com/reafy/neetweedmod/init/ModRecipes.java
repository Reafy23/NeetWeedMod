package com.reafy.neetweedmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModItems.NAPOWDER_BOTTLE, new ItemStack(ModItems.NAGAS_BOTTLE, 1), 1.5F);
	}

}
