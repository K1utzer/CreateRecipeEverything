package com.klutzer.createrecipeeverythingmod.block;

import com.klutzer.createrecipeeverythingmod.CreateRecipeEverything;
import com.klutzer.createrecipeeverythingmod.block.blocks.LilyOfTheValleyCropBlock;
import com.klutzer.createrecipeeverythingmod.block.blocks.MuscariCropBlock;
import com.klutzer.createrecipeeverythingmod.item.AllItems;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class AllBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreateRecipeEverything.MOD_ID);


    public static final RegistryObject<Block> MUSCARI_FLOWER = registerBlock("muscari_flower",
            () -> new FlowerBlock(MobEffects.LEVITATION, 5,BlockBehaviour.Properties.copy(Blocks.CORNFLOWER).noOcclusion()), CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> POTTED_MUSCARI_FLOWER = registerBlockWithoutBlockItem("potted_muscari_flower",
            () -> new FlowerPotBlock(null, AllBlocks.MUSCARI_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_CORNFLOWER).noOcclusion()));


    public static final RegistryObject<Block> MUSCARI_PLANT = registerBlockWithoutBlockItem("muscari_plant",
            () -> new MuscariCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> LILY_OF_THE_VALLEY_PLANT = registerBlockWithoutBlockItem("lily_of_the_valley_plant",
            () -> new LilyOfTheValleyCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> GRAVEL_WART = registerBlock("gravel_wart",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAVEL)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> COBBLE_WART = registerBlock("cobble_wart",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return AllItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
