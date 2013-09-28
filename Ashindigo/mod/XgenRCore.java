package XGen.Ashindigo.mod;

import XGen.Ashindigo.mod.blocks.XgenRedBlock;
import XGen.Ashindigo.mod.blocks.XgenRedOre;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class XgenRCore {

	public static Block RedXgenBlock;
	public static Block RedXgenOre;

	public static void addCore() {
	
	
	RedXgenBlock = new XgenRedBlock(500, Material.rock).setUnlocalizedName("xgenblockred") .setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenOre = new XgenRedOre(501, Material.rock).setUnlocalizedName("xgenorered") .setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);	
	GameRegistry.registerBlock(RedXgenBlock, XGen.Ashindigo.mod.MainXgenMod.modid + RedXgenBlock.getUnlocalizedName());
	GameRegistry.registerBlock(RedXgenOre, XGen.Ashindigo.mod.MainXgenMod.modid + RedXgenOre.getUnlocalizedName());
	LanguageRegistry.addName(XgenRCore.RedXgenBlock, "Red Xgen Block");
	LanguageRegistry.addName(XgenRCore.RedXgenOre, "Red Xgen Ore");
	GameRegistry.addRecipe(new ItemStack(XgenRCore.RedXgenBlock,1), new Object[]{
		   "TTT",
		   "TTT",
		   "TTT",
		   'T',MainXgenMod.RedXgenCrystal,});
	GameRegistry.addShapelessRecipe(new ItemStack(MainXgenMod.RedXgenCrystal,9), new Object[]{XgenRCore.RedXgenBlock});
	}

}
