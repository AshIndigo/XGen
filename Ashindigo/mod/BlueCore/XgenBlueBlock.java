package XGen.Ashindigo.mod.BlueCore;

import XGen.Ashindigo.mod.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class XgenBlueBlock extends Block
{
       public XgenBlueBlock(int id, Material par2Material)
       {
             super(id, par2Material);
             this.setCreativeTab(CreativeTabs.tabBlock);
       }
      
       public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(MainXgenMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
}