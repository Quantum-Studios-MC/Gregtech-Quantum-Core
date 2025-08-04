package com.quantumstudios.gtquantumcore.render;

import com.quantumstudios.gtquantumcore.Tags;

import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = Tags.MODID, value = Side.CLIENT)
public final class TexturesHandler 
{
	// Casings
	
	public static SimpleOverlayRenderer SEALED_CASING;
	
	// Controller Overlays
	
	public static OrientedOverlayRenderer ELECTRICAL_SPRENGEL_PUMP_OVERLAY;
	
	private TexturesHandler() {}
	
	public static void init() 
	{
		SEALED_CASING = new SimpleOverlayRenderer("casings/gtqu_multiblock_casing/sealed_casing");
		
		ELECTRICAL_SPRENGEL_PUMP_OVERLAY = new OrientedOverlayRenderer("machines/esp");
	}
}
