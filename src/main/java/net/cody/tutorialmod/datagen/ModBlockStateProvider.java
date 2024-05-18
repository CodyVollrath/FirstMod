package net.cody.tutorialmod.datagen;

import net.cody.tutorialmod.TutorialMod;
import net.cody.tutorialmod.blocks.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TutorialMod.MOD_ID, exFileHelper);

    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ZIRCON_BLOCK);
        blockWithItem(ModBlocks.RAW_ZIRCON_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockNoItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get());
    }
}
