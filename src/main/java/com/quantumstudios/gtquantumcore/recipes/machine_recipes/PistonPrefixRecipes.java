//package com.quantumstudios.gtquantumcore.recipes.machine_recipes;
//
//
//import static com.quantumstudios.gtquantumcore.api.unification.ore.GTQuantumCoreOrePrefix.billet;
//import static com.quantumstudios.gtquantumcore.api.unification.ore.GTQuantumCoreOrePrefix.piston;
//import static gregtech.api.GTValues.*;
//import static gregtech.api.recipes.RecipeMaps.*;
//import static gregtech.api.unification.ore.OrePrefix.stick;
//
//import gregtech.api.unification.material.Material;
//import gregtech.api.unification.ore.OrePrefix;
//
//
//public class PistonPrefixRecipes {
//
//    public static void init() {
//        for (Material material : Material.MATERIAL_REGISTRY.values()) {
//            if (material.hasProperty(OrePrefix.stick) && material.hasProperty(OrePrefix.billet)) {
//                ASSEMBLER_RECIPES.recipeBuilder()
//                        .input(stick, material, 2)
//                        .input(billet, material, 3)
//                        .output(piston, material)
//                        .duration(100)
//                        .EUt(VA[ULV])
//                        .buildAndRegister();
//            }
//        }
//    }
//}