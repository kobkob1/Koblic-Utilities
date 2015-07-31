package com.kobkob1.kobutil.block;

import com.kobkob1.kobutil.creativetab.CreativeTabKU;

public class BlockVillageCrystalBlock extends BlockKU {
	public BlockVillageCrystalBlock()
	{
		super();
		this.setBlockName("VillageCrystalBlock");
		this.setHardness(20.0F);
		this.setResistance(20.0F);
		this.canBlockGrass = true;
		this.setCreativeTab(CreativeTabKU.KU_TAB);
	}

}
