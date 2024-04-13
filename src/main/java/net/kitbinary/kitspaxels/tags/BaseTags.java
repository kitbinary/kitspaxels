package net.kitbinary.kitspaxels.tags;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class BaseTags {
    public static class Blocks {
        public static final TagKey<Block> MINEABLE_BY_PAXEL = createTag("mineable_by_paxel");
        private static final TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier("kitspaxels", name));

        }
    }

}
