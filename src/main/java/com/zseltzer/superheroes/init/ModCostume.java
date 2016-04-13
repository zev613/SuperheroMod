package com.zseltzer.superheroes.init;

import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModCostume
{

    public static ItemArmor.ArmorMaterial HERO = EnumHelper.addArmorMaterial("Hero", 20, new int[]{5, 9, 7, 4}, 15);

    public static void init()
    {

        ModDCCostumes.init();

        ModMarvelCostumes.init();
    }


}