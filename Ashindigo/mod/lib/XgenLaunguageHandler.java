package XGen.Ashindigo.mod.lib;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class XgenLaunguageHandler{

public static void init(){

/**
* For all files registered in Localizations.java, add them to the Localization Library.
* This way we can use this file to add localizations (names).
*/
for(String LocationFile: XgenLocalizations.localeFiles){

LanguageRegistry.instance().loadLocalization(LocationFile, XgenLocalizationHelper.getLocaleFromFileName(LocationFile), XgenLocalizationHelper.isXMLLanguageFile(LocationFile));
}
}
}