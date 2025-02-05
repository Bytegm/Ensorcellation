package cofh.ensorcellation.common.enchantment;

import cofh.lib.common.enchantment.EnchantmentCoFH;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class VitalityEnchantment extends EnchantmentCoFH {

    public static int health = 4;

    public VitalityEnchantment() {

        super(Rarity.VERY_RARE, EnchantmentCategory.ARMOR_CHEST, new EquipmentSlot[]{EquipmentSlot.CHEST});
        maxLevel = 3;
    }

    @Override
    public int getMinCost(int level) {

        return 10 + (level - 1) * 9;
    }

    @Override
    protected int maxDelegate(int level) {

        return getMinCost(level) + 50;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {

        Item item = stack.getItem();
        return enable && (super.canApplyAtEnchantingTable(stack) || item instanceof HorseArmorItem);
    }

}
