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
		GameRegistry.addRecipe(new ItemStack(ModItems.netherCrystal), "nsn","sds","nsn", 'n', new ItemStack(Blocks.netherrack), 's', new ItemStack(Blocks.soul_sand), 'd', new ItemStack(Items.diamond));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.NetherCrystalBlock), "nnn", "nnn", "nnn", 'n' , new ItemStack(ModItems.netherCrystal));
	}
}
