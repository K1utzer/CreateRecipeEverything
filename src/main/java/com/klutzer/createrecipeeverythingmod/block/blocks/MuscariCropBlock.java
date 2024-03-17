package com.klutzer.createrecipeeverythingmod.block.blocks;


import com.klutzer.createrecipeeverythingmod.item.AllItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class MuscariCropBlock extends CropBlock {
    public static final IntegerProperty AGE  = BlockStateProperties.AGE_3;
    public MuscariCropBlock(Properties p_52247_) {
        super(p_52247_);
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return AllItems.MUSCARI_SEEDS.get();
    }
}
