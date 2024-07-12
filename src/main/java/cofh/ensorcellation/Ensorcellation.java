package cofh.ensorcellation;

import cofh.core.client.event.CoreClientEvents;
import cofh.core.common.config.ConfigManager;
import cofh.ensorcellation.common.config.BaseEnchantmentConfig;
import cofh.ensorcellation.common.config.OverrideEnchantmentConfig;
import cofh.ensorcellation.init.registries.ModEnchantments;
import cofh.lib.util.DeferredRegisterCoFH;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.enchantment.Enchantment;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static cofh.lib.util.constants.ModIds.ID_ENSORCELLATION;

@Mod (ID_ENSORCELLATION)
public class Ensorcellation {

    public static final Logger LOG = LogManager.getLogger(ID_ENSORCELLATION);
    public static final ConfigManager CONFIG_MANAGER = new ConfigManager();

    public static final DeferredRegisterCoFH<Enchantment> ENCHANTMENTS = DeferredRegisterCoFH.create(BuiltInRegistries.ENCHANTMENT, ID_ENSORCELLATION);

    public Ensorcellation(ModContainer modContainer, IEventBus modEventBus) {

        modEventBus.addListener(this::clientSetup);

        ENCHANTMENTS.register(modEventBus);

        CONFIG_MANAGER.register(modEventBus)
                .addServerConfig(new BaseEnchantmentConfig())
                .addServerConfig(new OverrideEnchantmentConfig());
        CONFIG_MANAGER.setupServer();

        ModEnchantments.register();
    }

    // region INITIALIZATION
    private void clientSetup(final FMLClientSetupEvent event) {

        event.enqueueWork(() -> CoreClientEvents.addNamespace(ID_ENSORCELLATION));
    }
    // endregion
}
