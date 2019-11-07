package com.dunethunder76mx.gotmc.items;

import com.dunethunder76mx.gotmc.Main;
import com.dunethunder76mx.gotmc.init.ModItems;
import com.dunethunder76mx.gotmc.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel 
{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.gotmaterials);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	
	{
	Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

	@Override
	public void initModel() {
		
		
	}

}
