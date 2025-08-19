package com.quantumstudios.gtquantumcore.item;

import com.quantumstudios.gtquantumcore.Tags;
import gregtech.api.items.metaitem.FoodUseManager;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.stats.IFoodBehavior;
import gregtech.api.items.metaitem.stats.IItemComponent;
import gregtech.api.items.metaitem.stats.IItemContainerItemProvider;
import gregtech.api.items.toolitem.IGTTool;
import gregtech.api.items.toolitem.ItemGTTool;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.util.RandomPotionEffect;
import gregtech.common.items.MetaItems;
import gregtech.common.items.ToolItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


import javax.annotation.Nonnull;
import java.lang.reflect.Field;

import static gregtech.api.unification.material.Materials.*;

import static net.minecraft.potion.Potion.getPotionById;

public class GTQuantumCoreMetaitem {

    public static IGTTool SPINDLE;
    public static IGTTool NEEDLE;
    public static IGTTool POT;

}
