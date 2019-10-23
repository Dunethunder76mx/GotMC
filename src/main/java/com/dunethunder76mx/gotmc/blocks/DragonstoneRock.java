package com.dunethunder76mx.gotmc.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DragonstoneRock extends BlockBase 
{

	public DragonstoneRock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(1.5f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 1);
		
		
	}

}
