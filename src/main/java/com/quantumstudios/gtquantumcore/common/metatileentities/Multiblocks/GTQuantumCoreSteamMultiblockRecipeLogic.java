package com.quantumstudios.gtquantumcore.common.metatileentities.Multiblocks;

import gregtech.api.capability.IMultipleTankHandler;
import gregtech.api.capability.impl.SteamMultiblockRecipeLogic;
import gregtech.api.metatileentity.multiblock.RecipeMapSteamMultiblockController;
import gregtech.api.recipes.RecipeBuilder;

public class GTQuantumCoreSteamMultiblockRecipeLogic extends SteamMultiblockRecipeLogic {

    public GTQuantumCoreSteamMultiblockRecipeLogic(RecipeMapSteamMultiblockController metaTileEntity, double conversionRate) {
        super(metaTileEntity, metaTileEntity.getRecipeMap(), metaTileEntity.getSteamFluidTank(), conversionRate);
    }

    @Override
    public void applyParallelBonus(RecipeBuilder<?> builder) {
        int currentParallel = builder.getParallel();
        long currentRecipeEU = (long) (builder.getEUt() / currentParallel);
        int currentRecipeDuration = (int) (builder.getDuration() / this.getParallelLimit());

        builder.EUt((int) Math.ceil(currentRecipeEU * 1.33))
                .duration((int) (currentRecipeDuration * currentParallel * 1.5));
    }

    @Override
    protected IMultipleTankHandler getInputTank() {
        GTQuantumCoreRecipeMapSteamMultiblockController controller = (GTQuantumCoreRecipeMapSteamMultiblockController) this.metaTileEntity;
        return controller.getInputFluidInventory();
    }

    @Override
    protected IMultipleTankHandler getOutputTank() {
        GTQuantumCoreRecipeMapSteamMultiblockController controller = (GTQuantumCoreRecipeMapSteamMultiblockController) this.metaTileEntity;
        return controller.getOutputFluidInventory();
    }

    @Override
    protected long getMaxParallelVoltage() {
        return 32 * this.getParallelLimit();
    }

    @Override
    public long getMaxVoltage() {
        return 32;
    }
}