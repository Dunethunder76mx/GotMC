package com.dunethunder76mx.gotmc.items.weaponbases;

import com.dunethunder76mx.gotmc.Main;
import com.dunethunder76mx.gotmc.init.ModItems;
import com.dunethunder76mx.gotmc.util.IHasModel;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolTrainingBattleaxe extends ItemAxe implements IHasModel

{

	public ToolTrainingBattleaxe(String name, ToolMaterial material)
	{
		super(material, 4.0F, -3.2F);
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
