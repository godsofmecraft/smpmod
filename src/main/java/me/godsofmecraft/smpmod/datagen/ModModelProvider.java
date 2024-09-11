package me.godsofmecraft.smpmod.datagen;

import me.godsofmecraft.smpmod.block.ModBlocks;
import me.godsofmecraft.smpmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.FacingBlock;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool goldPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GOLD_BLOCK);
        BlockStateModelGenerator.BlockTexturePool ironPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.IRON_BLOCK);

        goldPool.button(ModBlocks.GOLDEN_BUTTON);
        ironPool.button(ModBlocks.IRON_BUTTON);


        blockStateModelGenerator.registerTrapdoor(ModBlocks.GOLDEN_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.GOLDEN_DOOR);
        blockStateModelGenerator.registerLantern(ModBlocks.GOLDEN_LANTERN);
        blockStateModelGenerator.registerLantern(ModBlocks.GOLDEN_SOUL_LANTERN);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.COPPER_NUGGET, Models.GENERATED);



    }
}
