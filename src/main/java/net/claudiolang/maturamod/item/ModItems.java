package net.claudiolang.maturamod.item;

import net.claudiolang.maturamod.MaturaMod;
import net.claudiolang.maturamod.item.custom.stein_der_weisen;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {

    public static final Item Stein_der_Weisen = registerItem("stein_der_weisen", properties -> new stein_der_weisen(properties.durability(9)));


    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MaturaMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MaturaMod.MOD_ID, name)))));
    }

    public static void registerModItems() {
        MaturaMod.LOGGER.info("Registering Mod Items for " + MaturaMod.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(Stein_der_Weisen);

        });


    }
}
