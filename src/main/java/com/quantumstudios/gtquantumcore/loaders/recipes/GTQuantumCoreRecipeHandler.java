package com.quantumstudios.gtquantumcore.loaders.recipes;

import com.quantumstudios.gtquantumcore.api.unification.ore.GTQuantumCoreOrePrefix;
import gregtech.api.GTValues;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.recipes.ingredients.GTRecipeInput;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialFlag;
import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.material.properties.DustProperty;
import gregtech.api.unification.material.properties.IMaterialProperty;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.api.util.function.TriConsumer;
import gregtech.common.items.MetaItems;
import gregtech.common.items.ToolItems;
import gregtech.loaders.recipe.handlers.RecyclingRecipeHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;


import java.util.*;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;


public class GTQuantumCoreRecipeHandler {




    public static void init() {
        GTQuantumCoreOrePrefix.ntmpipe.addProcessingHandler(PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
        GTQuantumCoreOrePrefix.plateTriple.addProcessingHandler(PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
        GTQuantumCoreOrePrefix.plateSextuple.addProcessingHandler(PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
        GTQuantumCoreOrePrefix.shell.addProcessingHandler(PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
        GTQuantumCoreOrePrefix.billet.addProcessingHandler(PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
        GTQuantumCoreOrePrefix.mesh.addProcessingHandler(PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
        GTQuantumCoreOrePrefix.piston.addProcessingHandler(PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
        GTQuantumCoreOrePrefix.wiredense.addProcessingHandler(PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
        GTQuantumCoreOrePrefix.tablet.addProcessingHandler(PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
        GTQuantumCoreOrePrefix.hook.addProcessingHandler(PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
        GTQuantumCoreOrePrefix.nanites.addProcessingHandler(PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);

    }


}
