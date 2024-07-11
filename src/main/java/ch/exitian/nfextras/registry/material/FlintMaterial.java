package ch.exitian.nfextras.registry.material;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum FlintMaterial implements Tier, FlintMaterialLevel {
    AXE(FlintMaterialLevel.level, 32, 0, () -> Ingredient.of(Items.FLINT))
    ;

    private final int harvestLevel;
    private final int maxUses;
    private final int enchantability;

    private final Supplier<Ingredient> repairMaterial;


    FlintMaterial(int harvestLevel, int maxUses, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return 0;
    }

    @Override
    public float getAttackDamageBonus() {
        return 0;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return null;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return Ingredient.of(Items.FLINT);
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }
}
