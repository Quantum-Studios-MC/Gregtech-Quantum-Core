package com.quantumstudios.gtquantumcore.Multiblocks;

import static gregtech.api.util.GTUtility.gregtechId;
import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

public class MultiblockHandler 
{
    public static SteamAlloyBlastFurnace STEAM_ALLOY_BLAST_FURNACE ;
    public static ElectricalSprengelPump ELECTRICAL_SPRENGEL_PUMP;
	
	public static void init()
	{
		ELECTRICAL_SPRENGEL_PUMP = registerMetaTileEntity(11011, 
				new ElectricalSprengelPump(gregtechId("electrical_sprengel_pump")));

        STEAM_ALLOY_BLAST_FURNACE = registerMetaTileEntity(11012, new SteamAlloyBlastFurnace(gregtechId("steam_alloy_blast_furnace")));
	}
}
