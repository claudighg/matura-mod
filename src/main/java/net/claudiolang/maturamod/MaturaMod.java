package net.claudiolang.maturamod;

import net.claudiolang.maturamod.ModBlock.ModBlocks;
import net.claudiolang.maturamod.creativemodetab.ModCreativeModeTabs;
import net.claudiolang.maturamod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MaturaMod implements ModInitializer {
	public static final String MOD_ID = "matura-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}

	/*public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
		*/

	}

