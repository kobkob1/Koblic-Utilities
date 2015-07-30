package com.kobkob1.kobutil.init;

import com.kobkob1.kobutil.item.ItemKU;

import cpw.mods.fml.common.registry.GameRegistry;

import com.kobkob1.kobutil.item.ItemNetherCrystal;

public class ModItemsClass 
	{
	public static final ItemKU netherCrystal = new ItemNetherCrystal();
	
	public static void init()
		{
		GameRegistry.registerItem(netherCrystal, "NetherCrystal");
		}
	
	}
