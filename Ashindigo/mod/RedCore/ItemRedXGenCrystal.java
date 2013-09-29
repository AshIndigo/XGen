package XGen.Ashindigo.mod.RedCore;

import XGen.Ashindigo.mod.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRedXGenCrystal extends Item
{
       public ItemRedXGenCrystal(int id)
       {
             super(id);
             this.setCreativeTab(CreativeTabs.tabMaterials);
       }
      
       public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(MainXgenMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
}