package me.godsofmecraft.smpmod.datagen;

import me.godsofmecraft.smpmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture){
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.IRON_BUTTON)
                .add(ModBlocks.GOLDEN_BUTTON)
                .add(ModBlocks.GOLDEN_DOOR)
                .add(ModBlocks.GOLDEN_CHAIN)
                .add(ModBlocks.GOLDEN_LANTERN)
                .add(ModBlocks.GOLDEN_SOUL_LANTERN)
                .add(ModBlocks.GOLDEN_TRAPDOOR);



        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.IRON_BUTTON)
                .add(ModBlocks.GOLDEN_BUTTON)
                .add(ModBlocks.GOLDEN_DOOR)
                .add(ModBlocks.GOLDEN_CHAIN)
                .add(ModBlocks.GOLDEN_LANTERN)
                .add(ModBlocks.GOLDEN_SOUL_LANTERN)
                .add(ModBlocks.GOLDEN_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.GOLDEN_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(ModBlocks.GOLDEN_DOOR);

        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.GOLDEN_BUTTON)
                .add(ModBlocks.IRON_BUTTON);








    }
}
