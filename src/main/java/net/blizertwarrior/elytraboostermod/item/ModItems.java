package net.blizertwarrior.elytraboostermod.item;

import net.blizertwarrior.elytraboostermod.ElytraBoosterMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ElytraBoosterMod.MODID);

    public static final RegistryObject<Item> ELYTRABOOSTERMK1 = ITEMS.register("elytraboostermk1",
            () -> new Item
                    (new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
