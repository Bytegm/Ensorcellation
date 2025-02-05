package cofh.ensorcellation.common.enchantment.nyi;

import cofh.lib.common.enchantment.EnchantmentOverride;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

import static cofh.lib.util.constants.ModIds.ID_ENSORCELLATION;

public class MendingEnchantmentAlt extends EnchantmentOverride {

    public static float anvilDamage = 0.03F;

    public MendingEnchantmentAlt() {

        super(Rarity.RARE, EnchantmentCategory.BREAKABLE, EquipmentSlot.values());
        descriptionId = "enchantment." + ID_ENSORCELLATION + ".preservation";
        treasureEnchantment = true;
    }

    @Override
    public String getDescriptionId() {

        return enable ? "enchantment.ensorcellation.preservation" : "enchantment.minecraft.mending";
    }

    @Override
    public int getMinCost(int level) {

        return level * 25;
    }

    @Override
    public int getMaxCost(int level) {

        return getMinCost(level) + 50;
    }

}
