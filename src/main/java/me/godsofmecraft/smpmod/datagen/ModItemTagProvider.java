package me.godsofmecraft.smpmod.datagen;

import me.godsofmecraft.smpmod.block.ModBlocks;


import me.godsofmecraft.smpmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.TRAPDOORS)
                .add(ModBlocks.GOLDEN_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ItemTags.DOORS)
                .add(ModBlocks.GOLDEN_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.BUTTONS)
                .add(ModBlocks.IRON_BUTTON.asItem())
                .add(ModBlocks.GOLDEN_BUTTON.asItem());

        getOrCreateTagBuilder(ModTags.Items.METAL_BUTTONS)
                .add(ModBlocks.GOLDEN_BUTTON.asItem())
                .add(ModBlocks.IRON_BUTTON.asItem());









    }
}
