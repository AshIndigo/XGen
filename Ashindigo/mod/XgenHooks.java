package XGen.Ashindigo.mod;

import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class XgenHooks {
	public static void addHooks()
	{
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(XGen.Ashindigo.mod.MainXgenMod.RedXgenCrystal), 5, 10, 75));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(XGen.Ashindigo.mod.MainXgenMod.RedXgenCrystal), 5, 10, 75));
	}
}
