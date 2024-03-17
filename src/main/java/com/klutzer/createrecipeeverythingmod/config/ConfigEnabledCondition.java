package com.klutzer.createrecipeeverythingmod.config;

import com.google.gson.JsonObject;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;
import net.minecraft.resources.ResourceLocation;

public class ConfigEnabledCondition implements ICondition {
    private static final ResourceLocation ID = new ResourceLocation("createrecipeeverythingmod", "config_enabled");

    private final String configKey;

    public ConfigEnabledCondition(String configKey) {
        this.configKey = configKey;
    }
    @Override
    public ResourceLocation getID() {
        return ID;
    }

    @Override
    public boolean test() {
        // Direkte Prüfung auf den Wert der Konfigurationseinstellung
        switch (configKey) {
            case "Elytra Recipe":
                return CreateRecipeEverythingCommonConfig.ENABLE_ELYTRA_RECIPE.get();
            case "Netherite Ingot Recipe":
                return CreateRecipeEverythingCommonConfig.NETHERRITE_INGOT_RECIPE.get();
            case "Netherrack Recipe":
                return CreateRecipeEverythingCommonConfig.NETHERRACK_RECIPE.get();
            case "Blaze Rod Recipe":
                return CreateRecipeEverythingCommonConfig.BLAZE_ROD_RECIPE.get();
            case "Cobweb Recipe":
                return CreateRecipeEverythingCommonConfig.COBWEB_RECIPE.get();
            case "Gunpowder Recipe":
                return CreateRecipeEverythingCommonConfig.GUNPOWDER_RECIPE.get();
            case "Tuff Recipe":
                return CreateRecipeEverythingCommonConfig.TUFF_RECIPE.get();
            case "Diamond Recipe":
                return CreateRecipeEverythingCommonConfig.DIAMOND_RECIPE.get();
            case "Diamond Fragment Recipe":
                return CreateRecipeEverythingCommonConfig.DIAMOND_FRAGMENT_RECIPE.get();
            case "Gravel Wart Recipe":
                return CreateRecipeEverythingCommonConfig.GRAVEL_WART_RECIPE.get();
            case "Cobble Wart Recipe":
                return CreateRecipeEverythingCommonConfig.COBBLE_WART_RECIPE.get();
            case "Black Dye Recipe":
                return CreateRecipeEverythingCommonConfig.BLACK_DYE_RECIPE.get();
            case "Brown Dye Recipe":
                return CreateRecipeEverythingCommonConfig.BROWN_DYE_RECIPE.get();
            case "Yellow Dye Recipe":
                return CreateRecipeEverythingCommonConfig.YELLOW_DYE_RECIPE.get();
            case "Blue Dye Recipe":
                return CreateRecipeEverythingCommonConfig.BLUE_DYE_RECIPE.get();
            case "Saddle Recipe":
                return CreateRecipeEverythingCommonConfig.SADDLE_RECIPE.get();
            case "Leather Recipe":
                return CreateRecipeEverythingCommonConfig.LEATHER_RECIPE.get();
            case "Coal Dust Recipe":
                return CreateRecipeEverythingCommonConfig.COAL_DUST_RECIPE.get();
            case "Graphite Recipe":
                return CreateRecipeEverythingCommonConfig.GRAPHITE_RECIPE.get();
            case "String Recipe":
                return CreateRecipeEverythingCommonConfig.STRING_RECIPE.get();
            case "Feather Recipe":
                return CreateRecipeEverythingCommonConfig.FEATHER_RECIPE.get();
            default:
                return false;
        }
    }

    public static class Serializer implements IConditionSerializer<ConfigEnabledCondition> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public ConfigEnabledCondition read(JsonObject json) {
            String configKey = json.getAsJsonPrimitive("configKey").getAsString();
            return new ConfigEnabledCondition(configKey);
        }

        @Override
        public void write(JsonObject json, ConfigEnabledCondition value) {
            json.addProperty("configKey", value.configKey);
        }

        @Override
        public ResourceLocation getID() {
            return ConfigEnabledCondition.ID;
        }
    }
}