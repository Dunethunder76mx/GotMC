package com.dunethunder76mx.gotmc.init;

import java.util.ArrayList;
import java.util.List;

import com.dunethunder76mx.gotmc.items.ItemBase;
import com.dunethunder76mx.gotmc.items.MiscBase;
import com.dunethunder76mx.gotmc.items.armor.ArmorBase;
import com.dunethunder76mx.gotmc.items.armor.ItemDragonstoneChainmailArmor;
import com.dunethunder76mx.gotmc.items.food.FoodBase;
import com.dunethunder76mx.gotmc.items.food.SoupBase;
import com.dunethunder76mx.gotmc.items.food.StoneSoupBase;
import com.dunethunder76mx.gotmc.items.models.ModelArmorBase;
import com.dunethunder76mx.gotmc.items.models.ModelDragonstoneChainmailArmor;
import com.dunethunder76mx.gotmc.items.tools.ToolAxe;
import com.dunethunder76mx.gotmc.items.tools.ToolHoe;
import com.dunethunder76mx.gotmc.items.tools.ToolPickaxe;
import com.dunethunder76mx.gotmc.items.tools.ToolSpade;
import com.dunethunder76mx.gotmc.items.tools.ToolSword;
import com.dunethunder76mx.gotmc.items.weaponbases.CatspawDagger;
import com.dunethunder76mx.gotmc.items.weaponbases.Dragonsfire;
import com.dunethunder76mx.gotmc.items.weaponbases.IceSpear;
import com.dunethunder76mx.gotmc.items.weaponbases.StoryGreatsword;
import com.dunethunder76mx.gotmc.items.weaponbases.StorySword;
import com.dunethunder76mx.gotmc.items.weaponbases.ToolBattleaxe;
import com.dunethunder76mx.gotmc.items.weaponbases.ToolDagger;
import com.dunethunder76mx.gotmc.items.weaponbases.ToolIronBattleaxe;
import com.dunethunder76mx.gotmc.items.weaponbases.ToolLongsword;
import com.dunethunder76mx.gotmc.items.weaponbases.ToolStory;
import com.dunethunder76mx.gotmc.items.weaponbases.ToolStoryDagger;
import com.dunethunder76mx.gotmc.items.weaponbases.ToolTrainingBattleaxe;
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
	public static final ToolMaterial MATERIAL_STEEL_INGOT = EnumHelper.addToolMaterial("material_steel_ingot", 2, 550, 6.5F, 3.0F, 14);
	public static final ToolMaterial MATERIAL_NEEDLE = EnumHelper.addToolMaterial("material_needle", 0, 7500, 0.5F, 5.0F, 22);
	public static final ToolMaterial MATERIAL_DRAGONGLASS = EnumHelper.addToolMaterial("material_dragonglass", 1, 25, 1.0F, 1.0F, 20);
	public static final ToolMaterial MATERIAL_TRAINING = EnumHelper.addToolMaterial("material_training", 1, 450, 0.5F, -1.5F, 5);
	public static final ToolMaterial MATERIAL_DRAGONSTONE_BATTLEAXE = EnumHelper.addToolMaterial("material_dragonstone_battleaxe", 0, 550, 1.5F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_DRAGONSTONE_LONGSWORD = EnumHelper.addToolMaterial("material_dragonstone_longsword", 0, 550, 1.0F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_BRAAVOS_RAPIER = EnumHelper.addToolMaterial("material_braavos_rapier", 0, 400, 1.0F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_CATSPAW_DAGGER = EnumHelper.addToolMaterial("matertial_catspaw_dagger", 0, 15000, 1.0F, 2.0F, 20);
	public static final ToolMaterial MATERIAL_IRON_BATTLEAXE = EnumHelper.addToolMaterial("material_iron_battleaxe", 0, 250, 1.5F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_DRAGONSFIRE = EnumHelper.addToolMaterial("matertial_dragonsfire", 0, 15000, 1.0F, 2.0F, 22);
	public static final ToolMaterial MATERIAL_WHITE_WALKER = EnumHelper.addToolMaterial("material_white_walker", 0, 10000, 1.0F, 2.0F, 22);
	public static final ToolMaterial MATERIAL_DAWN = EnumHelper.addToolMaterial("material_dawn", 0, 7500, 1.0F, 2.0F, 22);
	public static final ToolMaterial MATERIAL_FORRESTER_GREATSWORD = EnumHelper.addToolMaterial("material_forrester_greatsword", 0, 15000, 1.0F, 2.0F, 22);
	
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
	
	public static final ArmorBase DRAGONSTONE_CHAINMAIL_HELMET = new ArmorBase("dragonstone_chainmail_helmet", DRAGONSTONE_CHAINMAIL, 1, EntityEquipmentSlot.HEAD);
	
	//These are tests I was doing with the code I borrowed from another mod, no plans to make it in final release.
	//public static final ItemDragonstoneChainmailArmor DRAGONSTONE_CHAINMAIL_HELMET = new ItemDragonstoneChainmailArmor(DRAGONSTONE_CHAINMAIL, EntityEquipmentSlot.HEAD, "dragonstone_chainmail_helmet");
	//public static final ItemDragonstoneChainmailArmor DRAGONSTONE_CHAINMAIL_CHESTPLATE = new ItemDragonstoneChainmailArmor(DRAGONSTONE_CHAINMAIL, EntityEquipmentSlot.CHEST, "dragonstone_chainmail_chestplate");
	//public static final ItemDragonstoneChainmailArmor DRAGONSTONE_CHAINMAIL_LEGGINGS = new ItemDragonstoneChainmailArmor(DRAGONSTONE_CHAINMAIL, EntityEquipmentSlot.LEGS, "dragonstone_chainmail_leggings");
	//public static final ItemDragonstoneChainmailArmor DRAGONSTONE_CHAINMAIL_BOOTS = new ItemDragonstoneChainmailArmor(DRAGONSTONE_CHAINMAIL, EntityEquipmentSlot.FEET, "dragonstone_chainmail_boots");
	
	//Daggers,Rapiers
	public static final ToolStoryDagger DRAGONGLASS_DAGGER = new ToolStoryDagger("dragonglass_dagger", MATERIAL_DRAGONGLASS);
	public static final ItemAxe BRAAVOS_RAPIER = new ToolDagger("braavos_rapier", MATERIAL_DRAGONGLASS);
	public static final CatspawDagger CATSPAW_DAGGER = new CatspawDagger("catspaw_dagger", MATERIAL_CATSPAW_DAGGER);
	
	//Swords
	public static final ItemSword DRAGONSTONE_STEEL_SWORD = new ToolSword("dragonstone_steel_sword", MATERIAL_STEEL_INGOT);
	public static final StorySword NEEDLE = new StorySword("needle", MATERIAL_NEEDLE);
	public static final ItemSword TRAINING_SWORD = new ToolSword("training_sword", MATERIAL_TRAINING);
	public static final StorySword DAWN = new StorySword("dawn", MATERIAL_DAWN);
	
	//Spears
	public static final IceSpear WHITE_WALKER_SPEAR = new IceSpear("white_walker_spear", MATERIAL_TRAINING);
	
	//Greatswords (Yes I know I named the Dragonstone one a longsword I'm sorry)... (Not really)
	public static final ToolLongsword DRAGONSTONE_STEEL_LONGSWORD = new ToolLongsword("dragonstone_steel_longsword", MATERIAL_DRAGONSTONE_LONGSWORD);
	public static final Dragonsfire DRAGONSFIRE = new Dragonsfire("dragonsfire", MATERIAL_DRAGONSFIRE);
	public static final StoryGreatsword forrester_greatsword = new StoryGreatsword("forrester_greatsword", MATERIAL_FORRESTER_GREATSWORD);
	
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
	public static final Item BREAD_HALF = new FoodBase("bread_half", 2, 4.5F, false);
	public static final Item BREAD_HALF_SUGAR = new FoodBase("bread_half_sugar", 3, 5.0F, false);
	public static final Item CARROT_STEW_WOOD = new SoupBase("carrot_stew_wood", 6, 5.0F, false);
	public static final Item CARROT_STEW_STONE = new StoneSoupBase("carrot_stew_stone", 6, 5.0F, false);
	public static final Item MUSHROOM_STEW_STONE = new StoneSoupBase("mushroom_stew_stone", 6, 5.0F, false);
	public static final Item BEETROOT_SOUP_STONE = new StoneSoupBase("beetroot_soup_stone", 7, 5.0F, false);
	public static final Item POTATO_STEW_WOOD = new SoupBase("potato_stew_wood", 7, 5.0F, false);
	public static final Item POTATO_CARROT_STEW_WOOD = new SoupBase("potato_carrot_stew_wood", 7, 5.0F, false);
	public static final Item POTATO_STEW_STONE = new StoneSoupBase("potato_stew_stone", 7, 5.0F, false);
	public static final Item POTATO_CARROT_STEW_STONE = new StoneSoupBase("potato_carrot_stew_stone", 7, 5.0F, false);
	public static final Item GREEN_APPLE = new FoodBase("green_apple", 4, 4.0F, false);
}


