package com.dunethunder76mx.gotmc.items.armor;

import com.dunethunder76mx.gotmc.Main;
import com.dunethunder76mx.gotmc.init.ModItems;
import com.dunethunder76mx.gotmc.items.models.ModelCustomArmor;
import com.dunethunder76mx.gotmc.util.IHasModel;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorBase extends ItemArmor implements IHasModel

{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.gotarmor);
		
		ModItems.ITEMS.add(this);
		setMaxStackSize(1);
	}

	@Override
	public void registerModels() 
	
	{
	Main.proxy.registerItemRenderer(this, 0, "inventory");
	
	}
	
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemstack, EntityEquipmentSlot armorSlot, ModelBiped _default) 
	
	{
		if(itemstack != ItemStack.EMPTY) 
		
		{
			if(itemstack.getItem() instanceof ItemArmor)
			{
				ModelCustomArmor model = new ModelCustomArmor();
				model.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				
				model.isChild = _default.isChild;
				model.isRiding = _default.isRiding;
				model.isSneak = _default.isSneak;
				model.rightArmPose = _default.rightArmPose;
				model.leftArmPose = _default.leftArmPose;
				
				return model;
				
				
			}
		}
		
		return null;
	}

	@Override
	public void initModel() {
		
		
	}
	
	
	
}
