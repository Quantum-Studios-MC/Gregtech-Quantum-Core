package com.quantumstudios.gtquantumcore.common;

import com.quantumstudios.gtquantumcore.api.unification.material.modifications.GTQuantumCoreExtraFlags;
import com.quantumstudios.gtquantumcore.api.unification.ore.GTQuantumCoreOrePrefix;
import com.quantumstudios.gtquantumcore.loaders.recipes.GTQuantumCoreRecipeHandler;
import com.quantumstudios.gtquantumcore.recipes.GTQuantumCoreOPRecipeHandler;
import com.quantumstudios.gtquantumcore.recipes.GTQuantumCoreToolsRecipeHandler;
import gregtech.api.unification.material.event.PostMaterialEvent;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.MetaItems;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import scala.reflect.internal.Types;
import com.quantumstudios.gtquantumcore.recipes.machine_recipes.SESPRecipes;

@Mod.EventBusSubscriber

public class EventHandlers {
    @SubscribeEvent
    public static void materialChanges(PostMaterialEvent event) {
        MetaItems.addOrePrefix(GTQuantumCoreOrePrefix.mesh);
        MetaItems.addOrePrefix(GTQuantumCoreOrePrefix.billet);
        MetaItems.addOrePrefix(GTQuantumCoreOrePrefix.ntmpipe);
        MetaItems.addOrePrefix(GTQuantumCoreOrePrefix.wiredense);
        MetaItems.addOrePrefix(GTQuantumCoreOrePrefix.shell);
        MetaItems.addOrePrefix(GTQuantumCoreOrePrefix.plateTriple);
        MetaItems.addOrePrefix(GTQuantumCoreOrePrefix.plateSextuple);
        MetaItems.addOrePrefix(GTQuantumCoreOrePrefix.piston);
        MetaItems.addOrePrefix(GTQuantumCoreOrePrefix.hook);
        MetaItems.addOrePrefix(GTQuantumCoreOrePrefix.tablet);
        MetaItems.addOrePrefix(GTQuantumCoreOrePrefix.nanites);
        MetaItems.addOrePrefix(GTQuantumCoreOrePrefix.curvedplate);
        MetaItems.addOrePrefix(GTQuantumCoreOrePrefix.thread);
        MetaItems.addOrePrefix(GTQuantumCoreOrePrefix.yarn);

//        MetaItems.addOrePrefix(GTQuantumCoreOrePrefix.oreMoonRock);
//        MetaItems.addOrePrefix(GTQuantumCoreOrePrefix.oreMarsRock);
//        MetaItems.addOrePrefix(GTQuantumCoreOrePrefix.oreVenusRock);

        GTQuantumCoreExtraFlags.register();


    }

    @SubscribeEvent()
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        GTQuantumCoreRecipeHandler.init();
        SESPRecipes.init();
        GTQuantumCoreOrePrefix.mesh.addProcessingHandler(
                PropertyKey.DUST, GTQuantumCoreOPRecipeHandler::processMesh);

        GTQuantumCoreOrePrefix.billet.addProcessingHandler(
                PropertyKey.DUST, GTQuantumCoreOPRecipeHandler::processBillet);

        GTQuantumCoreOrePrefix.wiredense.addProcessingHandler(
                PropertyKey.DUST, GTQuantumCoreOPRecipeHandler::processDenseWire);

        GTQuantumCoreOrePrefix.ntmpipe.addProcessingHandler(
                PropertyKey.DUST, GTQuantumCoreOPRecipeHandler::processNTMPipe);

        GTQuantumCoreOrePrefix.shell.addProcessingHandler(
                PropertyKey.DUST, GTQuantumCoreOPRecipeHandler::processShell);

        GTQuantumCoreOrePrefix.piston.addProcessingHandler(
                PropertyKey.DUST, GTQuantumCoreOPRecipeHandler::processPiston);

        GTQuantumCoreOrePrefix.hook.addProcessingHandler(
                PropertyKey.DUST, GTQuantumCoreOPRecipeHandler::processHook);

        GTQuantumCoreOrePrefix.curvedplate.addProcessingHandler(
                PropertyKey.DUST, GTQuantumCoreOPRecipeHandler::processCurvedplate);

        GTQuantumCoreOrePrefix.yarn.addProcessingHandler(
                PropertyKey.DUST, GTQuantumCoreOPRecipeHandler::processYarn);


        OrePrefix.ingot.addProcessingHandler(
                PropertyKey.DUST, GTQuantumCoreToolsRecipeHandler::processSpindle
        );

        OrePrefix.ingot.addProcessingHandler(
                PropertyKey.DUST, GTQuantumCoreToolsRecipeHandler::processNeedle);

        OrePrefix.ingot.addProcessingHandler(
                PropertyKey.DUST, GTQuantumCoreToolsRecipeHandler::processPot);


    }

//    @SubscribeEvent
//    public static void onPostMaterialRegistration(PostMaterialEvent event) {
//        GTQuantumCoreStoneTypes.init();
//    }

}
