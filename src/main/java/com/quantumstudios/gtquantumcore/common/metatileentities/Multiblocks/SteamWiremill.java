package com.quantumstudios.gtquantumcore.common.metatileentities.Multiblocks;

import com.quantumstudios.gtquantumcore.blocks.GTQUMultiblockCasing;
import com.quantumstudios.gtquantumcore.blocks.MetaBlocksHandler;
import com.quantumstudios.gtquantumcore.render.TexturesHandler;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import gregtech.api.recipes.RecipeMaps;

public class SteamWiremill extends GTQuantumCoreRecipeMapSteamMultiblockController {

	public SteamWiremill(ResourceLocation metaTileEntityId) {
		super(metaTileEntityId, RecipeMaps.WIREMILL_RECIPES, CONVERSION_RATE);
		// Initialize the custom recipe logic with parallel processing
		this.recipeMapWorkable = new GTQuantumCoreSteamMultiblockRecipeLogic(this, CONVERSION_RATE);
		// Set parallel limit (adjust as needed for balance)
		this.recipeMapWorkable.setParallelLimit(4);
	}

	@Override
	public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
		return new SteamWiremill(metaTileEntityId);
	}

	@Override
	protected BlockPattern createStructurePattern() {
		return FactoryBlockPattern.start()
				.aisle("FF", "FF", "FF")
				.aisle("SF", "FF", "FF")
				.where('S', selfPredicate())
				.where('F', states(getCasingState()).setMinGlobalLimited(3)
						.or(autoAbilities(true, true, true, true, true))
						.or(abilities(MultiblockAbility.IMPORT_FLUIDS))
						.or(abilities(MultiblockAbility.EXPORT_FLUIDS)))
				.where('#', any())
				.build();
	}

	private static IBlockState getCasingState() {
		return MetaBlocksHandler.MULTIBLOCK_CASING.getState(GTQUMultiblockCasing.CasingType.NICKEL_STEEL_CASING);
	}

	@Override
	public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
		return TexturesHandler.NICKEL_STEEL_CASING;
	}

	@Override
	protected @NotNull ICubeRenderer getFrontOverlay() {
		return TexturesHandler.ELECTRICAL_SPRENGEL_PUMP_OVERLAY;
	}
}