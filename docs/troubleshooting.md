# Troubleshooting

## Vanadium does not initialize

Cause:

- VulkanMod not installed or not loading

Fix:

- Install VulkanMod and verify Fabric loads it.

## No packs are listed

Check:

- pack extension is `.mcshader`
- pack is placed in `<gameDir>/shaderpacks/`
- `metadata.json` exists and is valid

## Pack is rejected

Check:

- required metadata fields are present
- `modules.compute` exists
- module paths point to valid SPIR-V binaries
- entrypoint names match actual SPIR-V entrypoints

## UI entry missing in Video Settings

Check:

- client entrypoint `net.vanadium.VanadiumClient` is present in `fabric.mod.json`
- client classes are under `src/client/java`
- build includes `src/client/resources/vanadium.client.mixins.json`

## Build fails with Gradle lock/permission errors

Cause:

- wrapper cache lock in `~/.gradle` not writable in sandbox

Fix:

- rerun build with proper permissions for Gradle cache access.
