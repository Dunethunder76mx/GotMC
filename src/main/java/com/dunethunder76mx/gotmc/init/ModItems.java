package com.dunethunder76mx.gotmc.init;

import java.util.ArrayList;
import java.util.List;

import com.dunethunder76mx.gotmc.items.ItemBase;
import com.dunethunder76mx.gotmc.items.MiscBase;
import com.dunethunder76mx.gotmc.items.armor.ArmorBase;
import com.dunethunder76mx.gotmc.items.food.FoodBase;
import com.dunethunder76mx.gotmc.items.food.SoupBase;
import com.dunethunder76mx.gotmc.items.food.StoneSoupBase;
import com.dunethunder76mx.gotmc.items.tools.ToolAxe;
import com.dunethunder76mx.gotmc.items.tools.ToolBattleaxe;
import com.dunethunder76mx.gotmc.items.tools.ToolDagger;
import com.dunethunder76mx.gotmc.items.tools.ToolHoe;
import com.dunethunder76mx.gotmc.items.tools.ToolIronBattleaxe;
import com.dunethunder76mx.gotmc.items.tools.ToolLongsword;
import com.dunethunder76mx.gotmc.items.tools.ToolPickaxe;
import com.dunethunder76mx.gotmc.items.tools.ToolSpade;
import com.dunethunder76mx.gotmc.items.tools.ToolStory;
import com.dunethunder76mx.gotmc.items.tools.ToolStoryDagger;
import com.dunethunder76mx.gotmc.items.tools.ToolSword;
import com.dunethunder76mx.gotmc.items.tools.ToolTrainingBattleaxe;
import com.dunethunder76mx.gotmc.util.Reference;

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

	public static final List<Item> ITEMS = new ArrayList<Item> ();
	
	//Materials
	public static final ToolMaterial MATERIAL_STEEL_INGOT = EnumHelper.addToolMaterial("material__steel_ingot", 2, 550, 6.5F, 3.0F, 14);
	public static final ToolMaterial MATERIAL_NEEDLE = EnumHelper.addToolMaterial("material_dragonstone_steel_ingot", 2, 1200, 3.0F, 5.0F, 15);
	public static final ToolMaterial MATERIAL_DRAGONGLASS = EnumHelper.addToolMaterial("material_dragonglass", 1, 75, 1.0F, 1.0F, 20);
	public static final ToolMaterial MATERIAL_TRAINING = EnumHelper.addToolMaterial("material_training", 1, 450, 0.5F, -1.5F, 5);
	public static final ToolMaterial MATERIAL_DRAGONSTONE_BATTLEAXE = EnumHelper.addToolMaterial("material_dragonstone_battleaxe", 0, 550, 1.5F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_DRAGONSTONE_LONGSWORD = EnumHelper.addToolMaterial("material_dragonstone_longsword", 0, 550, 1.0F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_BRAAVOS_RAPIER = EnumHelper.addToolMaterial("material_braavos_rapier", 0, 400, 1.0F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_CATSPAW_DAGGER = EnumHelper.addToolMaterial("matertial_catspaw_dagger", 0, 10000, 1.0F, 2.0F, 20);
	public static final ToolMaterial MATERIAL_IRON_BATTLEAXE = EnumHelper.addToolMaterial("material_iron_battleaxe", 0, 250, 1.5F, 2.0F, 14);
	
	
	//Armor Materials
	public static final ArmorMaterial DRAGONSTONE_CHAINMAIL = EnumHelper.addArmorMaterial("dragonstone_chainmail", Reference.MOD_ID, 20, new int [] {7, 8, 8, 9} , 14, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0f);
	
	//Materials (ItemBase)
	public static final Item DRAGONSTONE_STEEL_INGOT = new ItemBase ("dragonstone_steel_ingot");
	public static final Item DRAGONGLASS_SHARD = new ItemBase ("dragonglass_shard");
	public static final Item CHAINMAIL_RING = new ItemBase ("chainmail_ring");
	public static final Item CHAINMAIL_LINKS = new ItemBase ("chainmail_links");
	
	//Items (MiscBase)
	public static final Item STONE_BOWL = new MiscBase ("stone_bowl");
	
	//Armor
	public static final Item DRAGONSTONE_CHAINMAIL_HELMET = new ArmorBase("dragonstone_chainmail_helmet", DRAGONSTONE_CHAINMAIL, 1, EntityEquipmentSlot.HEAD);
	public static final Item DRAGONSTONE_CHAINMAIL_CHESTPLATE = new ArmorBase("dragonstone_chainmail_chestplate", DRAGONSTONE_CHAINMAIL, 1, EntityEquipmentSlot.CHEST);
	public static final Item DRAGONSTONE_CHAINMAIL_LEGGINGS = new ArmorBase("dragonstone_chainmail_leggings", DRAGONSTONE_CHAINMAIL, 1, EntityEquipmentSlot.LEGS);
	public static final Item DRAGONSTONE_CHAINMAIL_BOOTS = new ArmorBase("dragonstone_chainmail_boots", DRAGONSTONE_CHAINMAIL, 1, EntityEquipmentSlot.FEET);
	
	//Daggers,Rapiers
	public static final ToolStoryDagger DRAGONGLASS_DAGGER = new ToolStoryDagger("dragonglass_dagger", MATERIAL_DRAGONGLASS);
	public static final ItemAxe BRAAVOS_RAPIER = new ToolDagger("braavos_rapier", MATERIAL_DRAGONGLASS);
	public static final ToolStoryDagger CATSPAW_DAGGER = new ToolStoryDagger("catspaw_dagger", MATERIAL_CATSPAW_DAGGER);
	
	//Swords
	public static final ItemSword DRAGONSTONE_STEEL_SWORD = new ToolSword("dragonstone_steel_sword", MATERIAL_STEEL_INGOT);
	public static final ItemSword NEEDLE = new ToolStory("needle", MATERIAL_NEEDLE);
	public static final ItemSword TRAINING_SWORD = new ToolSword("training_sword", MATERIAL_TRAINING);
	
	//Spears
	
	
	//Greatswords (Yes I know I named the Dragonstone one a longsword I'm sorry)... (Not really)
	public static final ToolLongsword DRAGONSTONE_STEEL_LONGSWORD = new ToolLongsword("dragonstone_steel_longsword", MATERIAL_DRAGONSTONE_LONGSWORD);
	
	//Pikes
	
	//Battleaxes
	public static final ItemAxe DRAGONSTONE_STEEL_BATTLEAXE = new ToolBattleaxe("dragonstone_steel_battleaxe", MATERIAL_DRAGONSTONE_BATTLEAXE);
	public static final ItemAxe IRON_BATTLEAXE = new ToolIronBattleaxe("iron_battleaxe", MATERIAL_IRON_BATTLEAXE);
	public static final ItemAxe TRAINING_BATTLEAXE = new ToolTrainingBattleaxe("training_battleaxe", MATERIAL_TRAINING);
	
	//Maces
	
	//Bows
	
	//Shovels
	public static final ItemSpade DRAGONSTONE_STEEL_SHOVEL = new ToolSpade("dragonstone_steel_shovel", MATERIAL_STEEL_INGOT);
	
	//Pickaxes

	public static final ItemPickaxe DRAGONSTONE_STEEL_PICKAXE = new ToolPickaxe("dragonstone_steel_pickaxe", MATERIAL_STEEL_INGOT);
	
	//Axes
	public static final ItemAxe DRAGONSTONE_STEEL_AXE = new ToolAxe("dragonstone_steel_axe", MATERIAL_STEEL_INGOT);
	
	//Hoes (all dem hoes)
	public static final ItemHoe DRAGONSTONE_STEEL_HOE = new ToolHoe("dragonstone_steel_hoe", MATERIAL_STEEL_INGOT);

//Food
	public static final Item PLAIN_BISCUIT = new FoodBase("plain_biscuit", 2, 5.0F, false);
	public static final Item SUGAR_BISCUIT = new FoodBase("sugar_biscuit", 4, 5.5F, false);
	public static final Item HONEYCAKE = new FoodBase("honeycake", 5, 5.5F, false);
	public static final Item SUGAR_BREAD = new FoodBase("sugar_bread", 5, 6.5F, false);
	public static final Item BREAD_HALF = new FoodBase("bread_half", 1, 4.5F, false);
	public static final Item BREAD_HALF_SUGAR = new FoodBase("bread_half_sugar", 2, 5.0F, false);
	public static final Item CARROT_STEW_WOOD = new SoupBase("carrot_stew_wood", 6, 5.0F, false);
	public static final Item CARROT_STEW_STONE = new StoneSoupBase("carrot_stew_stone", 6, 5.0F, false);
	public static final Item MUSHROOM_STEW_STONE = new StoneSoupBase("mushroom_stew_stone", 6, 5.0F, false);
	public static final Item BEETROOT_SOUP_STONE = new StoneSoupBase("beetroot_soup_stone", 7, 5.0F, false);
	public static final Item POTATO_STEW_WOOD = new SoupBase("potato_stew_wood", 7, 5.0F, false);
	public static final Item POTATO_CARROT_STEW_WOOD = new SoupBase("potato_carrot_stew_wood", 7, 5.0F, false);
	public static final Item POTATO_STEW_STONE = new StoneSoupBase("potato_stew_stone", 7, 5.0F, false);
	public static final Item POTATO_CARROT_STEW_STONE = new StoneSoupBase("potato_carrot_stew_stone", 7, 5.0F, false);
}


