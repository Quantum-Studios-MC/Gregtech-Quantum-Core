package com.quantumstudios.gtquantumcore.proxy;

import com.quantumstudios.gtquantumcore.blocks.MetaBlocksHandler;
import com.quantumstudios.gtquantumcore.render.TexturesHandler;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit(FMLPreInitializationEvent e) 
	{
		super.preInit(e);
		TexturesHandler.init();
	}
	
	@Override
	public void init(FMLInitializationEvent e) 
	{
		super.init(e);
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent e) 
	{
		super.postInit(e);
	}
	
	@SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) 
	{
        MetaBlocksHandler.registerItemModels();
    }
}
