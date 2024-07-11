package ch.exitian.nfextras.registry;

import ch.exitian.nfextras.registry.material.FlintMaterial;
import net.minecraft.client.model.geom.builders.MaterialDefinition;
import net.minecraft.client.resources.model.Material;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static ch.exitian.nfextras.NeoFactoryExtras.MODID;

public class items {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerSimpleItem("example_item", new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(2f).build()));

    public static final DeferredItem<Item> FLINT_HATCHET = ITEMS.register("flint_hatchet", () -> new AxeItem(Tiers.WOOD, new Item.Properties().rarity(Rarity.COMMON).durability(32).setNoRepair()));

}
