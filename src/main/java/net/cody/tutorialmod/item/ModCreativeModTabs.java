package net.cody.tutorialmod.item;

import net.cody.tutorialmod.TutorialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);
    /**
     * Will show the icon as ZIRCON and display any items we want in the creative tab
     */
    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(
                    () -> new ItemStack(ModItems.ZIRCON.get()))
                    .title(Component.translatable("creativetab.tutorial_tab")).displayItems((pParams, pOut) -> {
                        pOut.accept(ModItems.ZIRCON.get());
                        pOut.accept(ModItems.RAW_ZIRCON.get());
            }).build()
    );
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
