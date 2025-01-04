package net.mophead.moppiesmushrooms.block;

//import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
//import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.mophead.moppiesmushrooms.MoppiesMushrooms;


public class ModBlocks {
    public static final Block Test_Block = registerBlock("test_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoppiesMushrooms.MOD_ID, "test_block")))
                    .strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block Enoki_Mushroom = registerBlock("enoki_mushroom",
            new PlantBlock(AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoppiesMushrooms.MOD_ID, "enoki_mushroom")))
                    .sounds(BlockSoundGroup.FUNGUS)) {
                @Override
                protected MapCodec<? extends PlantBlock> getCodec() {
                    return null;
                }
            });

    public static final Block Lions_Mane = registerBlock("lions_mane",
            new PlantBlock(AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoppiesMushrooms.MOD_ID, "lions_mane")))
                    .sounds(BlockSoundGroup.FUNGUS)) {
                @Override
                protected MapCodec<? extends PlantBlock> getCodec() {
                    return null;
                }
            });


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoppiesMushrooms.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MoppiesMushrooms.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoppiesMushrooms.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }

    public static void registerModBlocks() {
        MoppiesMushrooms.LOGGER.info("Registering Mod Blocks for " + MoppiesMushrooms.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            //entries.add(ModBlocks.Test_Block);
        //});
    }
}
