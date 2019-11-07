package com.dunethunder76mx.gotmc.items.weaponbases;

import com.dunethunder76mx.gotmc.Main;
import com.dunethunder76mx.gotmc.init.ModItems;
import com.dunethunder76mx.gotmc.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolBattleaxe extends ItemAxe implements IHasModel

{

	public ToolBattleaxe(String name, ToolMaterial material)
	{
		super(material, 8.5F, -3.2F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.gotcombat);
		
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

