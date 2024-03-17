package com.klutzer.createrecipeeverythingmod.world;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class AllPlaced {

    public static final Holder<PlacedFeature> MUSCARI_PLACED =
            PlacementUtils.register("muscari_placed",
                    AllConfigure.MUSCARI,
                    RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP,
                    BiomeFilter.biome());

}
