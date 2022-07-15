package com.bioxx.tfc.WorldGen.GenLayers.Biome;

import com.bioxx.tfc.WorldGen.GenLayers.GenLayerTFC;
import com.bioxx.tfc.WorldGen.TFCBiome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerBiomeEdge extends GenLayerTFC {
    public GenLayerBiomeEdge(long par1, GenLayer par3GenLayer) {
        super(par1);
        this.parent = (GenLayerTFC) par3GenLayer;
    }

    /**
     * Returns a list of integer values generated by this layer. These may be interpreted as temperatures, rainfall
     * amounts, or biomeList[] indices based on the particular GenLayer subclass.
     */
    @Override
    public int[] getInts(int par1, int par2, int xSize, int zSize) {
        int[] inCache = this.parent.getInts(par1 - 1, par2 - 1, xSize + 2, zSize + 2);
        validateIntArray(inCache, xSize + 2, zSize + 2);
        int[] outCache = IntCache.getIntCache(xSize * zSize);
        int var10;
        int var11;
        int var12;
        int var13;

        for (int z = 0; z < zSize; ++z) {
            for (int x = 0; x < xSize; ++x) {
                this.initChunkSeed(x + par1, z + par2);
                int thisID = inCache[x + 1 + (z + 1) * (xSize + 2)];

                var10 = inCache[x + 1 + (z + 1 - 1) * (xSize + 2)];
                var11 = inCache[x + 1 + 1 + (z + 1) * (xSize + 2)];
                var12 = inCache[x + 1 - 1 + (z + 1) * (xSize + 2)];
                var13 = inCache[x + 1 + (z + 1 + 1) * (xSize + 2)];

                if (thisID == TFCBiome.HIGH_HILLS.biomeID) {
                    if (var10 == TFCBiome.HIGH_HILLS.biomeID
                            && var11 == TFCBiome.HIGH_HILLS.biomeID
                            && var12 == TFCBiome.HIGH_HILLS.biomeID
                            && var13 == TFCBiome.HIGH_HILLS.biomeID) outCache[x + z * xSize] = thisID;
                    else outCache[x + z * xSize] = TFCBiome.HIGH_HILLS_EDGE.biomeID;
                } else if (thisID == TFCBiome.MOUNTAINS.biomeID) {
                    if (var10 == TFCBiome.MOUNTAINS.biomeID
                            && var11 == TFCBiome.MOUNTAINS.biomeID
                            && var12 == TFCBiome.MOUNTAINS.biomeID
                            && var13 == TFCBiome.MOUNTAINS.biomeID) outCache[x + z * xSize] = thisID;
                    else outCache[x + z * xSize] = TFCBiome.MOUNTAINS_EDGE.biomeID;
                } else if (thisID == TFCBiome.SWAMPLAND.biomeID) {
                    if (var10 == TFCBiome.SWAMPLAND.biomeID
                            && var11 == TFCBiome.SWAMPLAND.biomeID
                            && var12 == TFCBiome.SWAMPLAND.biomeID
                            && var13 == TFCBiome.SWAMPLAND.biomeID) outCache[x + z * xSize] = thisID;
                    else outCache[x + z * xSize] = TFCBiome.PLAINS.biomeID;
                } else if (thisID == TFCBiome.HIGH_PLAINS.biomeID) {
                    if (var10 == TFCBiome.HIGH_PLAINS.biomeID
                            && var11 == TFCBiome.HIGH_PLAINS.biomeID
                            && var12 == TFCBiome.HIGH_PLAINS.biomeID
                            && var13 == TFCBiome.HIGH_PLAINS.biomeID) outCache[x + z * xSize] = thisID;
                    else outCache[x + z * xSize] = TFCBiome.PLAINS.biomeID;
                } else {
                    outCache[x + z * xSize] = thisID;
                }

                validateInt(outCache, x + z * xSize);
            }
        }
        return outCache;
    }
}
