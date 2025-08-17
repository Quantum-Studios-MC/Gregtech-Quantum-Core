package com.quantumstudios.gtquantumcore.common;

import com.quantumstudios.gtquantumcore.api.unification.material.modifications.GTQuantumCoreExtraFlags;
import com.quantumstudios.gtquantumcore.api.unification.ore.GTQuantumCoreOrePrefix;
import com.quantumstudios.gtquantumcore.loaders.recipes.GTQuantumCoreRecipeHandler;
import gregtech.api.unification.material.event.PostMaterialEvent;
import gregtech.common.items.MetaItems;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

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
        GTQuantumCoreExtraFlags.register();


    }

    @SubscribeEvent()
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        GTQuantumCoreRecipeHandler.init();
    }

}
