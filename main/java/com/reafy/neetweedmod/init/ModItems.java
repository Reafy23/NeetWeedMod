package com.reafy.neetweedmod.init;

import java.util.ArrayList;
import java.util.List;

import com.reafy.neetweedmod.items.ItemBase;
import com.reafy.neetweedmod.items.RaspItem;
import com.reafy.neetweedmod.items.armor.ArmorBase;
import com.reafy.neetweedmod.items.tools.ToolAxe;
import com.reafy.neetweedmod.items.tools.ToolHoe;
import com.reafy.neetweedmod.items.tools.ToolPickaxe;
import com.reafy.neetweedmod.items.tools.ToolSpade;
import com.reafy.neetweedmod.items.tools.ToolSword;
import com.reafy.neetweedmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	
	public static final ToolMaterial MATERIAL_NATRIUMPOWERINGOT = EnumHelper.addToolMaterial("material_natriumpoweringot", 3, 250, 10.0F, 5.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_NATRIUM = EnumHelper.addArmorMaterial("armor_material_natrium", Reference.MOD_ID + "natrium", 13, 
			new int[] {5, 8, 11, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	//Items		
	
	public static final Item COTTON_PAD = new ItemBase("cotton_pad");
	public static final Item UNIVERSAL_SEED = new ItemBase("universal_seed");
	public static final Item WHITE_WIDOW = new ItemBase("white_widow");
	public static final Item SUPER_SKUNK = new ItemBase("super_skunk");
	public static final Item NATRIUM_INGOT = new ItemBase("natrium_ingot");
	public static final Item RASP = new RaspItem("rasp");
	public static final Item NATRIUM_POWDER = new ItemBase("natrium_powder");
	public static final Item NAPOWDER_BOTTLE = new ItemBase("napowder_bottle");
	public static final Item NAGAS_BOTTLE = new ItemBase("nagas_bottle");
	public static final Item NATRIUMPOWER_INGOT = new ItemBase("natriumpower_ingot");
	
	//Tools
	public static final ItemSword NATRIUMPOWER_SWORD = new ToolSword("natriumpower_sword", MATERIAL_NATRIUMPOWERINGOT);
	public static final ItemSpade NATRIUMPOWER_SHOVEL = new ToolSpade("natriumpower_shovel", MATERIAL_NATRIUMPOWERINGOT);
	public static final ItemPickaxe NATRIUMPOWER_PICKAXE = new ToolPickaxe("natriumpower_pickaxe", MATERIAL_NATRIUMPOWERINGOT);
	public static final ItemAxe NATRIUMPOWER_AXE = new ToolAxe("natriumpower_axe", MATERIAL_NATRIUMPOWERINGOT);
	public static final ItemHoe NATRIUMPOWER_HOE = new ToolHoe("natriumpower_hoe", MATERIAL_NATRIUMPOWERINGOT);
	
	//Armor
	public static final Item NATRIUM_HELMET = new ArmorBase("natrium_helmet", ARMOR_MATERIAL_NATRIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item NATRIUM_CHESTPLATE = new ArmorBase("natrium_chestplate", ARMOR_MATERIAL_NATRIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item NATRIUM_LEGGINS = new ArmorBase("natrium_leggins", ARMOR_MATERIAL_NATRIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item NATRIUM_BOOTS = new ArmorBase("natrium_boots", ARMOR_MATERIAL_NATRIUM, 1, EntityEquipmentSlot.FEET);
}
