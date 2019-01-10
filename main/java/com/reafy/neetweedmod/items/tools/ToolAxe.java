package com.reafy.neetweedmod.items.tools;

import com.reafy.neetweedmod.Main;
import com.reafy.neetweedmod.init.ModItems;
import com.reafy.neetweedmod.util.IHasModel;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel{
	
	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 10.0F, -3.2F);
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
