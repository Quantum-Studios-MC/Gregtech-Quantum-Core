package com.quantumstudios.gtquantumcore.Multiblocks;

import org.jetbrains.annotations.NotNull;

import com.quantumstudios.gtquantumcore.blocks.GTQUMultiblockCasing;
import com.quantumstudios.gtquantumcore.blocks.MetaBlocksHandler;
import com.quantumstudios.gtquantumcore.recipes.RecipeMapsHandler;
import com.quantumstudios.gtquantumcore.render.TexturesHandler;

import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.api.pattern.FactoryBlockPattern;
import net.minecraft.block.state.IBlockState;
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
				.aisle("FF#","FF#","FFF","#F#")
				.aisle("FF#","FF#","FSF","#F#")
				.where('S', selfPredicate())
				.where('F', states(getCasingState()).or(autoAbilities()))
				.where('#', any())	
				.build();
	}
	
	private static IBlockState getCasingState() 
	{
        return MetaBlocksHandler.MULTIBLOCK_CASING.getState(GTQUMultiblockCasing.CasingType.SEALED_CASING);
    }
	
	//@SideOnly(Side.CLIENT)
	@Override
	public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) 
	{
		return TexturesHandler.SEALED_CASING;
	}

	//@SideOnly(Side.CLIENT)
	@Override
	protected @NotNull ICubeRenderer getFrontOverlay()
	{
		return TexturesHandler.ELECTRICAL_SPRENGEL_PUMP_OVERLAY;
	}
}
