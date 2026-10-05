package net.claudiolang.maturamod.item.custom;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
//import net.claudiolang.maturamod.ModBlock.ModBlocks;
import java.util.Map;
import net.minecraft.world.level.Level;

public class stein_der_weisen extends Item {
    private static final Map<Block, Item> Transmutations_Map =
            Map.of(
                    Blocks.COPPER_BLOCK, Items.IRON_INGOT,
                    Blocks.IRON_BLOCK, Items.GOLD_INGOT,
                    Blocks.GOLD_BLOCK, Items.DIAMOND,
                    Blocks.DIAMOND_BLOCK, Items.NETHERITE_SCRAP

            );

    public stein_der_weisen(Properties properties) {
        super(properties);
    }


    @Override
    public InteractionResult useOn(UseOnContext context) {


        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(Transmutations_Map.containsKey(clickedBlock) && !level.isClientSide()) {
            Item transmutatedItem = Transmutations_Map.get(clickedBlock);
            level.removeBlock(context.getClickedPos(), false);
            level.addFreshEntity(
                    new ItemEntity(
                            level,
                            context.getClickedPos().getX() + 0.5,
                            context.getClickedPos().getY() + 0.5,
                            context.getClickedPos().getZ() + 0.5,
                            new ItemStack(transmutatedItem)
                    )
            );
            context.getItemInHand().hurtAndBreak(1, context.getPlayer(), context.getHand());
        }



        return InteractionResult.SUCCESS;

    }
}
