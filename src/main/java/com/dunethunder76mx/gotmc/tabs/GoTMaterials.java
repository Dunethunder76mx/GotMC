package com.dunethunder76mx.gotmc.tabs;

import com.dunethunder76mx.gotmc.init.ModBlocks;
import com.dunethunder76mx.gotmc.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GoTMaterials extends CreativeTabs 

{
	public GoTMaterials(String label) { super("gotmaterials");
	 }

	public ItemStack getTabIconItem() {return new ItemStack(ModItems.DRAGONSTONE_STEEL_INGOT);
	}
	
}
	
	
	

