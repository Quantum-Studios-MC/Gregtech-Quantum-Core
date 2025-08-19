package com.quantumstudios.gtquantumcore.common.metatileentities.Multiblocks;

import gregtech.api.capability.IMultipleTankHandler;
import gregtech.api.capability.impl.FluidTankList;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapSteamMultiblockController;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.recipes.RecipeMap;
import gregtech.client.utils.TooltipHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public abstract class GTQuantumCoreRecipeMapSteamMultiblockController extends RecipeMapSteamMultiblockController {

	protected IMultipleTankHandler fluidInput;
	protected IMultipleTankHandler fluidOutput;

	public GTQuantumCoreRecipeMapSteamMultiblockController(ResourceLocation metaTileEntityId, RecipeMap<?> recipeMap, double conversionRate) {
		super(metaTileEntityId, recipeMap, conversionRate);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World world, @Nonnull List<String> tooltip, boolean advanced) {
		super.addInformation(stack, world, tooltip, advanced);
		tooltip.add(net.minecraft.client.resources.I18n.format("gregtech.multiblock.steam_.duration_modifier"));
		tooltip.add(net.minecraft.client.resources.I18n.format("gregtech.universal.tooltip.parallel", this.recipeMapWorkable.getParallelLimit()));
		tooltip.add(String.valueOf(TooltipHelper.BLINKING_ORANGE) + net.minecraft.client.resources.I18n.format("gregtech.multiblock.require_steam_parts"));
	}

	@Override
	protected void formStructure(PatternMatchContext context) {
		super.formStructure(context);
		this.fluidInput = new FluidTankList(true, this.getAbilities(MultiblockAbility.IMPORT_FLUIDS));
		this.fluidOutput = new FluidTankList(true, this.getAbilities(MultiblockAbility.EXPORT_FLUIDS));
	}

	@Override
	public void invalidateStructure() {
		super.invalidateStructure();
		this.fluidInput = new FluidTankList(true);
		this.fluidOutput = new FluidTankList(true);
	}

	public IMultipleTankHandler getInputFluidInventory() {
		return this.fluidInput;
	}

	public IMultipleTankHandler getOutputFluidInventory() {
		return this.fluidOutput;
	}

	@Override
	public boolean hasMaintenanceMechanics() {
		return false;
	}
}