package net.vanadium.compat;

public record CompatibilityStatus(
        boolean vulkanModLoaded
) {
    public boolean canBootVanadium() {
        return vulkanModLoaded;
    }
}
