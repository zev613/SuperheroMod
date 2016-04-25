package com.zseltzer.superheroes.commands;

import java.util.ArrayList;
import java.util.List;

import com.zseltzer.superheroes.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.IReloadableResourceManager;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class CommandChangeSuit implements ICommand
{

    private final List aliases;

    private static IReloadableResourceManager resourceManager;

    //protected String fullEntityName;
    public static String suitName = "superSuitDefault";

    public CommandChangeSuit()
    {
        aliases = new ArrayList();
        aliases.add("changeSuit");
        aliases.add("setSuit");
        aliases.add("changeCostume");
        aliases.add("costumeChange");
        aliases.add("suitChange");
    }

    @Override
    public int compareTo(Object o)
    {
        return 0;
    }

    @Override
    public String getCommandName()
    {
        return "changeSuit";
    }

    @Override
    public String getCommandUsage(ICommandSender var1)
    {
        return "changeSuit <text>";
    }

    @Override
    public List getCommandAliases()
    {
        return this.aliases;
    }

    public static boolean exists(String superheroSuitName)
    {
        ResourceLocation textureFile1 = new ResourceLocation(Reference.MODID, "textures/models/superheroSuits/" + superheroSuitName + "_layer_1.png");
        ResourceLocation textureFile2 = new ResourceLocation(Reference.MODID, "textures/models/superheroSuits/" + superheroSuitName + "_layer_2.png");
        try
        {
            Minecraft.getMinecraft().getResourceManager().getAllResources(textureFile1);
            Minecraft.getMinecraft().getResourceManager().getAllResources(textureFile2);
            return true;
        } catch (Throwable t)
        {
            return false;
        }
    }

    @Override
    public void processCommand(ICommandSender sender, String[] argString)
    {
        World world = sender.getEntityWorld();

        if (world.isRemote)
        {
            //System.out.println("Not processing on Client side");
        }
        else
        {
            //System.out.println("Processing on Server side");
            if(argString.length == 0)
            {
                sender.addChatMessage(new ChatComponentText("Invalid argument"));
                return;
            }

            if(exists(argString[0]) == true)
            {
                sender.addChatMessage(new ChatComponentText("Changing your suit to: " + argString[0] + "."));
                suitName = argString[0];
            }
            else
            {
                sender.addChatMessage(new ChatComponentText("You did not pick a valid option. Please try again, with a valid suit name."));
            }
            /*
            File f = new File("/assets/textures/models/superheroSuits/" + argString[0] + ".png");
            if(f.exists() && !f.isDirectory())
            {
            	sender.addChatMessage(new ChatComponentText("Changing your suit to " + argString[0] + "."));
                suitName = argString[0];
            }

            else
            {
            	sender.addChatMessage(new ChatComponentText("You did not pick a valid option. Please try again."));
            }
            */
            //System.out.println("The current suitName value is: " + suitName + ".");
        }
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender var1)
    {
        return true;
    }

    @Override
    public List addTabCompletionOptions(ICommandSender var1, String[] var2)
    {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] var1, int var2)
    {
        return false;
    }
}