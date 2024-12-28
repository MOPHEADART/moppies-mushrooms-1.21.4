package net.mophead.moppiesmushrooms.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mophead.moppiesmushrooms.MoppiesMushrooms;
import net.mophead.moppiesmushrooms.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup MOPPIES_MUSHROOMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoppiesMushrooms.MOD_ID, "moppies_mushrooms"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.Test))
                    .displayName(Text.translatable("itemgroup.moppies-mushrooms.moppies_mushrooms"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.Test);


                        entries.add(ModBlocks.Test_Block);

                    }).build());


    public static void registerItemGroups() {
        MoppiesMushrooms.LOGGER.info("Registering Item Groups for " + MoppiesMushrooms.MOD_ID);
    }
}
