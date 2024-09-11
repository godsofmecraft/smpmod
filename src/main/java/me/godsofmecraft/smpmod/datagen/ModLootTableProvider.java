package me.godsofmecraft.smpmod.datagen;

import me.godsofmecraft.smpmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.IRON_BUTTON);

        addDrop(ModBlocks.GOLDEN_TRAPDOOR);
        addDrop(ModBlocks.GOLDEN_BUTTON);
        addDrop(ModBlocks.GOLDEN_CHAIN);
        addDrop(ModBlocks.GOLDEN_LANTERN);
        addDrop(ModBlocks.GOLDEN_SOUL_LANTERN);

        addDrop(ModBlocks.GOLDEN_DOOR, doorDrops(ModBlocks.GOLDEN_DOOR));


    }
}
