package com.kobkob1.kobutil.creativetab;

import com.kobkob1.kobutil.Reference.References;
import com.kobkob1.kobutil.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabKU 
{
	public static final CreativeTabs KU_TAB = new CreativeTabs(References.MOD_ID.toLowerCase()) 
	{
		
		@Override
		public Item getTabIconItem() {
			return ModItems.riverCrystal;
		}
		public String getTranslatedTableLabel()
		{
			return "Koblic Utilities";
		}
	};
}
