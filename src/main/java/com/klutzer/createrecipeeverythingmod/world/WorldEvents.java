package com.klutzer.createrecipeeverythingmod.world;

import com.klutzer.createrecipeeverythingmod.CreateRecipeEverything;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CreateRecipeEverything.MOD_ID)
public class WorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        FlowerGeneration.generateFlowers(event);
    }
}