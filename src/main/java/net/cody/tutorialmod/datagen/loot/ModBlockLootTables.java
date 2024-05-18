package net.cody.tutorialmod.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.Map;
import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables(Set<Item> p_281507_, FeatureFlagSet p_283552_, Map<ResourceLocation, LootTable.Builder> p_282212_) {
        super(p_281507_, p_283552_, p_282212_);
    }

    protected ModBlockLootTables(Set<Item> p_249153_, FeatureFlagSet p_251215_) {
        super(p_249153_, p_251215_);
    }

    @Override
    protected void generate() {

    }
}
