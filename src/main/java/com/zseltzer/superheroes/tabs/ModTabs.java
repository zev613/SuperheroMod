package com.zseltzer.superheroes.tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import com.zseltzer.superheroes.init.ModBlocks;
import com.zseltzer.superheroes.init.ModDCTools;
import com.zseltzer.superheroes.init.ModMarvelTools;

public class ModTabs
{
    public static CreativeTabs tabBlocks = new CreativeTabs("tabBlocks")
    {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() { return Item.getItemFromBlock(ModBlocks.tesseract); }
    };

    public static CreativeTabs tabDCHeroes = new CreativeTabs("tabDCHeroes")
    {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() { return Items.leather_chestplate; }
    };

    public static CreativeTabs tabDCVillains = new CreativeTabs("tabDCVillains")
    {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Items.beef;
        }
    };

    public static CreativeTabs tabDCVariants = new CreativeTabs("tabDCVariants")
    {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Items.iron_hoe;
        }
    };

    public static CreativeTabs tabMarvelHeroes = new CreativeTabs("tabMarvelHeroes")
    {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Items.flint;
        }
    };

    public static CreativeTabs tabMarvelVillains = new CreativeTabs("tabMarvelVillains")
    {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Items.golden_apple;
        }
    };

    public static CreativeTabs tabMarvelVariants = new CreativeTabs("tabMarvelVariants")
    {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Items.carrot;
        }
    };

    public static CreativeTabs tabItems = new CreativeTabs("tabItems")
    {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Items.brick;
        }
    };

    public static CreativeTabs tabCostumes = new CreativeTabs("tabCostumes")
    {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Items.iron_horse_armor;
        }
    };
}