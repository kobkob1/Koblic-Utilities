package com.kobkob1.kobutil.block;

import com.kobkob1.kobutil.creativetab.CreativeTabKU;

public class BlockDesertCrystalBlock extends BlockKU {
	public BlockDesertCrystalBlock()
	{
		super();
		this.setBlockName("DesertCrystalBlock");
		this.setHardness(20.0F);
		this.setResistance(20.0F);
		this.canBlockGrass = true;
		this.setCreativeTab(CreativeTabKU.KU_TAB);
	}

}
