package com.bioxx.tfc.Blocks.Terrain;

import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.TFCBlocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class BlockMM extends BlockStone {
    public static boolean fallInstantly;

    public BlockMM(Material material) {
        super(material);
        this.dropBlock = TFCBlocks.stoneMMCobble;
        names = Global.STONE_MM;
        icons = new IIcon[names.length];
        looseStart = Global.STONE_MM_START;
        gemChance = 3;
    }
}
