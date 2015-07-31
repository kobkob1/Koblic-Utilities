package com.kobkob1.kobutil;

import com.kobkob1.kobutil.proxy.IProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import java.util.logging.Logger;

import com.kobkob1.kobutil.Reference.References;
import com.kobkob1.kobutil.init.ModBlocks;
import com.kobkob1.kobutil.init.ModItems;

@Mod(modid= References.MOD_ID,  name= References.MOD_NAME , version= References.MOD_VER)

public class KoblicUtilities {

	@SidedProxy(clientSide = "com.kobkob1.kobutil.proxy.ClientProxy" , serverSide = "com.kobkob1.kobutil.proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.Instance("kobutil")
	public static KoblicUtilities instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModBlocks.init();
	}

	@Mod.EventHandler
	public void  Init(FMLInitializationEvent event)
	{
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	
	
}

