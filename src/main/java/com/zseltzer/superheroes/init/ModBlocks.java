package com.zseltzer.superheroes.init;

import com.zseltzer.superheroes.RegisterHelper;
import com.zseltzer.superheroes.blocks.GenericBlock;

import net.minecraft.block.Block;

public class ModBlocks
{

    public static Block kryptoniteOre = new GenericBlock("kryptoniteOre");

    public static Block kryptoniteBlock = new GenericBlock("kryptoniteBlock");

    public static Block adamantiumOre = new GenericBlock("adamantiumOre");

    public static Block adamantiumBlock = new GenericBlock("adamantiumBlock");

    public static Block vibraniumOre = new GenericBlock("vibraniumOre");

    public static Block platinumOre = new GenericBlock("platinumOre");

    public static Block tesseract = new GenericBlock("tesseract");


    public static void init()
    {

        RegisterHelper.registerBlock(kryptoniteOre);

        RegisterHelper.registerBlock(kryptoniteBlock);

        RegisterHelper.registerBlock(adamantiumOre);

        RegisterHelper.registerBlock(adamantiumBlock);

        RegisterHelper.registerBlock(vibraniumOre);

        RegisterHelper.registerBlock(platinumOre);

        RegisterHelper.registerBlock(tesseract);
    }
}
