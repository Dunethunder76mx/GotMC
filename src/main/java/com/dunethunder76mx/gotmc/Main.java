package com.dunethunder76mx.gotmc;

import com.dunethunder76mx.gotmc.proxy.CommonProxy;
import com.dunethunder76mx.gotmc.tabs.BuildingBlocks;
import com.dunethunder76mx.gotmc.tabs.GoTArmor;
import com.dunethunder76mx.gotmc.tabs.GoTCombat;
import com.dunethunder76mx.gotmc.tabs.GoTFood;
import com.dunethunder76mx.gotmc.tabs.GoTItems;
import com.dunethunder76mx.gotmc.tabs.GoTMaterials;
import com.dunethunder76mx.gotmc.tabs.GoTStory;
import com.dunethunder76mx.gotmc.tabs.GoTTools;
import com.dunethunder76mx.gotmc.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	public static final CreativeTabs buildingblocks = new BuildingBlocks("buildingblocks");
	public static final CreativeTabs gotmaterials = new GoTMaterials("gotmaterials");
	public static final CreativeTabs gotitems = new GoTItems("gotitems");
	public static final CreativeTabs gotfood = new GoTFood("gotfood");
	public static final CreativeTabs gottools = new GoTTools("gottools");
	public static final CreativeTabs gotcombat = new GoTCombat("gotcombat");
	public static final CreativeTabs gotarmor = new GoTArmor("gotarmor");
	public static final CreativeTabs gotstory = new GoTStory("gotstory");
	
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	
	{
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	
	{
		
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	
	{
		
	}
	
}
