package com.bioxx.tfc.Blocks.Terrain;

import com.bioxx.tfc.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockIgInBrick extends BlockIgInSmooth {
    public BlockIgInBrick() {
        super();
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegisterer) {
        for (int i = 0; i < names.length; i++)
            icons[i] = iconRegisterer.registerIcon(Reference.MOD_ID + ":" + "rocks/" + names[i] + " Brick");
    }
}
