package com.quantumstudios.gtquantumcore.Multiblocks;

import static gregtech.api.util.GTUtility.gregtechId;
import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

public class MultiblockHandler 
{
	public static ElectricalSprengelPump ELECTRICAL_SPRENGEL_PUMP;
	
	public static void init()
	{
		ELECTRICAL_SPRENGEL_PUMP = registerMetaTileEntity(11011, 
				new ElectricalSprengelPump(gregtechId("electrical_sprengel_pump")));
	}
}
