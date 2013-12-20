package XGen.Ashindigo.mod;

import java.io.File;
import net.minecraftforge.common.Configuration;
import java.util.logging.Level;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.stats.Achievement;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DimensionManager;
import XGen.Ashindigo.mod.Armor.*;
import XGen.Ashindigo.mod.BlueCore.*;
import XGen.Ashindigo.mod.GreenCore.*;
import XGen.Ashindigo.mod.RedCore.*;
import XGen.Ashindigo.mod.lib.*;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import XGen.Ashindigo.mod.*;
@Mod(modid = MainXgenMod.modid, name = "XGenCraft", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class MainXgenMod
{
	public static final String modid = "xgencraft";
	public static CreativeTabs XgenCreativeTab = new XgenCreativeTab(CreativeTabs.getNextID(), "XgenCreativeTab");
	XgenEventManager eventmanager = new XgenEventManager();
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
	public static int RedXgenBlockBlockID;
	public static int RedXgenOreBlockID = 501;
    public static int RedXgenCrystalItemID;

	public static EnumArmorMaterial RedXgenArmor= net.minecraftforge.common.EnumHelper.addArmorMaterial("RedXgenArmor", 47, new int[]{6, 10, 8, 6}, 28);
	
//@Instance
//public static MainXgenMod instance = new MainXgenMod();

@EventHandler
public void load(FMLPreInitializationEvent event) {
	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	config.load();
    int RedXgenBlockBlockID = config.getBlock("RedXgenBlock", 500).getInt();
    int RedXgenOreBlockID = config.getBlock("RedXgenOre", 501).getInt();
    int RedXgenCrystalItemID = config.getItem("RedXgenCrystal", 5000).getInt();
	config.save();
}
@EventHandler
public void load(FMLInitializationEvent event)
{	
	//Red Core
	EnumToolMaterial RedXgenTool = net.minecraftforge.common.EnumHelper.addToolMaterial("XgenTool", 3, 500, 5F, 2, 22);
	RedXgenBlock = new XgenRedBlock(RedXgenBlockBlockID, Material.rock).setUnlocalizedName("xgenblockred") .setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenOre = new XgenRedOre(RedXgenOreBlockID, Material.rock).setUnlocalizedName("xgenorered") .setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);	
	RedXgenCrystal = new ItemRedXGenCrystal(RedXgenCrystalItemID).setUnlocalizedName("xgenred") .setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
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
	LanguageRegistry.addName(MainXgenMod.RedXgenBlock, "Red Xgen Block");
	LanguageRegistry.addName(MainXgenMod.RedXgenOre, "Red Xgen Ore");
	LanguageRegistry.addName(MainXgenMod.RedXgenCrystal, "Red Xgen Crystal");
	LanguageRegistry.addName(MainXgenMod.RedXgenAxe, "Red Xgen Axe");
	LanguageRegistry.addName(MainXgenMod.RedXgenHoe, "Red Xgen Hoe");
	LanguageRegistry.addName(MainXgenMod.RedXgenSword, "Red Xgen Sword");
	LanguageRegistry.addName(MainXgenMod.RedXgenSpade, "Red Xgen Spade");
	LanguageRegistry.addName(MainXgenMod.RedXgenPickaxe, "Red Xgen Pickaxe");
	LanguageRegistry.addName(MainXgenMod.RedXgenBow, "Red Xgen Bow");
	LanguageRegistry.addName(MainXgenMod.RedXgenHelmet, "Red Xgen Helmet");
	LanguageRegistry.addName(MainXgenMod.RedXgenChestPlate, "Red Xgen Chestplate");
	LanguageRegistry.addName(MainXgenMod.RedXgenLegs, "Red Xgen Legs");
	LanguageRegistry.addName(MainXgenMod.RedXgenBoots, "Red Xgen Boots");
	GameRegistry.registerBlock(MainXgenMod.RedXgenBlock, XGen.Ashindigo.mod.MainXgenMod.modid + MainXgenMod.RedXgenBlock.getUnlocalizedName());
	GameRegistry.registerBlock(MainXgenMod.RedXgenOre, XGen.Ashindigo.mod.MainXgenMod.modid + MainXgenMod.RedXgenOre.getUnlocalizedName());
	GameRegistry.addRecipe(new ItemStack(MainXgenMod.RedXgenBlock,1), new Object[]{
		   "TTT",
		   "TTT",
		   "TTT",
		   'T',MainXgenMod.RedXgenCrystal,});
	GameRegistry.addRecipe(new ItemStack(MainXgenMod.RedXgenSword,1), new Object[]{
		   " T ",
		   " T ",
		   " X ",
		   'T',MainXgenMod.RedXgenCrystal, 'X',Item.stick});
	GameRegistry.addRecipe(new ItemStack(MainXgenMod.RedXgenPickaxe,1), new Object[]{
		   "TTT",
		   " X ",
		   " X ",
		   'T',MainXgenMod.RedXgenCrystal, 'X',Item.stick});
	GameRegistry.addRecipe(new ItemStack(MainXgenMod.RedXgenSpade,1), new Object[]{
		   " T ",
		   " X ",
		   " X ",
		   'T',MainXgenMod.RedXgenCrystal, 'X',Item.stick});
	GameRegistry.addRecipe(new ItemStack(MainXgenMod.RedXgenAxe,1), new Object[]{
		   "TT ",
		   "TX ",
		   " X ",
		   'T',MainXgenMod.RedXgenCrystal, 'X',Item.stick});
	GameRegistry.addRecipe(new ItemStack(MainXgenMod.RedXgenChestPlate,1), new Object[]{
		   "T T",
		   "TTT",
		   "TTT",
		   'T',MainXgenMod.RedXgenCrystal});
	GameRegistry.addRecipe(new ItemStack(MainXgenMod.RedXgenHelmet,1), new Object[]{
		   "TTT",
		   "T T",
		   'T',MainXgenMod.RedXgenCrystal});
	GameRegistry.addRecipe(new ItemStack(MainXgenMod.RedXgenBoots,1), new Object[]{
		   "T T",
		   "T T",
		   'T',MainXgenMod.RedXgenCrystal});
	GameRegistry.addRecipe(new ItemStack(MainXgenMod.RedXgenLegs,1), new Object[]{
		   "TTT",
		   "T T",
		   "T T",
		   'T',MainXgenMod.RedXgenCrystal});
	FurnaceRecipes.smelting().addSmelting(MainXgenMod.RedXgenOre.blockID, 0, new ItemStack(MainXgenMod.RedXgenCrystal), 0.1F);
	GameRegistry.addShapelessRecipe(new ItemStack(MainXgenMod.RedXgenCrystal,9), new Object[]{MainXgenMod.RedXgenBlock});
	//Blue Core
	XgenLogHelper.log(Level.INFO, "Starting XgenCraft By Ash Indigo");
	XgenLogHelper.log(Level.INFO, "Loading Core Modules");
	GameRegistry.registerWorldGenerator(eventmanager);
	//XgenHooks.addHooks();
	XgenBCore.addCore();
	//XgenGCore.addCore();
	
        

        
}


}