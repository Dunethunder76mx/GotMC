package com.dunethunder76mx.gotmc.items.food;

import com.dunethunder76mx.gotmc.init.ModItems;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSoupCustom extends ItemFood
{
    public ItemSoupCustom(int healAmount)
    {
        super(healAmount, false);
        this.setMaxStackSize(1);
    }

    /**
     * Called when the player finishes using this Item (E.g. finishes eating.). Not called when the player stops using
     * the Item before the action is complete.
     */
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        return new ItemStack(ModItems.STONE_BOWL);
    }
}