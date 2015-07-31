package com.kobkob1.kobutil.init;

import com.kobkob1.kobutil.item.ItemKU;

import cpw.mods.fml.common.registry.GameRegistry;

import com.kobkob1.kobutil.item.ItemNetherCrystal;
import com.kobkob1.kobutil.item.ItemRiverCrystal;
import com.kobkob1.kobutil.item.ItemVillageCrystal;
import com.kobkob1.kobutil.Reference.References;
import com.kobkob1.kobutil.item.ItemDesertCrystal;
import com.kobkob1.kobutil.item.ItemJungleCrystal;
@GameRegistry.ObjectHolder(References.MOD_ID)
public class ModItems 
	{
	public static final ItemKU netherCrystal = new ItemNetherCrystal();
	public static final ItemKU desertCrystal = new ItemDesertCrystal();
	public static final ItemKU jungleCrystal = new ItemJungleCrystal();
	public static final ItemKU riverCrystal = new ItemRiverCrystal();
	public static final ItemKU villageCrystal = new ItemVillageCrystal();
	public static void init()
		{
		GameRegistry.registerItem(netherCrystal, "NetherCrystal");
		GameRegistry.registerItem(desertCrystal, "DesertCrystal");
		GameRegistry.registerItem(riverCrystal, "RiverCrystal");
		GameRegistry.registerItem(jungleCrystal, "JungleCrystal");
		GameRegistry.registerItem(villageCrystal, "VillageCrystal");
		}
	
	}
