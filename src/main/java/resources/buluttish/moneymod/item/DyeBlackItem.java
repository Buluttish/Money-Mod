
package resources.buluttish.moneymod.item;

import net.minecraft.util.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class DyeBlackItem extends Item {
	public DyeBlackItem() {
		super(new FabricItemSettings().group(ItemGroup.MATERIALS).maxCount(64).rarity(Rarity.RARE));
	}

	@Override
	public int getMaxUseTime(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
		return (float) (1F);
	}

	@Override
	public int getEnchantability() {
		return 0;
	}
}
