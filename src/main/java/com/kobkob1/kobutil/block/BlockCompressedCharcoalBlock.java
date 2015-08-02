package com.kobkob1.kobutil.block;

import com.kobkob1.kobutil.creativetab.CreativeTabKU;

public class BlockCompressedCharcoalBlock extends BlockKU{
	public BlockCompressedCharcoalBlock()
	{
		super();
		this.setBlockName("CompressedCharcoalBlock");
		this.setHardness(15.F);
		this.setResistance(15.0F);
		this.canBlockGrass = true;
		this.setCreativeTab(CreativeTabKU.KU_TAB);

	}

}
