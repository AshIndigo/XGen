package XGen.Ashindigo.mod;

import XGen.Ashindigo.mod.RedCore.XgenRCore;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public final class XgenCreativeTab extends CreativeTabs
{
    public XgenCreativeTab(int par1, String par2Str)
    {
        super(par1, par2Str);
    }

    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return XgenRCore.RedXgenCrystal.itemID;
       
    }

    public String getTranslatedTabLabel()
    {
        return "Xgen Mod Creative Tab";
    }
}