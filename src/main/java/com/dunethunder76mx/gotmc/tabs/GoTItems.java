package com.dunethunder76mx.gotmc.tabs;

import com.dunethunder76mx.gotmc.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GoTItems extends CreativeTabs

{
	public GoTItems(String label) { super("gotitems");
	 }

	public ItemStack getTabIconItem() {return new ItemStack(ModItems.STONE_BOWL);
	}
	
}
