package com.zseltzer.superheroes;

import com.zseltzer.superheroes.Reference;
import com.zseltzer.superheroes.commands.CommandChangeSuit;
import com.zseltzer.superheroes.init.*;
import com.zseltzer.superheroes.proxies.CommonProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.logging.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class Main
{
    @Instance(Reference.MODID)
    public static Main instance;

    @SidedProxy(clientSide="com.zseltzer.superheroes.proxies.ClientProxy", serverSide="com.zseltzer.superheroes.proxies.CommonProxy")
    public static CommonProxy proxy;

    public static Logger logger = Logger.getLogger("SUPERHERO MOD");


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModItems.init();

        ModBlocks.init();

        ModCostume.init();

        ModDCTools.init();

        ModMarvelTools.init();

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        ModRecipes.init();

        proxy.registerRenderers();
    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event)
    {
        event.registerServerCommand(new CommandChangeSuit());

        //event.registerServerCommand(new CommandShazam());

        //event.registerServerCommand(new CommandBlackAdam());
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}