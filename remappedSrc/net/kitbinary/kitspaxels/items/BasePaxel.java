package net.kitbinary.kitspaxels.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.TagKey;

public class BasePaxel extends MiningToolItem {

    public BasePaxel(float attackDamage, float attackSpeed, ToolMaterial material, TagKey<Block> effectiveBlocks, Settings settings) {
        super(attackDamage - 3.0F, attackSpeed - 4.0F, material, effectiveBlocks, settings);
    }
}
