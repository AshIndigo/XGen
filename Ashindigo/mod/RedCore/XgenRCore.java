package XGen.Ashindigo.mod.RedCore;

import XGen.Ashindigo.mod.MainXgenMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class XgenRCore {

	public static Block RedXgenBlock;
	public static Block RedXgenOre;
	public static Item RedXgenAxe;
	public static Item RedXgenHoe;
	public static Item RedXgenSword;
	public static Item RedXgenSpade;
	public static Item RedXgenPickaxe;
	public static Item RedXgenBow;
	public static Item RedXgenHelmet;
	public static Item RedXgenChestPlate;
	public static Item RedXgenLegs;
	public static Item RedXgenBoots;
	public static Item RedXgenCrystal;
	public static EnumArmorMaterial RedXgenArmor= net.minecraftforge.common.EnumHelper.addArmorMaterial("RedXgenArmor", 47, new int[]{6, 10, 8, 6}, 28);
	

	public static void addCore() {
	
	EnumToolMaterial RedXgenTool = net.minecraftforge.common.EnumHelper.addToolMaterial("XgenTool", 3, 500, 5F, 2, 22);
	RedXgenBlock = new XgenRedBlock(500, Material.rock).setUnlocalizedName("xgenblockred") .setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenOre = new XgenRedOre(501, Material.rock).setUnlocalizedName("xgenorered") .setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);	
	RedXgenCrystal = new ItemRedXGenCrystal(5000).setUnlocalizedName("xgenred") .setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenPickaxe = new RedXgenPickaxe(3000, RedXgenTool).setUnlocalizedName("redxgenpick").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenAxe = new RedXgenAxe(3001, RedXgenTool).setUnlocalizedName("redxgenaxe").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenHoe = new RedXgenHoe(3002, RedXgenTool).setUnlocalizedName("redxgenhoe").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenSword = new RedXgenSword(3003, RedXgenTool).setUnlocalizedName("redxgensword").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenSpade = new RedXgenSpade(3004, RedXgenTool).setUnlocalizedName("redxgenspade").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenBow = new RedXgenBow(3005).setUnlocalizedName("redxgenbow").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenHelmet = new XGen.Ashindigo.mod.Armor.RedXgenArmor(3002, RedXgenArmor,1, 0).setUnlocalizedName("redxgenhelmet").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenChestPlate = new XGen.Ashindigo.mod.Armor.RedXgenArmor(3003, RedXgenArmor, 1, 1).setUnlocalizedName("redxgenplate").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenLegs = new XGen.Ashindigo.mod.Armor.RedXgenArmor(3004, RedXgenArmor, 1, 2).setUnlocalizedName("redxgenlegs").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenBoots = new XGen.Ashindigo.mod.Armor.RedXgenArmor(3006, RedXgenArmor, 1, 3).setUnlocalizedName("redxgenboots").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	GameRegistry.registerBlock(RedXgenBlock, XGen.Ashindigo.mod.MainXgenMod.modid + RedXgenBlock.getUnlocalizedName());
	GameRegistry.registerBlock(RedXgenOre, XGen.Ashindigo.mod.MainXgenMod.modid + RedXgenOre.getUnlocalizedName());
	LanguageRegistry.addName(RedXgenBlock, "Red Xgen Block");
	LanguageRegistry.addName(RedXgenOre, "Red Xgen Ore");
	LanguageRegistry.addName(RedXgenCrystal, "Red Xgen Crystal");
	LanguageRegistry.addName(RedXgenAxe, "Red Xgen Axe");
	LanguageRegistry.addName(RedXgenHoe, "Red Xgen Hoe");
	LanguageRegistry.addName(RedXgenSword, "Red Xgen Sword");
	LanguageRegistry.addName(RedXgenSpade, "Red Xgen Spade");
	LanguageRegistry.addName(RedXgenPickaxe, "Red Xgen Pickaxe");
	LanguageRegistry.addName(RedXgenBow, "Red Xgen Bow");
	LanguageRegistry.addName(RedXgenHelmet, "Red Xgen Helmet");
	LanguageRegistry.addName(RedXgenChestPlate, "Red Xgen Chestplate");
	LanguageRegistry.addName(RedXgenLegs, "Red Xgen Legs");
	LanguageRegistry.addName(RedXgenBoots, "Red Xgen Boots");
	GameRegistry.addRecipe(new ItemStack(XgenRCore.RedXgenBlock,1), new Object[]{
		   "TTT",
		   "TTT",
		   "TTT",
		   'T',RedXgenCrystal,});
	 GameRegistry.addRecipe(new ItemStack(RedXgenSword,1), new Object[]{
		   " T ",
		   " T ",
		   " X ",
		   'T',RedXgenCrystal, 'X',Item.stick});
	   GameRegistry.addRecipe(new ItemStack(RedXgenPickaxe,1), new Object[]{
		   "TTT",
		   " X ",
		   " X ",
		   'T',RedXgenCrystal, 'X',Item.stick});
	   GameRegistry.addRecipe(new ItemStack(RedXgenSpade,1), new Object[]{
		   " T ",
		   " X ",
		   " X ",
		   'T',RedXgenCrystal, 'X',Item.stick});
	   GameRegistry.addRecipe(new ItemStack(RedXgenAxe,1), new Object[]{
		   "TT ",
		   "TX ",
		   " X ",
		   'T',RedXgenCrystal, 'X',Item.stick});
	   GameRegistry.addRecipe(new ItemStack(RedXgenChestPlate,1), new Object[]{
		   "T T",
		   "TTT",
		   "TTT",
		   'T',RedXgenCrystal});
	   GameRegistry.addRecipe(new ItemStack(RedXgenHelmet,1), new Object[]{
		   "TTT",
		   "T T",
		   'T',RedXgenCrystal});
	   GameRegistry.addRecipe(new ItemStack(RedXgenBoots,1), new Object[]{
		   "T T",
		   "T T",
		   'T',RedXgenCrystal});
	   GameRegistry.addRecipe(new ItemStack(RedXgenLegs,1), new Object[]{
		   "TTT",
		   "T T",
		   "T T",
		   'T',RedXgenCrystal});
	   
	   
	   		
      
	   FurnaceRecipes.smelting().addSmelting(XgenRCore.RedXgenOre.blockID, 0, new ItemStack(RedXgenCrystal), 0.1F);
	GameRegistry.addShapelessRecipe(new ItemStack(RedXgenCrystal,9), new Object[]{XgenRCore.RedXgenBlock});
	}

}
