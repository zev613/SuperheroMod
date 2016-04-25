package com.zseltzer.superheroes.costumes;


import com.zseltzer.superheroes.Reference;
import com.zseltzer.superheroes.commands.CommandChangeSuit;
import com.zseltzer.superheroes.init.ModCostume;
import com.zseltzer.superheroes.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemTestCostume extends ItemArmor
{

    //public static String simpleHeroName = "flash";
    public static String SIMPLENAME = CommandChangeSuit.suitName;
    private static String NAME;

    //public static String suitName = "superSuitDefault";
    //public static String customTexture;

    public ItemTestCostume( ArmorMaterial material, int ArmorType, String name)
    {
        super(material, 0, ArmorType);
        setUnlocalizedName(name);
        NAME = name;
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(ModTabs.tabCostumes);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ModCostume.superheroHead || stack.getItem() == ModCostume.superheroChest || stack.getItem() == ModCostume.superheroBoots)
        {
            return Reference.MODID + ":textures/models/" + CommandChangeSuit.suitName + "_1.png";
        }
        else if (stack.getItem() == ModCostume.superheroPants)
        {
            return Reference.MODID + ":textures/models/" + CommandChangeSuit.suitName + "_2.png";
        }
        else
        {
            return null;
        }
    }
}