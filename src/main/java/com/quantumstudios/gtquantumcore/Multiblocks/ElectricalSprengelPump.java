package com.quantumstudios.gtquantumcore.Multiblocks;

import org.jetbrains.annotations.NotNull;

import com.quantumstudios.gtquantumcore.recipes.RecipeMapsHandler;

import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.blocks.BlockMetalCasing.MetalCasingType;
import gregtech.common.blocks.MetaBlocks;
import gregtech.api.pattern.FactoryBlockPattern;
import net.minecraft.util.ResourceLocation;

public class ElectricalSprengelPump extends RecipeMapMultiblockController 
{
	public ElectricalSprengelPump(ResourceLocation metaTileEntityId)
	{
		super(metaTileEntityId, RecipeMapsHandler.ELECTRICAL_SPRENGEL_PUMP_MAP);
	}
	
	@Override
	public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) 
	{
		return new ElectricalSprengelPump(metaTileEntityId);
	}
	
	@Override
	protected BlockPattern createStructurePattern()
	{
		return FactoryBlockPattern.start()
				.aisle("FFF")
				.aisle("#F#")
				.aisle("FSF")
				.where('S', selfPredicate())
				.where('F', states(MetaBlocks.METAL_CASING.getState(MetalCasingType.STEEL_SOLID)).or(autoAbilities()))
				.where('#', air())	
				.build();
	}

	//@SideOnly(Side.CLIENT)
	@Override
	public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) 
	{
		return gregtech.client.renderer.texture.Textures.SOLID_STEEL_CASING;
	}

	//@SideOnly(Side.CLIENT)
	@Override
	protected @NotNull ICubeRenderer getFrontOverlay()
	{
		return gregtech.client.renderer.texture.Textures.FORGE_HAMMER_OVERLAY;
	}
}
