package com.reafy.neetweedmod.Tabs;

import com.reafy.neetweedmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class NeetWeedMod extends CreativeTabs
{
	public NeetWeedMod(String label) { super("neetweedmod");
	this.setBackgroundImageName("neetweedmod.png"); }
    public ItemStack getTabIconItem() { return new ItemStack(ModItems.NATRIUM_INGOT);}
}
	
