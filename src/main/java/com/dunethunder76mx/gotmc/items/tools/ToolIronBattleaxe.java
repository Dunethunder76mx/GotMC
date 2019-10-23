package com.dunethunder76mx.gotmc.items.tools;

import com.dunethunder76mx.gotmc.Main;
import com.dunethunder76mx.gotmc.init.ModItems;
import com.dunethunder76mx.gotmc.util.IHasModel;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolIronBattleaxe extends ItemAxe implements IHasModel

{
	public ToolIronBattleaxe(String name, ToolMaterial material)
	{
		super(material, 8.25F, -3.2F);
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
