package net.vanadium;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class VanadiumClient implements ClientModInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger("Vanadium/Client");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Vanadium client entrypoint initialized");
    }
}
