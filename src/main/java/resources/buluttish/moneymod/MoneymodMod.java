/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and the proxy files
 *    and they won't get overwritten. If you change your mod package or modid, you
 *    need to apply these changes to this file MANUALLY.
 *
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package resources.buluttish.moneymod;

import resources.buluttish.moneymod.item.Pennies50Item;
import resources.buluttish.moneymod.item.Pennies25Item;
import resources.buluttish.moneymod.item.Pennies10Item;
import resources.buluttish.moneymod.item.PaperizeItem;
import resources.buluttish.moneymod.item.Money5Item;
import resources.buluttish.moneymod.item.Money50Item;
import resources.buluttish.moneymod.item.Money500Item;
import resources.buluttish.moneymod.item.Money20Item;
import resources.buluttish.moneymod.item.Money200Item;
import resources.buluttish.moneymod.item.Money1Item;
import resources.buluttish.moneymod.item.Money10Item;
import resources.buluttish.moneymod.item.Money100Item;
import resources.buluttish.moneymod.item.DyeBlackItem;
import resources.buluttish.moneymod.block.PaperFlowerBlock;
import resources.buluttish.moneymod.block.DyeFlowerBlock;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.api.ModInitializer;

public class MoneymodMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final Item Money1_ITEM = Registry.register(Registry.ITEM, id("money_1"), new Money1Item());
	public static final Item Money5_ITEM = Registry.register(Registry.ITEM, id("money_5"), new Money5Item());
	public static final Item Money10_ITEM = Registry.register(Registry.ITEM, id("money_10"), new Money10Item());
	public static final Item Money20_ITEM = Registry.register(Registry.ITEM, id("money_20"), new Money20Item());
	public static final Item Money50_ITEM = Registry.register(Registry.ITEM, id("money_50"), new Money50Item());
	public static final Item Money100_ITEM = Registry.register(Registry.ITEM, id("money_100"), new Money100Item());
	public static final Item Money200_ITEM = Registry.register(Registry.ITEM, id("money_200"), new Money200Item());
	public static final Item Money500_ITEM = Registry.register(Registry.ITEM, id("money_500"), new Money500Item());
	public static final Item Pennies50_ITEM = Registry.register(Registry.ITEM, id("pennies_50"), new Pennies50Item());
	public static final Item Pennies25_ITEM = Registry.register(Registry.ITEM, id("pennies_25"), new Pennies25Item());
	public static final Item Pennies10_ITEM = Registry.register(Registry.ITEM, id("pennies_10"), new Pennies10Item());
	public static final Item DyeBlack_ITEM = Registry.register(Registry.ITEM, id("dye_black"), new DyeBlackItem());
	public static final Item Paperize_ITEM = Registry.register(Registry.ITEM, id("paperize"), new PaperizeItem());
	public static final Block PaperFlower_BLOCK = Registry.register(Registry.BLOCK, id("paper_flower"), new PaperFlowerBlock());
	public static final BlockItem PaperFlower_ITEM = Registry.register(Registry.ITEM, id("paper_flower"),
			new BlockItem(PaperFlower_BLOCK, new Item.Settings().group(ItemGroup.MATERIALS)));
	public static final Block DyeFlower_BLOCK = Registry.register(Registry.BLOCK, id("dye_flower"), new DyeFlowerBlock());
	public static final BlockItem DyeFlower_ITEM = Registry.register(Registry.ITEM, id("dye_flower"),
			new BlockItem(DyeFlower_BLOCK, new Item.Settings().group(ItemGroup.MATERIALS)));
	@Override
	public void onInitialize() {
		LOGGER.info("Initializing MoneymodMod");
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
		});
	}

	public static final Identifier id(String s) {
		return new Identifier("moneymod", s);
	}
}