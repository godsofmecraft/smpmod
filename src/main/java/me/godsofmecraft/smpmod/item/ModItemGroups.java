package me.godsofmecraft.smpmod.item;

import me.godsofmecraft.smpmod.Smpmod;
import me.godsofmecraft.smpmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup SMP_MOD_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Smpmod.MOD_ID, "smp_mod_item_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.GOLDEN_TRAPDOOR))
                    .displayName(Text.translatable("itemgroup.smpmod.smp_mod_items_group"))
                    .entries((displayContext, entries) -> {
                         entries.add(ModBlocks.GOLDEN_TRAPDOOR);
                        entries.add(ModBlocks.GOLDEN_DOOR);
                        entries.add(ModBlocks.GOLDEN_BUTTON);
                        entries.add(ModBlocks.GOLDEN_CHAIN);
                        entries.add(ModBlocks.GOLDEN_LANTERN);
                        entries.add(ModBlocks.GOLDEN_SOUL_LANTERN);
                        entries.add(ModBlocks.IRON_BUTTON);
                        entries.add(ModItems.COPPER_NUGGET);
                    }).build());


    public static void registerItemGroups() {
        Smpmod.LOGGER.info("Registering Item Groups for" +Smpmod.MOD_ID);
    }
}
