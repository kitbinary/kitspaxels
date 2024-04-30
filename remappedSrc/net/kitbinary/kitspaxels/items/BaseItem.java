package net.kitbinary.kitspaxels.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kitbinary.kitspaxels.materials.BaseMaterial;
import net.kitbinary.kitspaxels.tags.BaseTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class BaseItem {
    public static void initialize() {
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(BaseItem.WoodenPaxel));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(BaseItem.StonePaxel));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(BaseItem.IronPaxel));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(BaseItem.GoldPaxel));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(BaseItem.DiamondPaxel));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(BaseItem.NetheritePaxel));
    }

    public static <T extends Item>T register(String ID, T item) {
        Identifier itemID = new Identifier("kitspaxels", ID);

        T registeredItem = Registry.register(Registries.ITEM, itemID, item);

        return registeredItem;
    }
    public static final Item WoodenPaxel = register(
            "wooden_paxel",
            new BasePaxel(4.0F, 1.0F, BaseMaterial.WOOD, BaseTags.Blocks.MINEABLE_BY_PAXEL, new FabricItemSettings())
    );
    public static final Item StonePaxel = register(
            "stone_paxel",
            new BasePaxel(5.5F, 1.0F, BaseMaterial.IRON, BaseTags.Blocks.MINEABLE_BY_PAXEL, new FabricItemSettings())
    );
    public static final Item IronPaxel = register(
            "iron_paxel",
            new BasePaxel(6.0F, 1.0F, BaseMaterial.IRON, BaseTags.Blocks.MINEABLE_BY_PAXEL, new FabricItemSettings())
    );
    public static final Item GoldPaxel = register(
            "gold_paxel",
            new BasePaxel(6.0F, 1.0F, BaseMaterial.GOLD, BaseTags.Blocks.MINEABLE_BY_PAXEL, new FabricItemSettings())
            // attackDamage is 4, but needs to be 6? who knows.
    );
    public static final Item DiamondPaxel = register(
            "diamond_paxel",
            new BasePaxel(4.5F, 1.0F, BaseMaterial.DIAMOND, BaseTags.Blocks.MINEABLE_BY_PAXEL, new FabricItemSettings())
            // attackDamage is 5.5, but needs to be 3.5? who knows.
    );
    public static final Item NetheritePaxel = register(
            "netherite_paxel",
            new BasePaxel(5.5F, 1.0F, BaseMaterial.NETHERITE, BaseTags.Blocks.MINEABLE_BY_PAXEL, new FabricItemSettings())
            // attackDamage is 7.5, but needs to be 5.5? who knows.
    );

}
