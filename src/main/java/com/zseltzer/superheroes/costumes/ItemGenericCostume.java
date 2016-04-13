package com.zseltzer.superheroes.costumes;

        import com.zseltzer.superheroes.Reference;
        import com.zseltzer.superheroes.tabs.ModTabs;
        import net.minecraft.client.model.ModelBiped;
        import net.minecraft.client.renderer.texture.IIconRegister;
        import net.minecraft.creativetab.CreativeTabs;
        import net.minecraft.entity.Entity;
        import net.minecraft.entity.EntityLivingBase;
        import net.minecraft.entity.player.EntityPlayer;
        import net.minecraft.item.ItemArmor;
        import net.minecraft.item.ItemStack;
        import net.minecraft.world.World;
        import com.zseltzer.superheroes.Main;
        import com.zseltzer.superheroes.proxies.ClientProxy;
        import cpw.mods.fml.relauncher.Side;
        import cpw.mods.fml.relauncher.SideOnly;

/**
 *
 * Armors that only need to specify a material and texture can ALL use one class.
 *
 * The texture can be returned based on the unlocalized name; in this example, I
 * specify that each armor name should be suffixed by "_type", where "type" is
 * "helm", "chest", "legs", or "boots".
 *
 * There is no need to make separate classes for each armor piece or even set unless
 * the armor set is very unique and requires special handling.
 *
 */
public class ItemGenericCostume extends ItemArmor
{
    public String COSTUME_NAME;

    //public static int renderIndexSlot;

    /**
     * Armor types as used on player: 0 boots, 1 legs, 2 chest, 3 helm
     * Armor types as used in armor class: 0 helm, 1 chest, 2 legs, 3 boots
     */
    public ItemGenericCostume(ArmorMaterial material, int renderIndex, int type, String costumeSetName)
    {
        super(material, renderIndex, type);

        //renderIndexSlot = renderIndex;

        // during item initialization to override the one set here
        // it's not a bad idea to have a default one, though, just in case you forget
        setCreativeTab(ModTabs.tabCostumes);
        //setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        COSTUME_NAME = costumeSetName;
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
    {
        // this can be used to add a variety of effects while the armor is worn
        // but since this is supposed to be a generic armor class for all kinds
        // of armor, we will not be using it
    }

    /*
    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entity, ItemStack stack, int armorSlot)
    {
        // adding all the armor models to a Map allows this method to be handled cleanly
        // if the Item is not in the map, get(this) returns null, which is perfect, since
        // returning null defaults to using the vanilla armor model
        return ClientProxy.armorModels.get(this);
    }
    */
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        // Assuming all armors are named as "armor_name_chest", "armor_name_legs", etc.
        // then using the following format, the armor texture files should be named
        // "armor_name_layer_1" and "armor_name_layer_2"; layer 2 is for the legs

        //String name = getUnlocalizedName().substring(5, getUnlocalizedName().lastIndexOf("_"));

        //return String.format("%s:textures/armor/%s_%d.png", Reference.MODID, COSTUME_NAME, (slot == 2 ? 2 : 1));

        // If you are not familiar with String.format, the above statement is equivalent to:

        //System.out.println("This armor's slot is == to " + slot + "!");

            if (slot == 0)
            {
                COSTUME_NAME = getUnlocalizedName().substring(5, getUnlocalizedName().length() - 4);
                System.out.println("COSTUME_NAME for slots 0  ==" + COSTUME_NAME + "!");
            }
            else if (slot == 1 || slot == 2 || slot == 3)
            {
                COSTUME_NAME = getUnlocalizedName().substring(5, getUnlocalizedName().length() - 5);
                System.out.println("COSTUME_NAME for slots 1,23  ==" + COSTUME_NAME + "!");
            }

        if (slot == 2)
        {
			return Reference.MODID + ":textures/models/" + COSTUME_NAME + "_2.png";
		} else if (slot == 0 || slot == 1 || slot == 3)
        {
			return Reference.MODID + ":textures/models/" + COSTUME_NAME + "_1.png";
		}
        else
        {
            return null;
        }

        /*
        if (stack.getItem() == ModDCCostumes.aquamanHead || stack.getItem() == ModDCCostumes.aquamanChest || stack.getItem() == ModDCCostumes.aquamanBoots)
        {
            return Reference.MODID + ":textures/models/" + COSTUME NAME + "_1.png";
        }
        else if (stack.getItem() == ModDCCostumes.aquamanPants)
        {
            return Reference.MODID + ":textures/models/" + COSTUME NAME + "_2.png";
        }
        else
        {
            return null;
        }
        */
            //which could also be written as:

		//return Reference.MODID + ":textures/models/" + COSTUME_NAME + (slot == 2 ? "_2.png" : "_1.png");

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register)
    {
        itemIcon = register.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
    }
}