package net.mixin;

import net.minecraft.server.MinecraftServer;
import net.vanadium.util.StructuredLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public abstract class MinecraftServerMixin {
    private static final Logger VANADIUM_MIXIN_LOGGER = LoggerFactory.getLogger("Vanadium/Mixin");

    @Inject(method = "loadWorld", at = @At("HEAD"))
    private void vanadium$onServerWorldLoad(CallbackInfo ci) {
        StructuredLog.info(VANADIUM_MIXIN_LOGGER, "mixin-load-world", StructuredLog.kv("hook", "minecraft-server-load-world"));
    }
}
