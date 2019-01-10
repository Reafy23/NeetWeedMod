package com.reafy.neetweedmod.items;

import com.reafy.neetweedmod.Main;

import net.minecraft.item.ItemStack;

public class RaspItem extends ItemBase {
	
	public RaspItem(String name) {
		super(name);
		setCreativeTab(Main.neetweedmod);
		setMaxStackSize(1);
		setMaxDamage(5);
		setNoRepair();
	}
		@Override
	    public boolean hasContainerItem() 
	    {
	        return true;
	    }
		
		@Override
		public ItemStack getContainerItem(ItemStack itemStack) 
	    {
			return itemStack.getItemDamage() < itemStack.getMaxDamage() ? new ItemStack(itemStack.getItem(), 1, itemStack.getItemDamage() + 1) : ItemStack.EMPTY;
	    }

}
