package com.quantumstudios.gtquantumcore.common.metatileentities.Multiblocks;

import com.quantumstudios.gtquantumcore.common.metatileentities.single.steam.SteamAmmoPress;
import net.minecraft.util.ResourceLocation;

import static com.quantumstudios.gtquantumcore.Tags.MODID;
import static gregtech.api.util.GTUtility.gregtechId;
import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

public class MultiblockHandler 
{
    public static SteamAlloyBlastFurnace STEAM_ALLOY_BLAST_FURNACE ;
    public static ElectricalSprengelPump ELECTRICAL_SPRENGEL_PUMP;
	public static SteamSprengelPump STEAM_SPRENGEL_PUMP;
	public static SteamWiremill STEAM_WIREMILL;
	public static SteamStrandCaster STEAM_STRAND_CASTER;
	public static SteamAmmoPress STEAM_AMMO_PRESS;
	public static SteamVulcanisationVat STEAM_VULCANISATION_VAT;
	public static ElectricalLoom ELECTRICAL_LOOM;

	public static void init()
	{
		ELECTRICAL_SPRENGEL_PUMP = registerMetaTileEntity(11011, 
				new ElectricalSprengelPump(gregtechId("electrical_sprengel_pump")));

		STEAM_SPRENGEL_PUMP = registerMetaTileEntity(11013,
				new SteamSprengelPump(gregtechId("steam_sprengel_pump")));

        STEAM_ALLOY_BLAST_FURNACE = registerMetaTileEntity(11012, new SteamAlloyBlastFurnace(gregtechId("steam_alloy_blast_furnace")));

		STEAM_STRAND_CASTER = registerMetaTileEntity(11015, new SteamStrandCaster(gregtechId("steam_strand_caster")));

		STEAM_WIREMILL = registerMetaTileEntity(11016, new SteamWiremill(gregtechId("steam_wiremill")));

		STEAM_AMMO_PRESS = registerMetaTileEntity(11017, new SteamAmmoPress(new ResourceLocation(MODID, "steam_ammo_press"), true));
		STEAM_VULCANISATION_VAT = registerMetaTileEntity(11018, new SteamVulcanisationVat(gregtechId("steam_vulcanisation_vat")));
		ELECTRICAL_LOOM = registerMetaTileEntity(11019, new ElectricalLoom(gregtechId("electrical_loom")));


	}
}
