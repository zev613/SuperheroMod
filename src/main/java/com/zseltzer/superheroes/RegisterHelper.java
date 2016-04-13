package com.zseltzer.superheroes;

import java.util.Random;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;

public class RegisterHelper
{
    public static void registerBlock(Block block)
    {
        GameRegistry.registerBlock(block, Reference.MODID + block.getUnlocalizedName().substring(5));
    }

    public static void registerItem(Item item)
    {
        GameRegistry.registerItem(item, Reference.MODID + item.getUnlocalizedName().substring(5));
    }
}
