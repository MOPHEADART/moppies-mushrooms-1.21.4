package net.mophead.moppiesmushrooms.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.mophead.moppiesmushrooms.MoppiesMushrooms;

public class Modtags {
    public static class Blocks {

        private static TagKey <Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MoppiesMushrooms.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TEST_ITEMS = createTag("test_items");

        private static TagKey <Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(MoppiesMushrooms.MOD_ID, name));
        }
    }
}
