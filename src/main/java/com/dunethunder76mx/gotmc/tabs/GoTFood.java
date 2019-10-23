package com.dunethunder76mx.gotmc.tabs;

import com.dunethunder76mx.gotmc.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GoTFood extends CreativeTabs

{
	public GoTFood(String label) { super("gotfood");
	 }

	public ItemStack getTabIconItem() {return new ItemStack(ModItems.PLAIN_BISCUIT);
	}
	
}