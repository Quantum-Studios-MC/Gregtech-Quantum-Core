package com.quantumstudios.gtquantumcore.recipes;

import com.quantumstudios.gtquantumcore.api.unification.material.info.GTQuantumCoreMaterialFlags;
import com.quantumstudios.gtquantumcore.api.unification.ore.GTQuantumCoreOrePrefix;
import com.quantumstudios.gtquantumcore.item.GTQuantumCoreMetaitem;
import com.quantumstudios.gtquantumcore.item.GTQuantumCoreMetaitems;
import com.quantumstudios.gtquantumcore.loaders.recipes.GTQuantumCoreRecipeHandler;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.DustProperty;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.MetaItems;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraftforge.oredict.OreDictionary;

import static com.quantumstudios.gtquantumcore.recipes.RecipeMapsHandler.ELECTRICAL_LOOM;

import static gregtech.api.GTValues.*;

public class GTQuantumCoreOPRecipeHandler {

    public static void processPiston(OrePrefix orePrefix, Material mat, DustProperty property) {
        if (!mat.hasFlag(GTQuantumCoreMaterialFlags.GENERATE_PISTON)) return;


        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                .input(OrePrefix.plate, mat, 3)
                .input(OrePrefix.stick, mat, 1)
                .input(OrePrefix.ring, mat, 1)
                .outputs(OreDictUnifier.get(orePrefix, mat, 1))
                .EUt(VA[ULV])
                .duration(200)
                .circuitMeta(2) // to avoid conflicts
                .buildAndRegister();
    }

    public static void processMesh(OrePrefix orePrefix, Material mat, DustProperty property) {
        if (!mat.hasFlag(GTQuantumCoreMaterialFlags.GENERATE_MESH)) return;

        RecipeMaps.WIREMILL_RECIPES.recipeBuilder()
                .input(OrePrefix.wireFine, mat, 4)
                .outputs(OreDictUnifier.get(orePrefix, mat, 1))
                .EUt(VA[LV])
                .duration(160)
                .circuitMeta(12)
                .buildAndRegister();


    }

    public static void processBillet(OrePrefix orePrefix, Material mat, DustProperty property) {
        if (!mat.hasFlag(GTQuantumCoreMaterialFlags.GENERATE_BILLET)) return;

        RecipeMaps.BENDER_RECIPES.recipeBuilder()
                .input(OrePrefix.nugget, mat, 6)
                .outputs(OreDictUnifier.get(orePrefix, mat, 1))
                .EUt(VA[ULV])
                .duration(20)
                .circuitMeta(24)
                .buildAndRegister();
    }

    public static void processDenseWire(OrePrefix orePrefix, Material mat, DustProperty property) {
        if (!mat.hasFlag(GTQuantumCoreMaterialFlags.GENERATE_DENSE_WIRE)) return;

        RecipeMaps.WIREMILL_RECIPES.recipeBuilder()
                .input(OrePrefix.wireFine, mat, 9)
                .outputs(OreDictUnifier.get(orePrefix, mat, 1))
                .EUt(VA[MV])
                .duration(180)
                .circuitMeta(3)
                .buildAndRegister();
    }

    public static void processNTMPipe(OrePrefix orePrefix, Material mat, DustProperty property) {
        if (!mat.hasFlag(GTQuantumCoreMaterialFlags.GENERATE_NTMPIPE)) return;

        RecipeMaps.BENDER_RECIPES.recipeBuilder()
                .input(OrePrefix.plate, mat, 3)
                .outputs(OreDictUnifier.get(orePrefix, mat, 1))
                .EUt(VA[MV])
                .duration(300)
                .circuitMeta(24)
                .buildAndRegister();
    }

    public static void processShell(OrePrefix orePrefix, Material mat, DustProperty property) {
        if (!mat.hasFlag(GTQuantumCoreMaterialFlags.GENERATE_SHELL)) return;

        RecipeMaps.BENDER_RECIPES.recipeBuilder()
                .input(OrePrefix.plate, mat, 4)
                .outputs(OreDictUnifier.get(orePrefix, mat, 1))
                .EUt(VA[MV])
                .duration(240)
                .circuitMeta(5)
                .buildAndRegister();
    }

    public static void processHook(OrePrefix orePrefix, Material mat, DustProperty property) {
        if (!mat.hasFlag(GTQuantumCoreMaterialFlags.GENERATE_HOOK)) return;

        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                .input(OrePrefix.plate, mat, 3)
                .input(OrePrefix.stick, mat, 2)
                .input(OrePrefix.bolt, mat, 1)
                .outputs(OreDictUnifier.get(orePrefix, mat, 1))
                .EUt(VA[ULV])
                .duration(240)
                .circuitMeta(9)
                .buildAndRegister();
    }

    public static void processCurvedplate(OrePrefix orePrefix, Material mat, DustProperty property) {
        if (!mat.hasFlag(GTQuantumCoreMaterialFlags.GENERATE_CURVED_PLATE)) return;

        RecipeMaps.BENDER_RECIPES.recipeBuilder()
                .input(OrePrefix.plate, mat, 1)
                .outputs(OreDictUnifier.get(orePrefix, mat, 1))
                .EUt(VA[ULV])
                .duration(40)
                .circuitMeta(23)
                .buildAndRegister();
    }

    public static void processYarn(OrePrefix orePrefix, Material mat, DustProperty property) {
        if (!mat.hasFlag(GTQuantumCoreMaterialFlags.GENERATE_THREAD)) return;

        ELECTRICAL_LOOM.recipeBuilder()
                .input(GTQuantumCoreOrePrefix.thread, mat, 32)
                .input(GTQuantumCoreMetaitem.SPINDLE.getOreDictName())
                .outputs(OreDictUnifier.get(orePrefix, mat, 1))
                .EUt(VA[ULV])
                .duration(40)
                .buildAndRegister();

    }






}
