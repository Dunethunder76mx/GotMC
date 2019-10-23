package com.dunethunder76mx.gotmc.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TargaryanBrick extends BlockBase 
{

	public TargaryanBrick(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(2.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 1);
		//setLightLevel(1.0f);
		//setLightOpacity(1);
		//setBlockUnbreakable():
		//Last three are there so I remember what options I have for block Metadata.
		
	}

}
