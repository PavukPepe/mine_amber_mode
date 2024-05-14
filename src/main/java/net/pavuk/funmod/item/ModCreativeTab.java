package net.pavuk.funmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static CreativeModeTab FUN_MODE = new CreativeModeTab("Fun_mode") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(moditems.AMBER.get());
        }
    };
}
