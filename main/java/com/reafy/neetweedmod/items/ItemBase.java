package com.reafy.neetweedmod.items;

import com.reafy.neetweedmod.Main;
import com.reafy.neetweedmod.init.ModItems;
import com.reafy.neetweedmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	/**
	 * @param name
	 */
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.neetweedmod);
		
		ModItems.ITEMS.add(this);
	} 

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
