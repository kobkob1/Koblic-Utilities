package com.kobkob1.kobutil.item;

import java.util.List;

import com.kobkob1.kobutil.creativetab.CreativeTabKU;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagString;


public class ItemNetherCrystal extends ItemKU 
	{
	public ItemNetherCrystal()
		{
		super();
		this.setUnlocalizedName("NetherCrystal");
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTabKU.KU_TAB);
		}
	}
