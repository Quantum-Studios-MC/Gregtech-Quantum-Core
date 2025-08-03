package com.quantumstudios.gtquantumcore.proxy;

import java.util.Objects;
import java.util.function.Function;

import com.quantumstudios.gtquantumcore.Multiblocks.MultiblockHandler;
import com.quantumstudios.gtquantumcore.blocks.MetaBlocksHandler;
import com.quantumstudios.gtquantumcore.recipes.MachineRecipeHandler;

import gregtech.api.block.VariantItemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;

//import com.quantumstudios.gtquantumcore.multiblocks.MultiblockHandler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent e)
	{
		MetaBlocksHandler.init();
	}
	
	public void init(FMLInitializationEvent e)
	{
		MultiblockHandler.init();
	}
	
	public void postInit(FMLPostInitializationEvent e)
	{
		MachineRecipeHandler.init();
	}
	
	@SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();

        registry.register(MetaBlocksHandler.SPECIAL_PART);
        registry.register(MetaBlocksHandler.MULTIBLOCK_CASING);
    }
	
	@SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(createItemBlock(MetaBlocksHandler.SPECIAL_PART, VariantItemBlock::new));
        registry.register(createItemBlock(MetaBlocksHandler.MULTIBLOCK_CASING, VariantItemBlock::new));
    }
	
	private static <T extends Block> ItemBlock createItemBlock(T block, Function<T, ItemBlock> producer) {
        ItemBlock itemBlock = producer.apply(block);
        itemBlock.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
        return itemBlock;
    }
}