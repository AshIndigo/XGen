package XGen.Ashindigo.mod.GreenCore;

import XGen.Ashindigo.mod.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemGreenXGenCrystal extends Item
{
       public ItemGreenXGenCrystal(int id)
       {
             super(id);
             this.setCreativeTab(CreativeTabs.tabMaterials);
       }
      
       public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(MainXgenMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
}