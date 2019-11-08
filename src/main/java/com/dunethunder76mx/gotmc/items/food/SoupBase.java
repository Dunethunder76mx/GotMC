package com.dunethunder76mx.gotmc.items.food;

import com.dunethunder76mx.gotmc.Main;
import com.dunethunder76mx.gotmc.init.ModItems;
import com.dunethunder76mx.gotmc.util.IHasModel;

import net.minecraft.item.ItemSoup;

public class SoupBase extends ItemSoup implements IHasModel

{

	public  SoupBase(String name, int amount, float saturation, boolean isAnimalFood)
	{
		super(amount); 
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.gotfood);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		
		{
			Main.proxy.registerItemRenderer(this, 0, "inventory");
		}
	}

	@Override
	public void initModel() {
		
		
	}
	
}
