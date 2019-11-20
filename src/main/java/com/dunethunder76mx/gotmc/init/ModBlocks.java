package com.dunethunder76mx.gotmc.init;

import java.util.ArrayList;
import java.util.List;

import com.dunethunder76mx.gotmc.blocks.BlockBase;
import com.dunethunder76mx.gotmc.blocks.DragonstoneCarvedBrick;
import com.dunethunder76mx.gotmc.blocks.DragonstonePillar;
import com.dunethunder76mx.gotmc.blocks.DragonstoneRock;
import com.dunethunder76mx.gotmc.blocks.RedKeepBrick;
import com.dunethunder76mx.gotmc.blocks.TargaryanBrick;
import com.dunethunder76mx.gotmc.blocks.TargaryanCarvedBrick;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 

{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block TARGARYAN_BRICK_BLOCK = new TargaryanBrick("targaryan_brick_block", Material.ROCK);
	public static final Block DRAGONSTONE_ROCK_BLOCK = new DragonstoneRock("dragonstone_rock_block", Material.ROCK);
	public static final Block DRAGONSTONE_PILLAR_BLOCK = new DragonstonePillar("dragonstone_pillar_block", Material.ROCK);
	public static final Block TARGARYAN_CARVED_BRICK = new TargaryanCarvedBrick("targaryan_carved_brick", Material.ROCK);
	public static final Block DRAGONSTONE_CARVED_BRICK = new DragonstoneCarvedBrick("dragonstone_carved_brick", Material.ROCK);
	public static final Block RED_KEEP_BRICK = new RedKeepBrick("red_keep_brick", Material.ROCK);
	
	
	}
