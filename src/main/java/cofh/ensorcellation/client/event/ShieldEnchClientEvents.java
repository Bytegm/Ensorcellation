package cofh.ensorcellation.client.event;

import cofh.ensorcellation.common.enchantment.PhalanxEnchantment;
import cofh.lib.util.helpers.MathHelper;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.ComputeFovModifierEvent;
import net.neoforged.neoforge.common.ToolActions;

import static cofh.ensorcellation.init.registries.ModEnchantments.PHALANX;
import static cofh.lib.util.Utils.getItemEnchantmentLevel;
import static cofh.lib.util.constants.ModIds.ID_ENSORCELLATION;

@Mod.EventBusSubscriber (value = Dist.CLIENT, modid = ID_ENSORCELLATION)
public class ShieldEnchClientEvents {

    private ShieldEnchClientEvents() {

    }

    private static boolean hadPhalanx;
    private static double modPhalanx;
    private static long timePhalanx;

    @SubscribeEvent
    public static void handleFOVUpdateEvent(ComputeFovModifierEvent event) {

        Player entity = event.getPlayer();
        ItemStack stack = event.getPlayer().getUseItem();

        if (stack.getItem().canPerformAction(stack, ToolActions.SHIELD_BLOCK)) {
            int encPhalanx = getItemEnchantmentLevel(PHALANX.get(), stack);
            if (encPhalanx > 0) {
                modPhalanx = encPhalanx * PhalanxEnchantment.SPEED / 2D;
                hadPhalanx = true;
                timePhalanx = entity.level.getGameTime();
            }
            event.setNewFovModifier((float) MathHelper.clamp(event.getNewFovModifier() - modPhalanx, 1.0D, 2.5D));
        } else if (hadPhalanx) {
            if (entity.level.getGameTime() - 20 > timePhalanx) {
                hadPhalanx = false;
                modPhalanx = 0;
            }
            event.setNewFovModifier((float) MathHelper.clamp(event.getNewFovModifier() - modPhalanx, 1.0D, 2.5D));
        }
    }

}
