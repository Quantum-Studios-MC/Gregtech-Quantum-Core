package com.quantumstudios.gtquantumcore.recipes;

import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;

public class RecipeMapsHandler 
{
	public static final RecipeMap<SimpleRecipeBuilder> ELECTRICAL_SPRENGEL_PUMP_MAP = new RecipeMap<>("electrical_sprengel_pump", 3, 1, 0, 0,
			new SimpleRecipeBuilder().duration(10).EUt(8), false);
	//		.setSlotOverlay(false, false, false, gregtech.client.renderer.texture.Textures.)
	//		.setSlotOverlay(true, true, true, gregtech.client.renderer.texture.Textures.SIFTER_OVERLAY)
	//		.setProgressBar()

	public static final RecipeMap<SimpleRecipeBuilder> STEAM_ALLOY_BLAST_FURNACE = new RecipeMap<>("steam_alloy_furnace", 4, 0, 1, 1,
			new SimpleRecipeBuilder().duration(10).EUt(8), false);

		public static final RecipeMap<SimpleRecipeBuilder> STEAM_SPRENGEL_PUMP = new RecipeMap<>("steam_sprengel_pump", 3, 1, 0, 0,
			new SimpleRecipeBuilder().duration(10).EUt(8), false);


}
