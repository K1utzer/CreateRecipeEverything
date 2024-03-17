package com.klutzer.createrecipeeverythingmod.block.blocks;


import com.klutzer.createrecipeeverythingmod.item.AllItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class LilyOfTheValleyCropBlock extends CropBlock {
    public static final IntegerProperty AGE  = BlockStateProperties.AGE_3;
    public LilyOfTheValleyCropBlock(Properties p_52247_) {
        super(p_52247_);
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return AllItems.LILY_OF_THE_VALLEY_SEEDS.get();
    }
}
