package XGen.Ashindigo.mod.lib;

import java.io.File;
import java.util.logging.Level;

import XGen.Ashindigo.mod.MainXgenMod;
import XGen.Ashindigo.mod.RedCore.XgenRCore;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
public class XgenConfigurationHander 

	{
public static Configuration config;
public static void init(File file){
config = new Configuration(file);

try{

config.load();

XgenRCore.RedXgenBlock = config.getBlock(XgenRCore.RedXgenBlock, XgenRCore.RedXgenBlock).getInt(XgenRCore.RedXgenBlock);
}

catch(Exception e){

FMLLog.log(Level.SEVERE, e, MainXgenMod.modid + "Has a problem loading the config file");
}

finally{

config.save();
}
}
}