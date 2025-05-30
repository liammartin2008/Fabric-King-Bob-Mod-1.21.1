package com.thelim23.kingbobmod.item;

import com.thelim23.kingbobmod.KingBobMod;
import com.thelim23.kingbobmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup KING_BOB_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(KingBobMod.MOD_ID, "king_bob"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CHEESE))
                    .displayName(Text.translatable("itemgroup.kingbobmod.king_bob"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);

                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);

                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

                        entries.add(ModItems.CHEESE);
                        entries.add(ModItems.BANANA);
                    }).build());

    public static void registerItemGroups() {
        KingBobMod.LOGGER.info("Registering Item Groups for " + KingBobMod.MOD_ID);
    }
}
