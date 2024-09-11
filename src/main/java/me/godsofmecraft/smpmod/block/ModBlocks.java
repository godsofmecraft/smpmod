package me.godsofmecraft.smpmod.block;

import me.godsofmecraft.smpmod.Smpmod;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlag;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block IRON_BUTTON = registerBlock("iron_button",
            new ButtonBlock(BlockSetType.IRON, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));

    public static final Block GOLDEN_TRAPDOOR = registerBlock("golden_trapdoor",
            new TrapdoorBlock(BlockSetType.GOLD, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));
    public static final Block GOLDEN_DOOR = registerBlock("golden_door",
            new DoorBlock(BlockSetType.GOLD, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));
    public static final Block GOLDEN_BUTTON = registerBlock("golden_button",
            new ButtonBlock(BlockSetType.GOLD, 12, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));

    public static final Block GOLDEN_CHAIN = registerBlock("golden_chain",
            new ChainBlock(AbstractBlock.Settings.copy(Blocks.CHAIN)));
    public static final Block GOLDEN_LANTERN = registerBlock("golden_lantern",
            new LanternBlock(AbstractBlock.Settings.copy(Blocks.LANTERN)));
    public static final Block GOLDEN_SOUL_LANTERN = registerBlock("golden_soul_lantern",
            new LanternBlock(AbstractBlock.Settings.copy(Blocks.SOUL_LANTERN)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Smpmod.MOD_ID, name), block);
    }




    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Smpmod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registerModBlocks() {
        Smpmod.LOGGER.info("Registering Mod Blocks for " + Smpmod.MOD_ID);
    }
}
