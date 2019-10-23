package com.dunethunder76mx.gotmc.items.armor;


import com.dunethunder76mx.gotmc.Main;
import com.dunethunder76mx.gotmc.init.ModItems;
import com.dunethunder76mx.gotmc.items.models.ModelDragonstoneChainmailArmor;
import com.dunethunder76mx.gotmc.util.IHasModel;
import com.google.common.collect.Lists;




import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.reflect.internal.Mirrors.Roots;

import javax.annotation.Nullable;

public class ItemDragonstoneChainmailArmor extends ItemArmor implements IHasModel {
  public static double BONUS = 0.05;

  public ItemDragonstoneChainmailArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
    super(material, 0, slot);
    setTranslationKey(name);
    setRegistryName(new ResourceLocation(name, name));
    setMaxDamage(750);
    setCreativeTab(Main.gotarmor);
  }

  private void setTranslationKey(String name) {
	// TODO Auto-generated method stub
	
}

@Override
  public void initModel() {
    ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "handler"));
  }

  @Nullable
  @Override
  public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
    return   ":textures/models/armor/dragonstone_chainmail_armor.bbmodel";
  }

  @Nullable
  @Override
  @SideOnly(Side.CLIENT)
  public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
    return ModelDragonstoneChainmailArmor.getInstance(armorSlot);
  }

  public static double sylvanBonus(EntityPlayer player) {
    int count = (int) Lists.newArrayList(player.getArmorInventoryList()).stream().filter((o) -> o.getItem() instanceof ItemDragonstoneChainmailArmor).count();

    switch (count) {
      case 1:
        return 0.02;
      case 2:
        return 0.04;
      case 3:
        return 0.06;
      case 4:
        return 0.08;
      default:
        return 0.0;
    }
  }

  @Override
  public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
    return toRepair.getItem() == this && repair.getItem() == ModItems.DRAGONSTONE_STEEL_INGOT;
  }

@Override
public void registerModels() {
	// TODO Auto-generated method stub
	
}
}