package net.claudiolang.maturamod.creativemodetab;

import net.claudiolang.maturamod.MaturaMod;
import net.claudiolang.maturamod.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

    public static final CreativeModeTab Mystical_Item_Tab = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(MaturaMod.MOD_ID, "mystical_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Stein_der_Weisen))
                .title(Component.translatable("creativemodetab.maturamod.mystical_items"))
                .displayItems((parameters, output) ->{
                    output.accept(ModItems.Stein_der_Weisen);})
                .build());


    public static void registerModCreativeModeTabs(){
        MaturaMod.LOGGER.info("Registering Creative Mode Tabs for " + MaturaMod.MOD_ID);


    }
}
