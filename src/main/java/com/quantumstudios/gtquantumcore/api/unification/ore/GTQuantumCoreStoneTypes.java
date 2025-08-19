//package com.quantumstudios.gtquantumcore.api.unification.ore;
//
//
//import gregtech.api.unification.material.Materials;
//import gregtech.api.unification.ore.StoneType;
//
//import micdoodle8.mods.galacticraft.core.GCBlocks;
//import micdoodle8.mods.galacticraft.core.blocks.BlockBasicMoon;
//import micdoodle8.mods.galacticraft.planets.mars.blocks.BlockBasicMars;
//import micdoodle8.mods.galacticraft.planets.mars.blocks.MarsBlocks;
//import micdoodle8.mods.galacticraft.planets.venus.VenusBlocks;
//import micdoodle8.mods.galacticraft.planets.venus.blocks.BlockBasicVenus;
//import net.minecraft.block.SoundType;
//
//public class GTQuantumCoreStoneTypes {
//
//    private GTQuantumCoreStoneTypes() {
//    }
//
//    public static void init() {
//
//        new StoneType(31, "moonrock", SoundType.STONE, GTQuantumCoreOrePrefix.oreMoonRock, Materials.Copper,
//                () -> GCBlocks.blockMoon.getStateFromMeta(4),
//                state -> state.getBlock() instanceof BlockBasicMoon
//                        && state.equals(GCBlocks.blockMoon.getStateFromMeta(4)), true);
//
//        new StoneType(32, "marsrock", SoundType.STONE, GTQuantumCoreOrePrefix.oreMarsRock, Materials.Copper,
//                () -> MarsBlocks.marsBlock.getStateFromMeta(9),
//                state -> state.getBlock() instanceof BlockBasicMars
//                        && state.equals(MarsBlocks.marsBlock.getStateFromMeta(9)), true);
//
//        new StoneType(33, "venusrock", SoundType.STONE, GTQuantumCoreOrePrefix.oreVenusRock, Materials.Copper,
//                () -> VenusBlocks.venusBlock.getStateFromMeta(1),
//                state -> state.getBlock() instanceof BlockBasicVenus
//                        && state.equals(VenusBlocks.venusBlock.getStateFromMeta(1)), true);
//    }
//}