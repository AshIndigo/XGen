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
import XGen.Ashindigo.mod.blocks.*;
import XGen.Ashindigo.mod.items.*;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
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
	
@Instance
public static MainXgenMod instance = new MainXgenMod();
	
@EventHandler
public void load(FMLInitializationEvent event)
{	
	XgenLogHelper.log(Level.INFO, "Starting XgenCraft By Ash Indigo");
	XgenLogHelper.log(Level.INFO, "Loading Core Modules");
	//GameRegistry.registerWorldGenerator(eventmanager);
	//XgenHooks.addHooks();
	XgenRCore.addCore();
	XgenBCore.addCore();
	
        

        
}


}