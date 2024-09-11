package me.godsofmecraft.smpmod;

import me.godsofmecraft.smpmod.block.ModBlocks;
import me.godsofmecraft.smpmod.item.ModItemGroups;
import me.godsofmecraft.smpmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Smpmod implements ModInitializer {
	public static final String MOD_ID = "smpmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

	}
}