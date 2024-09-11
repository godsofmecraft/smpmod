package me.godsofmecraft.smpmod.item;

import me.godsofmecraft.smpmod.Smpmod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Smpmod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Smpmod.LOGGER.info("Registering Mod Items for" + Smpmod.MOD_ID);
    }

}
