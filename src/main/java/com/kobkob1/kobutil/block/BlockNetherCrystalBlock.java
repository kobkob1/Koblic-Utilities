package com.kobkob1.kobutil.block;

import com.kobkob1.kobutil.creativetab.CreativeTabKU;

public class BlockNetherCrystalBlock extends BlockKU 
{
	public BlockNetherCrystalBlock()
	{
		super();
		this.setBlockName("NetherCrystalBlock");
		this.setHardness(20.0F);
		this.setResistance(20.0F);
		this.canBlockGrass = true;
		this.setLightLevel(lightValue = 13);
		this.setCreativeTab(CreativeTabKU.KU_TAB);
	}
}
