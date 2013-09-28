package XGen.Ashindigo.mod;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import XGen.Ashindigo.mod.blocks.XgenBlueBlock;
import XGen.Ashindigo.mod.blocks.XgenBlueOre;
import XGen.Ashindigo.mod.items.BlueXgenAxe;
import XGen.Ashindigo.mod.items.BlueXgenBow;
import XGen.Ashindigo.mod.items.BlueXgenHoe;
import XGen.Ashindigo.mod.items.BlueXgenPickaxe;
import XGen.Ashindigo.mod.items.BlueXgenSpade;
import XGen.Ashindigo.mod.items.BlueXgenSword;
import XGen.Ashindigo.mod.items.ItemBlueXGenCrystal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class XgenBCore {
	
	public static Item BlueXgenAxe;
	public static Item BlueXgenHoe;
	public static Item BlueXgenSword;
	public static Item BlueXgenSpade;
	public static Item BlueXgenPickaxe;
	public static Item BlueXgenBow;
	//public static Item BlueXgenHelmet;
	//public static Item BlueXgenChestPlate;
	//public static Item BlueXgenLegs;
	//public static Item BlueXgenBoots;
	public static Item BlueXgenCrystal;
	public static Block BlueXgenBlock;
	public static Block BlueXgenOre;
	//public static Block BlueXgenChest;
	public static EnumArmorMaterial BlueXgenArmor= net.minecraftforge.common.EnumHelper.addArmorMaterial("BlueXgenArmor", 47, new int[]{6, 10, 8, 6}, 28);

	public static void addCore() {
		EnumToolMaterial RedXgenTool = net.minecraftforge.common.EnumHelper.addToolMaterial("XgenTool", 3, 500, 5F, 2, 22);
		BlueXgenOre = new XgenBlueOre(504, Material.rock).setUnlocalizedName("xgenoreblue") .setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		BlueXgenCrystal = new ItemBlueXGenCrystal(5001).setUnlocalizedName("xgenblue") .setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		BlueXgenPickaxe = new BlueXgenPickaxe(3008, RedXgenTool).setUnlocalizedName("bluexgenpick").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		BlueXgenAxe = new BlueXgenAxe(3009, RedXgenTool).setUnlocalizedName("bluexgenaxe").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		BlueXgenHoe = new BlueXgenHoe(3010, RedXgenTool).setUnlocalizedName("bluexgenhoe").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		BlueXgenSword = new BlueXgenSword(3012, RedXgenTool).setUnlocalizedName("bluexgensword").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		BlueXgenSpade = new BlueXgenSpade(3013, RedXgenTool).setUnlocalizedName("bluexgenspade").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		BlueXgenBow = new BlueXgenBow(3014).setUnlocalizedName("bluexgenbow").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		//BlueXgenHelmet = new BlueXgenArmor(3015,BlueXgenArmor,1, 0).setUnlocalizedName("bluexgenhelmet").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		//BlueXgenChestPlate = new BlueXgenArmor(3016, BlueXgenArmor, 1, 1).setUnlocalizedName("bluexgenplate").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		//BlueXgenLegs = new BlueXgenArmor(3017,BlueXgenArmor, 1, 2).setUnlocalizedName("bluexgenlegs").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		//BlueXgenBoots = new BlueXgenArmor(3018,BlueXgenArmor, 1, 3).setUnlocalizedName("bluexgenboots").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		//BlueXgenChest = new XgenBlueChest(2002, 0).setUnlocalizedName("xgenbluechest").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
		GameRegistry.registerBlock(BlueXgenBlock, XGen.Ashindigo.mod.MainXgenMod.modid + BlueXgenBlock.getUnlocalizedName());
		GameRegistry.registerBlock(BlueXgenOre, XGen.Ashindigo.mod.MainXgenMod.modid + BlueXgenOre.getUnlocalizedName());
		//GameRegistry.registerBlock(BlueXgenChest, XGen.Ashindigo.mod.MainXgenMod.modid + BlueXgenChest.getUnlocalizedName());
		//GameRegistry.registerTileEntity(BlueXgenChestTileEntity.class, "BlueXgenChestTileEntity");
		LanguageRegistry.addName(BlueXgenCrystal, "Blue Xgen Crystal");
		LanguageRegistry.addName(BlueXgenBlock, "Blue Xgen Block");
		LanguageRegistry.addName(BlueXgenOre, "Blue Xgen Ore");
		LanguageRegistry.addName(BlueXgenAxe, "Blue Xgen Axe");
		LanguageRegistry.addName(BlueXgenHoe, "Blue Xgen Hoe");
		LanguageRegistry.addName(BlueXgenSword, "Blue Xgen Sword");
		LanguageRegistry.addName(BlueXgenSpade, "Blue Xgen Spade");
		LanguageRegistry.addName(BlueXgenPickaxe, "Blue Xgen Pickaxe");
		LanguageRegistry.addName(BlueXgenBow, "Blue Xgen Bow");
		//LanguageRegistry.addName(BlueXgenHelmet, "Blue Xgen Helmet");
		//LanguageRegistry.addName(BlueXgenChestPlate, "Blue Xgen Chestplate");
		//LanguageRegistry.addName(BlueXgenLegs, "Blue Xgen Legs");
		//LanguageRegistry.addName(BlueXgenBoots, "Blue Xgen Boots");
		//LanguageRegistry.addName(BlueXgenChest, "Blue Xgen Chest");
		 GameRegistry.addRecipe(new ItemStack(BlueXgenBlock,1), new Object[]{
  		   "TTT",
  		   "TTT",
  		   "TTT",
  		   'T',BlueXgenCrystal,});
  	   GameRegistry.addRecipe(new ItemStack(BlueXgenSword,1), new Object[]{
  		   " T ",
  		   " T ",
  		   " X ",
  		   'T',BlueXgenCrystal, 'X',Item.stick});
  	   GameRegistry.addRecipe(new ItemStack(BlueXgenPickaxe,1), new Object[]{
  		   "TTT",
  		   " X ",
  		   " X ",
  		   'T',BlueXgenCrystal, 'X',Item.stick});
  	   GameRegistry.addRecipe(new ItemStack(BlueXgenSpade,1), new Object[]{
  		   " T ",
  		   " X ",
  		   " X ",
  		   'T',BlueXgenCrystal, 'X',Item.stick});
  	   GameRegistry.addRecipe(new ItemStack(BlueXgenAxe,1), new Object[]{
  		   "TT ",
  		   "TX ",
  		   " X ",
  		   'T',BlueXgenCrystal, 'X',Item.stick});
  	   //GameRegistry.addRecipe(new ItemStack(BlueXgenChestPlate,1), new Object[]{
  		   //"T T",
  		   //"TTT",
  		   //"TTT",
  		   //'T',BlueXgenCrystal});
  	   //GameRegistry.addRecipe(new ItemStack(BlueXgenHelmet,1), new Object[]{
  		   //"TTT",
  		   //"T T",
  		   //'T',BlueXgenCrystal});
  	   //GameRegistry.addRecipe(new ItemStack(BlueXgenBoots,1), new Object[]{
  		   //"T T",
  		   //"T T",
  		   //'T',BlueXgenCrystal});
  	   //GameRegistry.addRecipe(new ItemStack(BlueXgenLegs,1), new Object[]{
  		   //"TTT",
  		   //"T T",
  		   //"T T",
  		   //'T',BlueXgenCrystal});
  	   
  	   
  	   		
  	   GameRegistry.addShapelessRecipe(new ItemStack(BlueXgenCrystal,9), new Object[]{
  		   BlueXgenBlock });
  	   
          
  	   FurnaceRecipes.smelting().addSmelting(BlueXgenOre.blockID, 0, new ItemStack(BlueXgenCrystal), 0.1F);
     }
	}

