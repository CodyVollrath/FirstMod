package net.cody.tutorialmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;

import java.util.List;
import java.util.Set;

public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(PackOutput p_254123_, Set<ResourceLocation> p_254481_, List<SubProviderEntry> p_253798_) {
        super(p_254123_, p_254481_, p_253798_);
    }

}
