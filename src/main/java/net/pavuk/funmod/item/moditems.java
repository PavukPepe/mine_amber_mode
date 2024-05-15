package net.pavuk.funmod.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pavuk.funmod.FunMod;


public class moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FunMod.MOD_ID);

    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.FUN_MODE)));

    public static final RegistryObject<Item> AMBER_RAW = ITEMS.register("amber_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.FUN_MODE)));

    public static final RegistryObject<Item> AMBER_AXE = ITEMS.register("amber_axe",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.FUN_MODE)));

    public static final RegistryObject<Item> AMBER_HOE = ITEMS.register("amber_hoe",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.FUN_MODE)));

    public static final RegistryObject<Item> AMBER_SWORD = ITEMS.register("amber_sword",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.FUN_MODE)));

    public static final RegistryObject<Item> AMBER_PICKAXE = ITEMS.register("amber_pickaxe",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.FUN_MODE)));

    public static final RegistryObject<Item> AMBER_BOOTS = ITEMS.register("amber_boots",
            () -> new ArmorItem(ModArmorMaterials.AMBER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeTab.FUN_MODE)));

    public static final RegistryObject<Item> AMBER_HELMET = ITEMS.register("amber_helmet",
            () -> new ArmorItem(ModArmorMaterials.AMBER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeTab.FUN_MODE)));

    public static final RegistryObject<Item> AMBER_CHESTPLATE = ITEMS.register("amber_chestplate",
            () -> new ArmorItem(ModArmorMaterials.AMBER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeTab.FUN_MODE)));

    public static final RegistryObject<Item> AMBER_LEGGINGS = ITEMS.register("amber_leggings",
            () -> new ArmorItem(ModArmorMaterials.AMBER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeTab.FUN_MODE)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
