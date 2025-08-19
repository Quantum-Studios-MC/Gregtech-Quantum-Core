package com.quantumstudios.gtquantumcore.recipes.machine_recipes;


import com.quantumstudios.gtquantumcore.api.unification.ore.GTQuantumCoreOrePrefix;
import gregtech.api.unification.ore.OrePrefix;

import static com.quantumstudios.gtquantumcore.recipes.RecipeMapsHandler.STEAM_SPRENGEL_PUMP;
import static gregtech.api.GTValues.EV;
import static gregtech.api.GTValues.HV;
import static gregtech.api.GTValues.IV;
import static gregtech.api.GTValues.LV;
import static gregtech.api.GTValues.LuV;
import static gregtech.api.GTValues.MV;
import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.UHV;
import static gregtech.api.GTValues.UIV;
import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.UXV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.GTValues.ZPM;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.ADVANCED_CIRCUIT_BOARD;
import static gregtech.common.items.MetaItems.ADVANCED_SMD_CAPACITOR;
import static gregtech.common.items.MetaItems.ADVANCED_SMD_DIODE;
import static gregtech.common.items.MetaItems.ADVANCED_SMD_INDUCTOR;
import static gregtech.common.items.MetaItems.ADVANCED_SMD_RESISTOR;
import static gregtech.common.items.MetaItems.ADVANCED_SMD_TRANSISTOR;
import static gregtech.common.items.MetaItems.ELITE_CIRCUIT_BOARD;
import static gregtech.common.items.MetaItems.EXTREME_CIRCUIT_BOARD;
import static gregtech.common.items.MetaItems.GOOD_CIRCUIT_BOARD;
import static gregtech.common.items.MetaItems.PLASTIC_CIRCUIT_BOARD;
import static gregtech.common.items.MetaItems.SMD_CAPACITOR;
import static gregtech.common.items.MetaItems.SMD_RESISTOR;
import static gregtech.common.items.MetaItems.SMD_TRANSISTOR;
import static gregtech.common.items.MetaItems.VACUUM_TUBE;
import static gregtech.common.items.MetaItems.GLASS_TUBE;

public class SESPRecipes {

    public static void init() {
        STEAM_SPRENGEL_PUMP.recipeBuilder()
                .input(GTQuantumCoreOrePrefix.mesh, RedAlloy, 3)
                .input(GLASS_TUBE)
                .input(wireFine, Copper, 4)
                .fluidInputs(Mercury.getFluid(144))
                .output(VACUUM_TUBE, 2)
                .fluidOutputs(Air.getFluid(100))
                .duration(120).EUt(16).buildAndRegister();
    }

}