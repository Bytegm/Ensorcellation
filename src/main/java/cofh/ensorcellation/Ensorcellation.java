package cofh.ensorcellation;

import cofh.core.client.event.CoreClientEvents;
import cofh.core.common.config.ConfigManager;
import cofh.ensorcellation.common.config.BaseEnchantmentConfig;
import cofh.ensorcellation.common.config.OverrideEnchantmentConfig;
import cofh.ensorcellation.init.registries.ModEnchantments;
import cofh.lib.util.DeferredRegisterCoFH;
import net.minecraft.world.item.enchantment.Enchantment;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.neoforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static cofh.lib.util.constants.ModIds.ID_ENSORCELLATION;
import static cofh.lib.util.constants.ModIds.ID_MINECRAFT;

@Mod (ID_ENSORCELLATION)
public class Ensorcellation {

    public static final Logger LOG = LogManager.getLogger(ID_ENSORCELLATION);
    public static final ConfigManager CONFIG_MANAGER = new ConfigManager();

    public static final DeferredRegisterCoFH<Enchantment> ENCHANTMENTS = DeferredRegisterCoFH.create(ForgeRegistries.ENCHANTMENTS, ID_ENSORCELLATION);
    public static final DeferredRegisterCoFH<Enchantment> OVERRIDES = DeferredRegisterCoFH.create(ForgeRegistries.ENCHANTMENTS, ID_MINECRAFT);

    public Ensorcellation() {

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::clientSetup);

        ENCHANTMENTS.register(modEventBus);
        OVERRIDES.register(modEventBus);

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
