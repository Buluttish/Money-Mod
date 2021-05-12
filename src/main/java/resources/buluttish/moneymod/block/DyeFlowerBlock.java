
package resources.buluttish.moneymod.block;

import resources.buluttish.moneymod.MoneymodMod;

import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.loot.context.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.block.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import java.util.List;
import java.util.Collections;

public class DyeFlowerBlock extends Block {
	public DyeFlowerBlock() {
		super(FabricBlockSettings.of(Material.PLANT).sounds(BlockSoundGroup.CROP).strength(0.05F, 0.5F).luminance(0).noCollision());
	}

	@Override
	public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
		return true;
	}

	@Override
	public boolean canReplace(BlockState state, ItemPlacementContext context) {
		return true;
	}

	@Override
	public PistonBehavior getPistonBehavior(BlockState state) {
		return PistonBehavior.DESTROY;
	}

	@Override
	public AbstractBlock.OffsetType getOffsetType() {
		return AbstractBlock.OffsetType.XZ;
	}

	@Override
	public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDroppedStacks(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(MoneymodMod.DyeBlack_ITEM));
	}
}
