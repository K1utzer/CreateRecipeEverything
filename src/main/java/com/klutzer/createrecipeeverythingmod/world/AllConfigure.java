package com.klutzer.createrecipeeverythingmod.world;

import com.klutzer.createrecipeeverythingmod.block.AllBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class AllConfigure {

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> MUSCARI =
            FeatureUtils.register("muscari_spawn",
                    Feature.FLOWER,
                    new RandomPatchConfiguration(
                            32,
                            6,
                            2,
                            PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                    new SimpleBlockConfiguration(BlockStateProvider.simple(AllBlocks.MUSCARI_FLOWER.get())))));
}
