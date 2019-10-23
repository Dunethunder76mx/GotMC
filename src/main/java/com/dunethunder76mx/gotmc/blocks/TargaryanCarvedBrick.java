package com.dunethunder76mx.gotmc.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TargaryanCarvedBrick extends BlockBase 
{

	public TargaryanCarvedBrick(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(2.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 1);
		
		
	}

}
