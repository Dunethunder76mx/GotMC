package com.dunethunder76mx.gotmc.items.weaponbases;

import com.dunethunder76mx.gotmc.Main;
import com.dunethunder76mx.gotmc.init.ModItems;
import com.dunethunder76mx.gotmc.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class Dragonsfire extends ItemAxe implements IHasModel

{

	public Dragonsfire(String name, ToolMaterial material)
	{
		super(material, 9.5F, -2.8F);
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
		// TODO Auto-generated method stub
		
	}
}
