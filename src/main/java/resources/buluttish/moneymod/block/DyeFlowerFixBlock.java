
package resources.buluttish.moneymod.block;

import resources.buluttish.moneymod.MoneymodMod;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.loot.context.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.block.Material;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.BlockState;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import java.util.List;
import java.util.Collections;

public class DyeFlowerFixBlock extends FlowerBlock {
	public DyeFlowerFixBlock() {
		super(StatusEffects.SATURATION, 0, FabricBlockSettings.of(Material.PLANT).sounds(BlockSoundGroup.CROP).strength(0F, 0F).luminance(0)
				.noCollision().nonOpaque().breakInstantly());
		FlammableBlockRegistry.getDefaultInstance().add(this, 100, 60);
	}

	@Override
	public boolean canReplace(BlockState state, ItemPlacementContext context) {
		return true;
	}

	@Override
	public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDroppedStacks(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(MoneymodMod.DyeBlack_ITEM));
	}
}
