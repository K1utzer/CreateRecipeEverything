package com.klutzer.createrecipeeverythingmod.item;

import com.klutzer.createrecipeeverythingmod.CreateRecipeEverything;
import com.klutzer.createrecipeeverythingmod.block.AllBlocks;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import com.tterrag.registrate.util.entry.ItemEntry;


public class AllItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateRecipeEverything.MOD_ID);



    public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> UNPROCESSED_GRAPHITE_FRAGMENT = ITEMS.register("unprocessed_coal_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INCOMPLETE_ELYTRA = ITEMS.register("incomplete_elytra",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GRAPHITE_INGOT = ITEMS.register("graphite_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DIAMOND_FRAGMENT = ITEMS.register("diamond_fragment",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> MUSCARI_SEEDS = ITEMS.register("muscari_seeds",
            () -> new ItemNameBlockItem(AllBlocks.MUSCARI_PLANT.get(), new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> LILY_OF_THE_VALLEY_SEEDS = ITEMS.register("lily_of_the_valley_seeds",
            () -> new ItemNameBlockItem(AllBlocks.LILY_OF_THE_VALLEY_PLANT.get(), new Item.Properties().tab(CreativeModeTab.TAB_MISC)));



    public static void register(IEventBus event){
        ITEMS.register(event);
    }


}
