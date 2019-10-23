package com.dunethunder76mx.gotmc.tabs;

import com.dunethunder76mx.gotmc.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BuildingBlocks extends CreativeTabs 

{
	public BuildingBlocks(String label) { super("buildingblocks");
	 }

	public ItemStack getTabIconItem() {return new ItemStack(Item.getItemFromBlock(ModBlocks.TARGARYAN_BRICK_BLOCK));
	}
	
}
	
	
	

