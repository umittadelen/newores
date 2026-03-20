package net.umittadelen.newores.items;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.umittadelen.newores.NewOres;

import java.util.function.Function;

public class ModItems {

    public static Item ETHERIUM_ORE = register("etherium_ore", Item::new, new Item.Settings());

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(NewOres.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, item);
        return item;
    }

    public static void initialize() {
        NewOres.LOGGER.info("Registering Items for "+NewOres.MOD_ID);
    }
}
