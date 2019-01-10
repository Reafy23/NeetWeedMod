package com.reafy.neetweedmod.items.tools;

import com.reafy.neetweedmod.Main;
import com.reafy.neetweedmod.init.ModItems;
import com.reafy.neetweedmod.util.IHasModel;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel {
	
	public ToolHoe(String name, ToolMaterial material)
	{
		super(material);
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
