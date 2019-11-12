package com.dunethunder76mx.gotmc.items.weaponbases;

import com.dunethunder76mx.gotmc.Main;
import com.dunethunder76mx.gotmc.init.ModItems;
import com.dunethunder76mx.gotmc.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class StorySword extends ItemAxe implements IHasModel

{

	public StorySword(String name, ToolMaterial material)
	{
		super(material, 8.5F, -2.4F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.gotstory);
		
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
