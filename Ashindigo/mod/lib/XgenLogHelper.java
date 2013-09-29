package XGen.Ashindigo.mod.lib;

import java.util.logging.Level;
import java.util.logging.Logger;

import XGen.Ashindigo.mod.MainXgenMod;

import cpw.mods.fml.common.FMLLog;

public class XgenLogHelper {
private static Logger logger = Logger.getLogger(MainXgenMod.modid);

public static void init() {
logger.setParent(FMLLog.getLogger());
}

public static void log(Level logLevel, String message) {
logger.log(logLevel, message);
}
}