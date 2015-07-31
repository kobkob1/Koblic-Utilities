package com.kobkob1.kobutil.block;

import com.kobkob1.kobutil.creativetab.CreativeTabKU;

public class BlockJungleCrystalBlock extends BlockKU {
	public BlockJungleCrystalBlock()
	{
		super();
		this.setBlockName("JungleCrystalBlock");
		this.setHardness(20.0F);
		this.setResistance(20.0F);
		this.canBlockGrass = true;
		this.setCreativeTab(CreativeTabKU.KU_TAB);
	}

}
