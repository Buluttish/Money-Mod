
package resources.buluttish.moneymod.item;

import net.minecraft.world.World;
import net.minecraft.util.Rarity;
import net.minecraft.text.Text;
import net.minecraft.text.LiteralText;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.block.BlockState;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class Pennies50Item extends Item {
	public Pennies50Item() {
		super(new FabricItemSettings().group(ItemGroup.MATERIALS).maxCount(64).rarity(Rarity.COMMON));
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
	public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
		if (slot == EquipmentSlot.MAINHAND) {
			return ImmutableMultimap.of(EntityAttributes.GENERIC_ATTACK_DAMAGE,
					new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "item_damage", (double) -2, EntityAttributeModifier.Operation.ADDITION),
					EntityAttributes.GENERIC_ATTACK_SPEED,
					new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "item_attack_speed", -2.4, EntityAttributeModifier.Operation.ADDITION));
		}
		return super.getAttributeModifiers(slot);
	}

	@Override
	@Environment(EnvType.CLIENT)
	public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
		tooltip.add(new LiteralText("Equal To: 2.5 Iron"));
	}

	@Override
	public int getEnchantability() {
		return 0;
	}
}
