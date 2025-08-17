package com.quantumstudios.gtquantumcore.Multiblocks;

import com.quantumstudios.gtquantumcore.blocks.GTQUMultiblockCasing;
import com.quantumstudios.gtquantumcore.blocks.MetaBlocksHandler;
import com.quantumstudios.gtquantumcore.recipes.RecipeMapsHandler;
import com.quantumstudios.gtquantumcore.render.TexturesHandler;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.metatileentity.multiblock.RecipeMapSteamMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.recipes.RecipeMap;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.ConfigHolder;
import gregtech.common.blocks.BlockFireboxCasing;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class SteamSprengelPump extends RecipeMapSteamMultiblockController {

    public SteamSprengelPump(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, RecipeMapsHandler.STEAM_SPRENGEL_PUMP, CONVERSION_RATE);
    }


    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("FF#", "FF#", "FFF", "#F#")
                .aisle("FF#", "FF#", "FSF", "#F#")
                .where('S', selfPredicate())
                .where('F', states(getCasingState()).setMinGlobalLimited(7).or(autoAbilities()).or(abilities(MultiblockAbility.IMPORT_FLUIDS).or(abilities(MultiblockAbility.EXPORT_FLUIDS))))
                .where('#', any())
                .build();
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false
                ;
    }

    @Override
    public int getItemOutputLimit() {
        return 1;
    }

    @Override
    public int getFluidOutputLimit() {
        return 1;
    }

    private static IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.BRONZE_BRICKS);
    }

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