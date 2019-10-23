package com.dunethunder76mx.gotmc.tabs;

import com.dunethunder76mx.gotmc.init.ModBlocks;
import com.dunethunder76mx.gotmc.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GoTStory extends CreativeTabs 

{
	public GoTStory(String label) { super("gotstory");
	 }

	public ItemStack getTabIconItem() {return new ItemStack(ModItems.NEEDLE);
	}
	
}
	
	
	

