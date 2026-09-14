package net.claudiolang.maturamod;
//Mod für die Matura von Claudio Lang

import net.claudiolang.maturamod.creativemodetab.ModCreativeModeTabs;
import net.claudiolang.maturamod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.resources.Identifier;

import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MaturaMod implements ModInitializer {
	public static final String MOD_ID = "matura-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();
		ModItems.registerModItems();
		//ModBlocks.registerModBlocks();
		LootTableEvents.MODIFY.register(((key, tableBuilder, source, registries) -> {
			if (source.isBuiltin() && key.equals(BuiltInLootTables.DESERT_PYRAMID)){
				LootPool.Builder desert_pyramid_loot = LootPool.lootPool()
						.add(LootItem.lootTableItem(ModItems.stein_der_weisen))
								.when(LootItemRandomChanceCondition.randomChance(0.05f));
				tableBuilder.withPool(desert_pyramid_loot);
			}
		}));

	}


	}

