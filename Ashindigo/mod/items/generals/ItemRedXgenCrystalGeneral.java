package XGen.Ashindigo.mod.items.generals;

import XGen.Ashindigo.mod.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRedXgenCrystalGeneral extends Item
{
       public ItemRedXgenCrystalGeneral(int id)
       {
             super(id);
             this.setCreativeTab(CreativeTabs.tabMaterials);
       }
      
       public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(MainXgenMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
}