package com.bioxx.tfc.Containers.Slots;

import com.bioxx.tfc.api.Enums.EnumFoodGroup;
import com.bioxx.tfc.api.Enums.EnumSize;
import com.bioxx.tfc.api.Interfaces.ICookableFood;
import com.bioxx.tfc.api.Interfaces.ISize;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class SlotCookableFoodOnly extends SlotSize {
    private List<EnumFoodGroup> excpetionsFG = new ArrayList<EnumFoodGroup>();
    private List<EnumFoodGroup> inclusionsFG = new ArrayList<EnumFoodGroup>();

    public SlotCookableFoodOnly(IInventory iinventory, int i, int j, int k) {
        super(iinventory, i, j, k);
        this.setSize(EnumSize.SMALL);
    }

    @Override
    public boolean isItemValid(ItemStack itemstack) {
        if (itemstack.getItem() instanceof ICookableFood) {
            EnumFoodGroup efg = ((ICookableFood) itemstack.getItem()).getFoodGroup();
            if (efg == null) return false;
            boolean except = excpetionsFG.contains(efg);
            boolean include = inclusionsFG.contains(efg) || inclusionsFG.isEmpty();
            if (except || !include) return false;
            if (itemstack.getItem() instanceof ISize
                    && ((ISize) itemstack.getItem()).getSize(itemstack).stackSize >= size.stackSize)
                return super.isItemValid(itemstack);
        }
        return false;
    }

    public SlotCookableFoodOnly addFGException(EnumFoodGroup... ex) {
        for (int i = 0; i < ex.length; i++) excpetionsFG.add(ex[i]);
        return this;
    }

    public SlotCookableFoodOnly addFGInclusion(EnumFoodGroup... ex) {
        for (int i = 0; i < ex.length; i++) inclusionsFG.add(ex[i]);
        return this;
    }
}
