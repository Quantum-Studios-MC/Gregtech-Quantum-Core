package com.quantumstudios.gtquantumcore.recipes;

import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;

public class RecipeMapsHandler 
{
	public static final RecipeMap<SimpleRecipeBuilder> ELECTRICAL_SPRENGEL_PUMP_MAP = new RecipeMap<>("electrical_sprengel_pump", 2, 3, 0, 0,
			new SimpleRecipeBuilder().duration(10).EUt(2), false);
	//		.setSlotOverlay(false, false, false, gregtech.client.renderer.texture.Textures.)
	//		.setSlotOverlay(true, true, true, gregtech.client.renderer.texture.Textures.SIFTER_OVERLAY)
	//		.setProgressBar()
}
