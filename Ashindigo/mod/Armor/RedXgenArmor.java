package XGen.Ashindigo.mod.Armor;

import XGen.Ashindigo.mod.*;
import XGen.Ashindigo.mod.RedCore.XgenRCore;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class RedXgenArmor extends ItemArmor
{

    public RedXgenArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
    }

    public void func_94581_a(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon("blfngl" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    public String getArmorTextureFile(ItemStack par1)
    {
        if ( par1.itemID==XgenRCore.RedXgenHelmet.itemID||par1.itemID==XgenRCore.RedXgenChestPlate.itemID||par1.itemID==XgenRCore.RedXgenBoots.itemID)
        {
                return "/blfngl/tutorial/textures/MythArmor_1.png";
        }
        if (par1.itemID==XgenRCore.RedXgenLegs.itemID)
        {
            return "/blfngl/tutorial/textures/MythArmor_2.png";
        }
                return "/blfngl/tutorial/textures/MythArmor_1.png";
        }      
}
