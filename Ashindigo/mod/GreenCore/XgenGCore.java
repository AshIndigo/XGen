package XGen.Ashindigo.mod.GreenCore;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import XGen.Ashindigo.mod.MainXgenMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class XgenGCore {
	
	public static Item GreenXgenAxe;
	public static Item GreenXgenHoe;
	public static Item GreenXgenSword;
	public static Item GreenXgenSpade;
	public static Item GreenXgenPickaxe;
	public static Item GreenXgenBow;
	public static Item GreenXgenHelmet;
	public static Item GreenXgenChestPlate;
	public static Item GreenXgenLegs;
	public static Item GreenXgenBoots;
	public static Item GreenXgenCrystal;
	public static Block GreenXgenBlock;
	public static Block GreenXgenOre;
	//public static Block GreenXgenChest;
	public static EnumArmorMaterial GreenXgenArmor= net.minecraftforge.common.EnumHelper.addArmorMaterial("GreenXgenArmor", 47, new int[]{6, 10, 8, 6}, 28);

	public static void addCore() {
		EnumToolMaterial RedXgenTool = net.minecraftforge.common.EnumHelper.addToolMaterial("XgenTool", 3, 500, 5F, 2, 22);
		GreenXgenOre = new XgenGreenOre(504, Material.rock).setUnlocalizedName("xgenoreGreen") .setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		GreenXgenCrystal = new ItemGreenXGenCrystal(5001).setUnlocalizedName("xgenGreen") .setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		GreenXgenPickaxe = new GreenXgenPickaxe(3008, RedXgenTool).setUnlocalizedName("Greenxgenpick").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		GreenXgenAxe = new GreenXgenAxe(3009, RedXgenTool).setUnlocalizedName("Greenxgenaxe").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		GreenXgenHoe = new GreenXgenHoe(3010, RedXgenTool).setUnlocalizedName("Greenxgenhoe").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		GreenXgenSword = new GreenXgenSword(3012, RedXgenTool).setUnlocalizedName("Greenxgensword").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		GreenXgenSpade = new GreenXgenSpade(3013, RedXgenTool).setUnlocalizedName("Greenxgenspade").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		GreenXgenBow = new GreenXgenBow(3014).setUnlocalizedName("Greenxgenbow").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		GreenXgenHelmet = new XGen.Ashindigo.mod.Armor.GreenXgenArmor(3015,GreenXgenArmor,1, 0).setUnlocalizedName("Greenxgenhelmet").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		GreenXgenChestPlate = new XGen.Ashindigo.mod.Armor.GreenXgenArmor(3016, GreenXgenArmor, 1, 1).setUnlocalizedName("Greenxgenplate").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		GreenXgenLegs = new XGen.Ashindigo.mod.Armor.GreenXgenArmor(3017,GreenXgenArmor, 1, 2).setUnlocalizedName("Greenxgenlegs").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		GreenXgenBoots = new XGen.Ashindigo.mod.Armor.GreenXgenArmor(3018,GreenXgenArmor, 1, 3).setUnlocalizedName("Greenxgenboots").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		//GreenXgenChest = new XgenGreenChest(2002, 0).setUnlocalizedName("xgenGreenchest").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		//GameRegistry.registerBlock(GreenXgenBlock, XGen.Ashindigo.mod.MainXgenMod.modid + GreenXgenBlock.getUnlocalizedName());
		GameRegistry.registerBlock(GreenXgenOre, XGen.Ashindigo.mod.MainXgenMod.modid + GreenXgenOre.getUnlocalizedName());
		//GameRegistry.registerBlock(GreenXgenChest, XGen.Ashindigo.mod.MainXgenMod.modid + GreenXgenChest.getUnlocalizedName());
		//GameRegistry.registerTileEntity(GreenXgenChestTileEntity.class, "GreenXgenChestTileEntity");
		LanguageRegistry.addName(GreenXgenCrystal, "Green Xgen Crystal");
		//LanguageRegistry.addName(GreenXgenBlock, "Green Xgen Block");
		LanguageRegistry.addName(GreenXgenOre, "Green Xgen Ore");
		LanguageRegistry.addName(GreenXgenAxe, "Green Xgen Axe");
		LanguageRegistry.addName(GreenXgenHoe, "Green Xgen Hoe");
		LanguageRegistry.addName(GreenXgenSword, "Green Xgen Sword");
		LanguageRegistry.addName(GreenXgenSpade, "Green Xgen Spade");
		LanguageRegistry.addName(GreenXgenPickaxe, "Green Xgen Pickaxe");
		LanguageRegistry.addName(GreenXgenBow, "Green Xgen Bow");
		LanguageRegistry.addName(GreenXgenHelmet, "Green Xgen Helmet");
		LanguageRegistry.addName(GreenXgenChestPlate, "Green Xgen Chestplate");
		LanguageRegistry.addName(GreenXgenLegs, "Green Xgen Legs");
		LanguageRegistry.addName(GreenXgenBoots, "Green Xgen Boots");
		//LanguageRegistry.addName(GreenXgenChest, "Green Xgen Chest");
		 //GameRegistry.addRecipe(new ItemStack(GreenXgenBlock,1), new Object[]{
  		   //"TTT",
  		   //"TTT",
  		   //"TTT",
  		   //'T',GreenXgenCrystal,});
  	   GameRegistry.addRecipe(new ItemStack(GreenXgenSword,1), new Object[]{
  		   " T ",
  		   " T ",
  		   " X ",
  		   'T',GreenXgenCrystal, 'X',Item.stick});
  	   GameRegistry.addRecipe(new ItemStack(GreenXgenPickaxe,1), new Object[]{
  		   "TTT",
  		   " X ",
  		   " X ",
  		   'T',GreenXgenCrystal, 'X',Item.stick});
  	   GameRegistry.addRecipe(new ItemStack(GreenXgenSpade,1), new Object[]{
  		   " T ",
  		   " X ",
  		   " X ",
  		   'T',GreenXgenCrystal, 'X',Item.stick});
  	   GameRegistry.addRecipe(new ItemStack(GreenXgenAxe,1), new Object[]{
  		   "TT ",
  		   "TX ",
  		   " X ",
  		   'T',GreenXgenCrystal, 'X',Item.stick});
  	   GameRegistry.addRecipe(new ItemStack(GreenXgenChestPlate,1), new Object[]{
  		   "T T",
  		   "TTT",
  		   "TTT",
  		   'T',GreenXgenCrystal});
  	   GameRegistry.addRecipe(new ItemStack(GreenXgenHelmet,1), new Object[]{
  		   "TTT",
  		   "T T",
  		   'T',GreenXgenCrystal});
  	   GameRegistry.addRecipe(new ItemStack(GreenXgenBoots,1), new Object[]{
  		   "T T",
  		   "T T",
  		   'T',GreenXgenCrystal});
  	   GameRegistry.addRecipe(new ItemStack(GreenXgenLegs,1), new Object[]{
  		   "TTT",
  		   "T T",
  		   "T T",
  		   'T',GreenXgenCrystal});
  	   
  	   
  	   		
  	   //GameRegistry.addShapelessRecipe(new ItemStack(GreenXgenCrystal,9), new Object[]{GreenXgenBlock });
  	   
          
  	   FurnaceRecipes.smelting().addSmelting(GreenXgenOre.blockID, 0, new ItemStack(GreenXgenCrystal), 0.1F);
     }
	}

