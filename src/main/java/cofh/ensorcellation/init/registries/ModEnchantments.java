package cofh.ensorcellation.init.registries;

import cofh.ensorcellation.common.enchantment.*;
import cofh.ensorcellation.common.enchantment.curse.CurseFoolEnchant;
import cofh.ensorcellation.common.enchantment.curse.CurseMercyEnchantment;
import cofh.lib.common.enchantment.EnchantmentCoFH;
import net.minecraft.world.item.enchantment.Enchantment;
import net.neoforged.neoforge.registries.DeferredHolder;

import static cofh.core.util.references.EnsorcIDs.*;
import static cofh.ensorcellation.Ensorcellation.ENCHANTMENTS;
import static cofh.lib.util.Constants.ARMOR_SLOTS;
import static net.minecraft.world.item.enchantment.Enchantment.Rarity.UNCOMMON;

public class ModEnchantments {

    private ModEnchantments() {

    }

    public static void register() {

    }

    public static final DeferredHolder<Enchantment, EnchantmentCoFH> PROTECTION_MAGIC = ENCHANTMENTS.register(ID_PROTECTION_MAGIC, () -> new ProtectionEnchantmentMagic(UNCOMMON, ARMOR_SLOTS));
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> DISPLACEMENT = ENCHANTMENTS.register(ID_DISPLACEMENT, DisplacementEnchantment::new);
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> FIRE_REBUKE = ENCHANTMENTS.register(ID_FIRE_REBUKE, FireRebukeEnchantment::new);
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> FROST_REBUKE = ENCHANTMENTS.register(ID_FROST_REBUKE, FrostRebukeEnchantment::new);

    public static final DeferredHolder<Enchantment, EnchantmentCoFH> AIR_AFFINITY = ENCHANTMENTS.register(ID_AIR_AFFINITY, AirAffinityEnchantment::new);
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> XP_BOOST = ENCHANTMENTS.register(ID_XP_BOOST, XpBoostEnchantment::new);
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> GOURMAND = ENCHANTMENTS.register(ID_GOURMAND, GourmandEnchantment::new);

    public static final DeferredHolder<Enchantment, EnchantmentCoFH> REACH = ENCHANTMENTS.register(ID_REACH, ReachEnchantment::new);
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> VITALITY = ENCHANTMENTS.register(ID_VITALITY, VitalityEnchantment::new);

    public static final DeferredHolder<Enchantment, EnchantmentCoFH> DAMAGE_ENDER = ENCHANTMENTS.register(ID_DAMAGE_ENDER, DamageEnderEnchantment::new);
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> DAMAGE_ILLAGER = ENCHANTMENTS.register(ID_DAMAGE_ILLAGER, DamageIllagerEnchantment::new);
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> DAMAGE_VILLAGER = ENCHANTMENTS.register(ID_DAMAGE_VILLAGER, DamageVillagerEnchantment::new);

    public static final DeferredHolder<Enchantment, EnchantmentCoFH> CAVALIER = ENCHANTMENTS.register(ID_CAVALIER, CavalierEnchantment::new);
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> FROST_ASPECT = ENCHANTMENTS.register(ID_FROST_ASPECT, FrostAspectEnchantment::new);
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> INSTIGATING = ENCHANTMENTS.register(ID_INSTIGATING, InstigatingEnchantment::new);
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> LEECH = ENCHANTMENTS.register(ID_LEECH, LeechEnchantment::new);
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> MAGIC_EDGE = ENCHANTMENTS.register(ID_MAGIC_EDGE, MagicEdgeEnchantment::new);
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> VORPAL = ENCHANTMENTS.register(ID_VORPAL, VorpalEnchantment::new);

    public static final DeferredHolder<Enchantment, EnchantmentCoFH> EXCAVATING = ENCHANTMENTS.register(ID_EXCAVATING, ExcavatingEnchantment::new);

    public static final DeferredHolder<Enchantment, EnchantmentCoFH> HUNTER = ENCHANTMENTS.register(ID_HUNTER, HunterEnchantment::new);
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> QUICK_DRAW = ENCHANTMENTS.register(ID_QUICK_DRAW, QuickdrawEnchantment::new);
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> TRUESHOT = ENCHANTMENTS.register(ID_TRUESHOT, TrueshotEnchantment::new);
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> VOLLEY = ENCHANTMENTS.register(ID_VOLLEY, VolleyEnchantment::new);

    public static final DeferredHolder<Enchantment, EnchantmentCoFH> ANGLER = ENCHANTMENTS.register(ID_ANGLER, AnglerEnchantment::new);
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> PILFERING = ENCHANTMENTS.register(ID_PILFERING, PilferingEnchantment::new);

    public static final DeferredHolder<Enchantment, EnchantmentCoFH> BULWARK = ENCHANTMENTS.register(ID_BULWARK, BulwarkEnchantment::new);
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> PHALANX = ENCHANTMENTS.register(ID_PHALANX, PhalanxEnchantment::new);

    public static final DeferredHolder<Enchantment, EnchantmentCoFH> SOULBOUND = ENCHANTMENTS.register(ID_SOULBOUND, SoulboundEnchantment::new);

    public static final DeferredHolder<Enchantment, EnchantmentCoFH> CURSE_FOOL = ENCHANTMENTS.register(ID_CURSE_FOOL, CurseFoolEnchant::new);
    public static final DeferredHolder<Enchantment, EnchantmentCoFH> CURSE_MERCY = ENCHANTMENTS.register(ID_CURSE_MERCY, CurseMercyEnchantment::new);

}
