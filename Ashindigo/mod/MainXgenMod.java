package XGen.Ashindigo.mod;

import java.util.logging.Level;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DimensionManager;
import XGen.Ashindigo.mod.Armor.*;
import XGen.Ashindigo.mod.TileEntities.*;
import XGen.Ashindigo.mod.WorldProviders.WorldProviderRedD;
import XGen.Ashindigo.mod.blocks.*;
import XGen.Ashindigo.mod.items.*;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import XGen.Ashindigo.mod.*;
@Mod(modid = MainXgenMod.modid, name = "XGenCraft", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class MainXgenMod
{

	public static Item RedXgenAxe;
	public static Item RedXgenHoe;
	public static Item RedXgenSword;
	public static Item RedXgenSpade;
	public static Item RedXgenPickaxe;
	public static Item RedXgenBow;
	//public static Item RedXgenHelmet;
	//public static Item RedXgenChestPlate;
	//public static Item RedXgenLegs;
	//public static Item RedXgenBoots;
	public static Item RedXgenCrystal;
	//public static Block RedXgenChest;
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
	public static final String modid = "xgencraft";
	public static int dimensionId = 8;
	public static CreativeTabs XgenCreativeTab = new XgenCreativeTab(CreativeTabs.getNextID(), "XgenCreativeTab");
	public static EnumArmorMaterial RedXgenArmor= net.minecraftforge.common.EnumHelper.addArmorMaterial("RedXgenArmor", 47, new int[]{6, 10, 8, 6}, 28);
	public static EnumArmorMaterial BlueXgenArmor= net.minecraftforge.common.EnumHelper.addArmorMaterial("BlueXgenArmor", 47, new int[]{6, 10, 8, 6}, 28);
	XgenEventManager eventmanager = new XgenEventManager();
	
	
		

@Instance
public static MainXgenMod instance = new MainXgenMod();
	
@EventHandler
public void load(FMLInitializationEvent event)
{	
	XgenLogHelper.log(Level.INFO, "Starting XgenCraft By Ash Indigo");
	XgenLogHelper.log(Level.INFO, "Preparing Red Xgen Portion");
	EnumToolMaterial RedXgenTool = net.minecraftforge.common.EnumHelper.addToolMaterial("XgenTool", 3, 500, 5F, 2, 22);
	RedXgenCrystal = new ItemRedXGenCrystal(5000).setUnlocalizedName("xgenred") .setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenPickaxe = new RedXgenPickaxe(3000, RedXgenTool).setUnlocalizedName("redxgenpick").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenAxe = new RedXgenAxe(3001, RedXgenTool).setUnlocalizedName("redxgenaxe").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenHoe = new RedXgenHoe(3002, RedXgenTool).setUnlocalizedName("redxgenhoe").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenSword = new RedXgenSword(3003, RedXgenTool).setUnlocalizedName("redxgensword").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenSpade = new RedXgenSpade(3004, RedXgenTool).setUnlocalizedName("redxgenspade").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	RedXgenBow = new RedXgenBow(3005).setUnlocalizedName("redxgenbow").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	//RedXgenHelmet = new RedXgenArmor(3002, XGen.Ashindigo.mod.MainXgenMod.RedXgenArmor,1, 0).setUnlocalizedName("redxgenhelmet").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	//RedXgenChestPlate = new RedXgenArmor(3003, XGen.Ashindigo.mod.MainXgenMod.RedXgenArmor, 1, 1).setUnlocalizedName("redxgenplate").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	//RedXgenLegs = new RedXgenArmor(3004, XGen.Ashindigo.mod.MainXgenMod.RedXgenArmor, 1, 2).setUnlocalizedName("redxgenlegs").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	//RedXgenBoots = new RedXgenArmor(3006, XGen.Ashindigo.mod.MainXgenMod.RedXgenArmor, 1, 3).setUnlocalizedName("redxgenboots").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	//RedXgenChest = new XgenRedChest(2000, 0).setUnlocalizedName("xgenredchest").setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
	XgenLogHelper.log(Level.INFO, "Preparing Blue Xgen Portion");
	BlueXgenBlock = new XgenBlueBlock(503, Material.rock).setUnlocalizedName("xgenblockblue") .setCreativeTab(XGen.Ashindigo.mod.MainXgenMod.XgenCreativeTab);
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
	XgenLogHelper.log(Level.INFO, "Registering Things");
	//GameRegistry.registerBlock(RedXgenChest, modid + RedXgenChest.getUnlocalizedName());
	GameRegistry.registerBlock(BlueXgenBlock, modid + BlueXgenBlock.getUnlocalizedName());
	GameRegistry.registerBlock(BlueXgenOre, modid + BlueXgenOre.getUnlocalizedName());
	//GameRegistry.registerBlock(BlueXgenChest, modid + BlueXgenChest.getUnlocalizedName());
	//GameRegistry.registerTileEntity(RedXgenChestTileEntity.class, "RedXgenChestTileEntity");
	//GameRegistry.registerTileEntity(BlueXgenChestTileEntity.class, "BlueXgenChestTileEntity");
	GameRegistry.registerWorldGenerator(eventmanager);
	XgenLogHelper.log(Level.INFO, "Adding Hooks,Recipes,Names And Dimensional Stuff");
	//XgenCrafting.addRecipes();
	XgenLanguageRegistry.addLanguageRegistry();
	XgenHooks.addHooks();
	XgenRCore.addCore();
	XgenBBlocks.addBlocks();
	//DimensionManager.registerProviderType(MainXgenMod.dimensionId, WorldProviderRedD.class, false);
	//DimensionManager.registerDimension(MainXgenMod.dimensionId, MainXgenMod.dimensionId);
	
        

        
}


}