
package resources.buluttish.moneymod.block;

import resources.buluttish.moneymod.MoneymodMod;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.loot.context.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import java.util.List;
import java.util.Collections;

public class BlackStickyDyeBlock extends Block {
	public BlackStickyDyeBlock() {
		super(FabricBlockSettings.of(Material.LEAVES).sounds(BlockSoundGroup.CROP).strength(0.05F, 0.5F).luminance(0));
	}

	@Override
	public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDroppedStacks(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(MoneymodMod.DyeBlack_ITEM));
	}
}
