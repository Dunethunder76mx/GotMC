package com.dunethunder76mx.gotmc.items.food;

import com.dunethunder76mx.gotmc.Main;
import com.dunethunder76mx.gotmc.init.ModItems;
import com.dunethunder76mx.gotmc.util.IHasModel;

import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel

{

	public  FoodBase(String name, int amount, float saturation, boolean isAnimalFood)
	{
		super(amount, saturation ,isAnimalFood); 
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
                                                       