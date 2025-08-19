package com.quantumstudios.gtquantumcore.recipes;

import com.quantumstudios.gtquantumcore.item.GTQuantumCoreMetaitem;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.material.properties.DustProperty;
import gregtech.api.unification.material.properties.ToolProperty;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.api.items.toolitem.ToolHelper;
import gregtech.loaders.recipe.handlers.ToolRecipeHandler;

import static gregtech.loaders.recipe.handlers.ToolRecipeHandler.addToolRecipe;

import static gregtech.api.unification.material.properties.PropertyKey.DUST;
import static gregtech.api.unification.material.properties.PropertyKey.TOOL;

public class GTQuantumCoreToolsRecipeHandler {

    public static void init() {
        OrePrefix.stick.addProcessingHandler(DUST, GTQuantumCoreToolsRecipeHandler::processSpindle);
        OrePrefix.bolt.addProcessingHandler(DUST, GTQuantumCoreToolsRecipeHandler::processNeedle);
    }

    public static void processSpindle(OrePrefix prefix, Material material, DustProperty property) {
        if (!material.hasFlag(MaterialFlags.GENERATE_PLATE)) return;
        if (!material.hasFlag(MaterialFlags.GENERATE_ROD)) return;

        ToolProperty toolProp = material.getProperty(TOOL);
        if (toolProp == null) return;

        ToolRecipeHandler.addToolRecipe(
                material,
                GTQuantumCoreMetaitem.SPINDLE,
                true, // true = require craftingToolFile
                " IE",
                " EI",
                "E  ",
                'I', new UnificationEntry(OrePrefix.plate, material),
                'E', new UnificationEntry(OrePrefix.stick, material)
        );
    }

    public static void processNeedle(OrePrefix prefix, Material material, DustProperty property) {
        if (!material.hasFlag(MaterialFlags.GENERATE_BOLT_SCREW)) return;

        ToolProperty toolProp = material.getProperty(TOOL);
        if (toolProp == null) return;

        ToolRecipeHandler.addToolRecipe(
                material,
                GTQuantumCoreMetaitem.NEEDLE,
                true, // also requires file
                "   ",
                "fI ",
                "   ",
                'I', new UnificationEntry(OrePrefix.bolt, material)
        );
    }

    public static void processPot(OrePrefix prefix, Material material, DustProperty property) {
        if (!material.hasFlag(MaterialFlags.GENERATE_PLATE))
                return;

        ToolProperty toolProp = material.getProperty(TOOL);
        if (toolProp == null) return;

        ToolRecipeHandler.addToolRecipe(
                material,
                GTQuantumCoreMetaitem.POT,
                true,
                "IhI",
                " I ",
                "   ",
                'I', new UnificationEntry(OrePrefix.plate, material)
        );
    }
}
