package com.kobkob1.kobutil.block;

import com.kobkob1.kobutil.creativetab.CreativeTabKU;

public class BlockCarbonatedIronBlock extends BlockKU {
     public BlockCarbonatedIronBlock()
     {
    	 
	super();
	this.setBlockName("CarbonatedIronBlock");
	this.setHardness(30.F);
	this.setResistance(20.0F);
	this.canBlockGrass = true;
	this.setCreativeTab(CreativeTabKU.KU_TAB);
	
     }
}
