package com.kobkob1.kobutil.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;

public class recipes 
{
	public static void init()
	{
		//Crystal Recipes
		GameRegistry.addRecipe(new ItemStack(ModItems.netherCrystal), "nsn","sds","nsn", 'n', new ItemStack(Blocks.netherrack), 's', new ItemStack(Blocks.soul_sand), 'd', new ItemStack(Items.diamond));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.NetherCrystalBlock), "nnn", "nnn", "nnn", 'n' , new ItemStack(ModItems.netherCrystal));
		GameRegistry.addRecipe(new ItemStack(ModItems.riverCrystal), "sss","cdc","ggg", 's', new ItemStack(Blocks.sand), 'c', new ItemStack(Blocks.clay), 'd' , new ItemStack(Items.diamond) , 'g' , new ItemStack(Blocks.gravel)  );
		GameRegistry.addRecipe(new ItemStack(ModBlocks.RiverCrystalBlock), "rrr", "rrr", "rrr", 'r', new ItemStack(ModItems.riverCrystal));
		GameRegistry.addRecipe(new ItemStack(ModItems.jungleCrystal), "vvv", "vdv", "vvv", 'v', new ItemStack(Blocks.vine), 'd', new ItemStack(Items.diamond));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.JungleCrystalBlock), "jjj", "jjj", "jjj", 'j', new ItemStack(ModItems.jungleCrystal));
		GameRegistry.addRecipe(new ItemStack(ModItems.desertCrystal), "sts","tdt", "sts", 's', new ItemStack(Blocks.sand), 't', new ItemStack(Blocks.sandstone), 'd', new ItemStack(Items.diamond));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.DesertCrystalBlock), "ddd","ddd","ddd", 'd' ,  new ItemStack(ModItems.desertCrystal));
		GameRegistry.addRecipe(new ItemStack(ModItems.villageCrystal), "ese", "sds", "ese", 'e', new ItemStack(Items.emerald), 's', new ItemStack(Items.wheat_seeds), 'd', new ItemStack(Items.diamond));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.VillageCrystalBlock), "vvv","vvv","vvv",'v', new ItemStack(ModItems.villageCrystal));
		//Recipes Using Crystal
		GameRegistry.addShapelessRecipe(new ItemStack(Items.potato), new ItemStack(ModItems.villageCrystal), new ItemStack(Items.wheat_seeds), new ItemStack(Items.wheat_seeds));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.carrot), new ItemStack(ModItems.villageCrystal), new ItemStack(Items.wheat_seeds), new ItemStack(Items.spider_eye));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.nether_wart) , new ItemStack(ModItems.netherCrystal), new ItemStack(Items.wheat_seeds), new ItemStack(Items.wheat_seeds));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.melon_seeds), new ItemStack(ModItems.jungleCrystal), new ItemStack(Items.wheat_seeds), new ItemStack(Items.wheat_seeds));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.pumpkin_seeds), new ItemStack(ModItems.jungleCrystal), new ItemStack(Items.carrot), new ItemStack(Items.carrot));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.reeds), new ItemStack(ModItems.riverCrystal), new ItemStack(Items.wheat_seeds),new ItemStack(Items.wheat_seeds));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cactus), new ItemStack(ModItems.desertCrystal),new ItemStack(Items.wheat_seeds),new ItemStack(Items.wheat_seeds));
		//Blocks to 9 Crystals
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.desertCrystal, 9) , new ItemStack(ModBlocks.DesertCrystalBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.riverCrystal, 9) , new ItemStack(ModBlocks.RiverCrystalBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.netherCrystal, 9) , new ItemStack(ModBlocks.NetherCrystalBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.jungleCrystal, 9) , new ItemStack(ModBlocks.JungleCrystalBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.villageCrystal, 9) , new ItemStack(ModBlocks.VillageCrystalBlock));
		//Util Recipes
		GameRegistry.addRecipe(new ItemStack(Blocks.web), " s ", "s s", " s ", 's' , new ItemStack(Items.string));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.waterlily), new ItemStack(Items.water_bucket),new ItemStack(Items.wheat_seeds),new ItemStack(Items.rotten_flesh));
	}
}
