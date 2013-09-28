package XGen.Ashindigo.mod.WorldProviders;

import XGen.Ashindigo.mod.MainXgenMod;
import XGen.Ashindigo.mod.ChunkProviders.ChunkProviderRedD;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderRedD extends WorldProvider
{
       @Override
       public String getDimensionName()
       {
              return "Red Xgen Dimension";
       }
public void registerWorldChunkManager()
{
       this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.desertHills, 0.8F, 0.1F);
       this.dimensionId = MainXgenMod.dimensionId;
}
public IChunkProvider createChunkGenerator()
{
       return new ChunkProviderRedD(worldObj, worldObj.getSeed(), true);
}
