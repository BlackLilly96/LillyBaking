package net.blacklily.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab LILIESBAKING_TAB = new CreativeModeTab("liliesbakingtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BLUEBERRIES.get());
        }
    };
}
