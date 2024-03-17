package com.klutzer.createrecipeeverythingmod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CreateRecipeEverythingCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_ELYTRA_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> NETHERRITE_INGOT_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> NETHERRACK_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> BLAZE_ROD_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> COBWEB_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> GUNPOWDER_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> TUFF_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> DIAMOND_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> DIAMOND_FRAGMENT_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> GRAVEL_WART_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> COBBLE_WART_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> BLACK_DYE_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> BROWN_DYE_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> YELLOW_DYE_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> BLUE_DYE_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> SADDLE_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> LEATHER_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> COAL_DUST_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> GRAPHITE_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> STRING_RECIPE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> FEATHER_RECIPE;

    static {
        BUILDER.push("Config for Create: Recipe Everything Mod");

        ENABLE_ELYTRA_RECIPE = BUILDER
                .comment("Enable recipe for Elytra")
                .define("Elytra Recipe", true);

        NETHERRITE_INGOT_RECIPE = BUILDER
                .comment("Enable recipe for Netherite Ingot")
                .define("Netherite Ingot Recipe", true);

        NETHERRACK_RECIPE = BUILDER
                .comment("Enable recipe for Netherrack")
                .define("Netherrack Recipe", true);

        BLAZE_ROD_RECIPE = BUILDER
                .comment("Enable recipe for Blaze Rod")
                .define("Blaze Rod Recipe", true);

        COBWEB_RECIPE = BUILDER
                .comment("Enable recipe for Cobweb")
                .define("Cobweb Recipe", true);

        GUNPOWDER_RECIPE = BUILDER
                .comment("Enable recipe for Gunpowder")
                .define("Gunpowder Recipe", true);

        TUFF_RECIPE = BUILDER
                .comment("Enable recipe for Tuff")
                .define("Tuff Recipe", true);

        DIAMOND_RECIPE = BUILDER
                .comment("Enable recipe for Diamond")
                .define("Diamond Recipe", true);

        DIAMOND_FRAGMENT_RECIPE = BUILDER
                .comment("Enable recipe for Diamond Fragment")
                .define("Diamond Fragment Recipe", true);

        GRAVEL_WART_RECIPE = BUILDER
                .comment("Enable recipe for Gravel Wart")
                .define("Gravel Wart Recipe", true);

        COBBLE_WART_RECIPE = BUILDER
                .comment("Enable recipe for Cobble Wart")
                .define("Cobble Wart Recipe", true);

        BLACK_DYE_RECIPE = BUILDER
                .comment("Enable recipe for Black Dye")
                .define("Black Dye Recipe", true);

        BROWN_DYE_RECIPE = BUILDER
                .comment("Enable recipe for Brown Dye")
                .define("Brown Dye Recipe", true);

        YELLOW_DYE_RECIPE = BUILDER
                .comment("Enable recipe for Yellow Dye")
                .define("Yellow Dye Recipe", true);

        BLUE_DYE_RECIPE = BUILDER
                .comment("Enable recipe for Blue Dye")
                .define("Blue Dye Recipe", true);

        SADDLE_RECIPE = BUILDER
                .comment("Enable recipe for Saddle")
                .define("Saddle Recipe", true);

        LEATHER_RECIPE = BUILDER
                .comment("Enable recipe for Leather")
                .define("Leather Recipe", true);

        COAL_DUST_RECIPE = BUILDER
                .comment("Enable recipe for Coal Dust")
                .define("Coal Dust Recipe", true);

        GRAPHITE_RECIPE = BUILDER
                .comment("Enable recipe for Graphite")
                .define("Graphite Recipe", true);

        STRING_RECIPE = BUILDER
                .comment("Enable recipe for String")
                .define("String Recipe", true);

        FEATHER_RECIPE = BUILDER
                .comment("Enable recipe for Feather")
                .define("Feather Recipe", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
