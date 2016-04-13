package com.zseltzer.superheroes.blocks;

import com.zseltzer.superheroes.Reference;
import com.zseltzer.superheroes.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GenericBlock extends Block
{

    public GenericBlock(String unlocalizedName)
    {
        super(Material.rock);
        this.setCreativeTab(ModTabs.tabBlocks);
        this.setBlockName(unlocalizedName);
        setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        this.setStepSound(soundTypeStone);
        this.setHardness(2.5F);
        this.setResistance(25.0F);
        this.setHarvestLevel("pickaxe", 2);
    }
}


