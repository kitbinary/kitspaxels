package net.kitbinary.kitspaxels.materials;

import net.kitbinary.kitspaxels.items.BasePaxel;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum BaseMaterial implements ToolMaterial {
    WOOD(0, 59 * 2.5, 2.5F, 2.0F, 15, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    STONE(1, 131 * 2.5, 4.0F, 1.0F, 5, () -> Ingredient.ofItems(Blocks.COBBLESTONE)),
    IRON(2, 230 * 2.5, 6.0F, 2.0F, 14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    GOLD(0, 32 * 2.5, 12.0F, 0.0F, 22, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    DIAMOND(3, 1561 * 2.5, 8.0F, 3.0F, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
    NETHERITE(4, 2031 * 2.5, 9.0F, 4.0F, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));

    private final int itemDurability;
    private final float miningSpeed;
    private final int miningLevel;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;
    BaseMaterial(int miningLevel, double itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = (int) itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
