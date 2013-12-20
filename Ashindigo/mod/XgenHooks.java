package XGen.Ashindigo.mod;

import XGen.Ashindigo.mod.BlueCore.XgenBCore;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class XgenHooks {
	public static void addHooks()
	{
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(MainXgenMod.RedXgenCrystal), 5, 10, 75));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(MainXgenMod.RedXgenCrystal), 5, 10, 75));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(XgenBCore.BlueXgenCrystal), 5, 10, 75));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(XgenBCore. BlueXgenCrystal), 5, 10, 75));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(MainXgenMod.GreenXgenCrystal), 5, 10, 75));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(MainXgenMod.GreenXgenCrystal), 5, 10, 75));
	}
}
