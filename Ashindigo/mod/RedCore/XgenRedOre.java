package XGen.Ashindigo.mod.RedCore;

import XGen.Ashindigo.mod.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class XgenRedOre extends Block
{
       public XgenRedOre(int id, Material par2Material)
       {
             super(id, par2Material);
             this.setCreativeTab(CreativeTabs.tabBlock);
       }
      
       public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(MainXgenMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
}