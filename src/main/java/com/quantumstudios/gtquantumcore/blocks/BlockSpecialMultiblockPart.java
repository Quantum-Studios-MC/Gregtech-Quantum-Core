package com.quantumstudios.gtquantumcore.blocks;

import org.jetbrains.annotations.NotNull;

import gregtech.api.block.VariantActiveBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockSpecialMultiblockPart extends VariantActiveBlock<BlockSpecialMultiblockPart.BlockSpecialMultiblockPartType>
{
	public BlockSpecialMultiblockPart() {
        super(Material.IRON);
        setTranslationKey("gtqu_special_part");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel("wrench", 2);
        setDefaultState(getState(BlockSpecialMultiblockPartType.LV_PUMP_STATION));
    }
	
	@Override
    public boolean canCreatureSpawn(@NotNull IBlockState state, @NotNull IBlockAccess world, @NotNull BlockPos pos,
                                    @NotNull EntityLiving.SpawnPlacementType type) {
        return false;
    }
	
	public enum BlockSpecialMultiblockPartType implements IStringSerializable {

        LV_PUMP_STATION("lv_pump_station");

        private final String name;

        BlockSpecialMultiblockPartType(String name) {
            this.name = name;
        }

        @Override
        public @NotNull String getName() {
            return this.name;
        }
    }
	
	@Override
    protected boolean isBloomEnabled(BlockSpecialMultiblockPartType value) 
	{
		return false;
	}
}
