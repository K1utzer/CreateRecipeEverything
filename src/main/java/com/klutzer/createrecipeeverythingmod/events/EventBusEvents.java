package com.klutzer.createrecipeeverythingmod.events;

import com.klutzer.createrecipeeverythingmod.CreateRecipeEverything;
import com.klutzer.createrecipeeverythingmod.events.loot.LilySeedFromLilyFlower;
import com.klutzer.createrecipeeverythingmod.events.loot.MuscariSeedFromMuscariFlower;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = CreateRecipeEverything.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new LilySeedFromLilyFlower.Serializer().setRegistryName
                        (new ResourceLocation(CreateRecipeEverything.MOD_ID,"lily_seeds_from_flower")),
                new MuscariSeedFromMuscariFlower.Serializer().setRegistryName
                        (new ResourceLocation(CreateRecipeEverything.MOD_ID,"muscari_seeds_from_flower"))
        );
    }
}