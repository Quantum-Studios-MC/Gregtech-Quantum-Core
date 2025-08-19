package com.quantumstudios.gtquantumcore.tools;


import com.quantumstudios.gtquantumcore.Tags;
import com.quantumstudios.gtquantumcore.item.GTQuantumCoreMetaitems;
import gregtech.api.GTValues;
import gregtech.api.items.toolitem.ItemGTSword;
import gregtech.api.items.toolitem.ItemGTTool;
import gregtech.api.items.toolitem.ToolClasses;
import gregtech.api.items.toolitem.ToolHelper;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.common.items.ToolItems;
import gregtech.core.sound.GTSoundEvents;
//import gregtechfoodoption.GTFOValues;
import com.quantumstudios.gtquantumcore.item.GTQuantumCoreMetaitem;
import net.minecraft.init.Enchantments;


public class GTQuantumCoreToolItems {
    public static String SPINDLE_CLASS = "spindle";
    public static String NEEDLE_CLASS = "needle";
    public static String POT_CLASS = "pot";



    public static void init() {
        GTQuantumCoreMetaitem.SPINDLE = ToolItems.register(ItemGTTool.Builder.of(Tags.MODID, "spindle")
                .toolStats(b -> b.crafting())
                .oreDict("craftingToolSpindle")
                .toolClasses(SPINDLE_CLASS));

        GTQuantumCoreMetaitem.NEEDLE = ToolItems.register(ItemGTTool.Builder.of(Tags.MODID, "needle")
                .toolStats(b -> b.crafting())
                .oreDict("craftingToolNeedle")
                .toolClasses(NEEDLE_CLASS));

        GTQuantumCoreMetaitem.POT = ToolItems.register(ItemGTTool.Builder.of(Tags.MODID, "pot")
                .toolStats(b -> b.crafting())
                .oreDict("toolPot")
                .toolClasses(POT_CLASS));
    }

}




