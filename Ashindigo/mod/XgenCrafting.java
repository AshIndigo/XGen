package XGen.Ashindigo.mod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;






public class XgenCrafting
{
       public static void addRecipes()
       {
    	   GameRegistry.addRecipe(new ItemStack(MainXgenMod.RedXgenSword,1), new Object[]{
    		   " T ",
    		   " T ",
    		   " X ",
    		   'T',MainXgenMod.RedXgenCrystal, 'X',Item.stick});
    	   GameRegistry.addRecipe(new ItemStack(MainXgenMod.RedXgenPickaxe,1), new Object[]{
    		   "TTT",
    		   " X ",
    		   " X ",
    		   'T',MainXgenMod.RedXgenCrystal, 'X',Item.stick});
    	   GameRegistry.addRecipe(new ItemStack(MainXgenMod.RedXgenSpade,1), new Object[]{
    		   " T ",
    		   " X ",
    		   " X ",
    		   'T',MainXgenMod.RedXgenCrystal, 'X',Item.stick});
    	   GameRegistry.addRecipe(new ItemStack(MainXgenMod.RedXgenAxe,1), new Object[]{
    		   "TT ",
    		   "TX ",
    		   " X ",
    		   'T',MainXgenMod.RedXgenCrystal, 'X',Item.stick});
    	   //GameRegistry.addRecipe(new ItemStack(MainXgenMod.RedXgenChestPlate,1), new Object[]{
    		   //"T T",
    		   //"TTT",
    		   //"TTT",
    		   //'T',MainXgenMod.RedXgenCrystal});
    	   //GameRegistry.addRecipe(new ItemStack(MainXgenMod.RedXgenHelmet,1), new Object[]{
    		   //"TTT",
    		   //"T T",
    		   //'T',MainXgenMod.RedXgenCrystal});
    	   //GameRegistry.addRecipe(new ItemStack(MainXgenMod.RedXgenBoots,1), new Object[]{
    		   //"T T",
    		   //"T T",
    		   //'T',MainXgenMod.RedXgenCrystal});
    	   //GameRegistry.addRecipe(new ItemStack(MainXgenMod.RedXgenLegs,1), new Object[]{
    		   //"TTT",
    		   //"T T",
    		   //"T T",
    		   //'T',MainXgenMod.RedXgenCrystal});
    	   
    	   
    	   		
            
    	   FurnaceRecipes.smelting().addSmelting(XgenRCore.RedXgenOre.blockID, 0, new ItemStack(MainXgenMod.RedXgenCrystal), 0.1F);
            
    	   GameRegistry.addRecipe(new ItemStack(MainXgenMod.BlueXgenBlock,1), new Object[]{
    		   "TTT",
    		   "TTT",
    		   "TTT",
    		   'T',MainXgenMod.BlueXgenCrystal,});
    	   GameRegistry.addRecipe(new ItemStack(MainXgenMod.BlueXgenSword,1), new Object[]{
    		   " T ",
    		   " T ",
    		   " X ",
    		   'T',MainXgenMod.BlueXgenCrystal, 'X',Item.stick});
    	   GameRegistry.addRecipe(new ItemStack(MainXgenMod.BlueXgenPickaxe,1), new Object[]{
    		   "TTT",
    		   " X ",
    		   " X ",
    		   'T',MainXgenMod.BlueXgenCrystal, 'X',Item.stick});
    	   GameRegistry.addRecipe(new ItemStack(MainXgenMod.BlueXgenSpade,1), new Object[]{
    		   " T ",
    		   " X ",
    		   " X ",
    		   'T',MainXgenMod.BlueXgenCrystal, 'X',Item.stick});
    	   GameRegistry.addRecipe(new ItemStack(MainXgenMod.BlueXgenAxe,1), new Object[]{
    		   "TT ",
    		   "TX ",
    		   " X ",
    		   'T',MainXgenMod.BlueXgenCrystal, 'X',Item.stick});
    	   //GameRegistry.addRecipe(new ItemStack(MainXgenMod.BlueXgenChestPlate,1), new Object[]{
    		   //"T T",
    		   //"TTT",
    		   //"TTT",
    		   //'T',MainXgenMod.BlueXgenCrystal});
    	   //GameRegistry.addRecipe(new ItemStack(MainXgenMod.BlueXgenHelmet,1), new Object[]{
    		   //"TTT",
    		   //"T T",
    		   //'T',MainXgenMod.BlueXgenCrystal});
    	   //GameRegistry.addRecipe(new ItemStack(MainXgenMod.BlueXgenBoots,1), new Object[]{
    		   //"T T",
    		   //"T T",
    		   //'T',MainXgenMod.BlueXgenCrystal});
    	   //GameRegistry.addRecipe(new ItemStack(MainXgenMod.BlueXgenLegs,1), new Object[]{
    		   //"TTT",
    		   //"T T",
    		   //"T T",
    		   //'T',MainXgenMod.BlueXgenCrystal});
    	   
    	   
    	   		
    	   GameRegistry.addShapelessRecipe(new ItemStack(MainXgenMod.BlueXgenCrystal,9), new Object[]{
    		   MainXgenMod.BlueXgenBlock });
    	   
            
    	   FurnaceRecipes.smelting().addSmelting(MainXgenMod.BlueXgenOre.blockID, 0, new ItemStack(MainXgenMod.BlueXgenCrystal), 0.1F);
       }
}
