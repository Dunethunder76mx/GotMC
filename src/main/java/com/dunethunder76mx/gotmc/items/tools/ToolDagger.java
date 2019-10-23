package com.dunethunder76mx.gotmc.items.tools;

import com.dunethunder76mx.gotmc.Main;
import com.dunethunder76mx.gotmc.init.ModItems;
import com.dunethunder76mx.gotmc.util.IHasModel;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolDagger extends ItemAxe implements IHasModel

{

	
	

		
		public ToolDagger(String name, ToolMaterial material)
		{
			super(material, 4.25F, -2.0F);
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
