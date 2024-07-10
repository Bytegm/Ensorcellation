package cofh.ensorcellation.common.enchantment;

import cofh.lib.common.enchantment.EnchantmentCoFH;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.neoforged.neoforge.common.ToolActions;

public class BulwarkEnchantment extends EnchantmentCoFH {

    public BulwarkEnchantment() {

        super(Rarity.UNCOMMON, EnchantmentCategory.BREAKABLE, new EquipmentSlot[]{EquipmentSlot.OFFHAND});
    }

    @Override
    protected int maxDelegate(int level) {

        return getMinCost(level) + 50;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {

        return enable && (stack.getItem().canPerformAction(stack, ToolActions.SHIELD_BLOCK));
    }

}
