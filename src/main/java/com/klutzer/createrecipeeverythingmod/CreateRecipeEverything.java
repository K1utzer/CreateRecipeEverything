package com.klutzer.createrecipeeverythingmod;

import com.klutzer.createrecipeeverythingmod.config.ConfigEnabledCondition;
import com.klutzer.createrecipeeverythingmod.config.CreateRecipeEverythingCommonConfig;
import com.klutzer.createrecipeeverythingmod.item.AllItems;
import com.klutzer.createrecipeeverythingmod.block.AllBlocks;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static com.klutzer.createrecipeeverythingmod.CreateRecipeEverything.MOD_ID;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MOD_ID)
public class CreateRecipeEverything
{
    public static final String MOD_ID = "createrecipeeverythingmod";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public CreateRecipeEverything()
    {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CreateRecipeEverythingCommonConfig.SPEC, "createrecipeeverything-common.toml");

        
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        AllItems.register(eventBus);
        AllBlocks.register(eventBus);
        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);


        MinecraftForge.EVENT_BUS.register(this);
    }
    private void clientSetup(final FMLClientSetupEvent event){
        ItemBlockRenderTypes.setRenderLayer(AllBlocks.MUSCARI_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllBlocks.MUSCARI_FLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllBlocks.POTTED_MUSCARI_FLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllBlocks.LILY_OF_THE_VALLEY_PLANT.get(), RenderType.cutout());
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AllBlocks.MUSCARI_FLOWER.getId(), AllBlocks.POTTED_MUSCARI_FLOWER);
        });
        CraftingHelper.register(ConfigEnabledCondition.Serializer.INSTANCE);
    }
}
