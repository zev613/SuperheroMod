package com.zseltzer.superheroes.init;

import com.zseltzer.superheroes.RegisterHelper;
import com.zseltzer.superheroes.costumes.ItemTestCostume;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModCostume
{

    public static ItemArmor.ArmorMaterial HERO = EnumHelper.addArmorMaterial("Hero", 20, new int[]{5, 9, 7, 4}, 15);

    static ItemArmor.ArmorMaterial SUPERHERO_ARMOR = EnumHelper.addArmorMaterial
            ("SUPERHERO_ARMOR", 20, new int[]{3, 7, 5, 2}, 14);


        public static Item superheroHead = new ItemTestCostume(SUPERHERO_ARMOR, 0, "superheroHead");

        public static Item superheroChest = new ItemTestCostume(SUPERHERO_ARMOR, 1,"superheroChest");

        public static Item superheroPants = new ItemTestCostume(SUPERHERO_ARMOR, 2, "superheroPants");

        public static Item superheroBoots = new ItemTestCostume(SUPERHERO_ARMOR, 3, "superheroBoots");


    public static void init()
    {

        ModDCCostumes.init();

        ModMarvelCostumes.init();


            RegisterHelper.registerItem(superheroHead);
            RegisterHelper.registerItem(superheroChest);
            RegisterHelper.registerItem(superheroPants);
            RegisterHelper.registerItem(superheroBoots);



    }


}