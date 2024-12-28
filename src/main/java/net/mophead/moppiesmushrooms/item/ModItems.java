package net.mophead.moppiesmushrooms.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.mophead.moppiesmushrooms.MoppiesMushrooms;

public class ModItems {
    public static final Item Test=registerItem("test",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoppiesMushrooms.MOD_ID,"test")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoppiesMushrooms.MOD_ID, name), item);
    }

    public static void registerModItems () {
        MoppiesMushrooms.LOGGER.info("Registering Mod Items for " + MoppiesMushrooms.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(Test);
        });
    }
}
