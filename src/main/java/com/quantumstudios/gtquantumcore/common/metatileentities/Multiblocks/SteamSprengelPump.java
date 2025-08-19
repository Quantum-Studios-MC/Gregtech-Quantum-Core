package com.quantumstudios.gtquantumcore.common.metatileentities.Multiblocks;

import com.quantumstudios.gtquantumcore.recipes.RecipeMapsHandler;
import com.quantumstudios.gtquantumcore.render.TexturesHandler;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class SteamSprengelPump extends GTQuantumCoreRecipeMapSteamMultiblockController {

    public SteamSprengelPump(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, RecipeMapsHandler.STEAM_SPRENGEL_PUMP, CONVERSION_RATE);
        // Initialize the custom recipe logic with parallel processing
        this.recipeMapWorkable = new GTQuantumCoreSteamMultiblockRecipeLogic(this, CONVERSION_RATE);
        // Set parallel limit (adjust as needed for balance)
        this.recipeMapWorkable.setParallelLimit(1);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("FF#", "FF#", "FFF", "#F#")
                .aisle("FF#", "FF#", "FSF", "#F#")
                .where('S', selfPredicate())
                .where('F', states(getCasingState()).setMinGlobalLimited(7)
                        .or(autoAbilities(true, true, true, true, true))
                        .or(abilities(MultiblockAbility.IMPORT_FLUIDS))
                        .or(abilities(MultiblockAbility.EXPORT_FLUIDS)))
                .where('#', any())
                .build();
    }

    @Override
    public int getItemOutputLimit() {
        return 3;
    }

    @Override
    public int getFluidOutputLimit() {
        return 3;
    }

    private static IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.BRONZE_BRICKS);
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.BRONZE_PLATED_BRICKS;
    }

    @Override
    protected @NotNull ICubeRenderer getFrontOverlay() {
        return TexturesHandler.ELECTRICAL_SPRENGEL_PUMP_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new SteamSprengelPump(metaTileEntityId);
    }
}