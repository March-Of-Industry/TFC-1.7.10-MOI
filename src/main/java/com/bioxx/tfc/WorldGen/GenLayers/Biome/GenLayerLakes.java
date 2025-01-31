package com.bioxx.tfc.WorldGen.GenLayers.Biome;

import com.bioxx.tfc.WorldGen.GenLayers.GenLayerTFC;
import com.bioxx.tfc.WorldGen.TFCBiome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerLakes extends GenLayerTFC {
    public GenLayerLakes(long par1, GenLayer par3GenLayer) {
        super(par1);
        this.parent = (GenLayerTFC) par3GenLayer;
    }

    /**
     * Returns a list of integer values generated by this layer. These may be interpreted as temperatures, rainfall
     * amounts, or biomeList[] indices based on the particular GenLayer subclass.
     */
    @Override
    public int[] getInts(int par1, int par2, int par3, int par4) {
        int[] var5 = this.parent.getInts(par1 - 1, par2 - 1, par3 + 2, par4 + 2);
        int[] var6 = IntCache.getIntCache(par3 * par4);
        int var10;
        int var11;
        int var12;
        int var13;

        for (int var7 = 0; var7 < par4; ++var7) {
            for (int var8 = 0; var8 < par3; ++var8) {
                this.initChunkSeed(var8 + par1, var7 + par2);
                int var9 = var5[var8 + 1 + (var7 + 1) * (par3 + 2)];

                var10 = var5[var8 + 1 + (var7 + 1 - 1) * (par3 + 2)];
                var11 = var5[var8 + 1 + 1 + (var7 + 1) * (par3 + 2)];
                var12 = var5[var8 + 1 - 1 + (var7 + 1) * (par3 + 2)];
                var13 = var5[var8 + 1 + (var7 + 1 + 1) * (par3 + 2)];

                if (isOceanic(var9)) {
                    if (!isOceanic(var10) && !isOceanic(var11) && !isOceanic(var12) && !isOceanic(var13))
                        var6[var8 + var7 * par3] = TFCBiome.LAKE.biomeID;
                    else var6[var8 + var7 * par3] = var9;
                } else {
                    var6[var8 + var7 * par3] = var9;
                }
            }
        }
        return var6;
    }

    private boolean isOceanic(int id) {
        return id == TFCBiome.OCEAN.biomeID || id == TFCBiome.DEEP_OCEAN.biomeID;
    }
}
