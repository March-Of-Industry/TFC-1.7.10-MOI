package com.bioxx.tfc.Blocks.Terrain;

import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.TFCBlocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class BlockIgIn extends BlockStone {
    public BlockIgIn(Material material) {
        super(material);
        this.dropBlock = TFCBlocks.stoneIgInCobble;
        names = Global.STONE_IGIN;
        icons = new IIcon[names.length];
        looseStart = Global.STONE_IGIN_START;
        gemChance = 2;
    }
}
