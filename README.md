# Vanadium

Vanadium is a Fabric client mod for loading precompiled SPIR-V shader packs in VulkanMod-based Minecraft.

## Attribution

- Anux (creator)
- Vanadium Maintainers

## License

Vanadium is distributed under `LGPL-3.0-only`.

- Full text: `LICENSE`
- Declared in `src/main/resources/fabric.mod.json`
- Declared in `gradle.properties`

## Runtime Requirements

- Fabric Loader
- Fabric API
- VulkanMod (required)

Vanadium does not depend on Iris, Sodium, Lithium, or Phosphor.

## Features

- `.mcshader` pack loading from `<gameDir>/shaderpacks/`
- Strict metadata validation via `metadata.json`
- SPIR-V module checks (entrypoint/stage/stream shape)
- Graphics + compute pipeline activation flow
- Hot reload with file watcher + `/vanadium reload`
- In-game UI: `Options -> Video Settings -> Vanadium Shaders`

## Build

```bash
./gradlew build
```

## Install

1. Put the built JAR from `build/libs/` into `mods/`.
2. Put `.mcshader` files in `<gameDir>/shaderpacks/`.
3. Start Minecraft with VulkanMod.

## Commands

- `/vanadium list`
- `/vanadium status`
- `/vanadium activate <pack_id>`
- `/vanadium reload`

## Project Layout

- Main/common source: `src/main/java`
- Client source: `src/client/java`
- Common resources: `src/main/resources`
- Client resources: `src/client/resources`

Entrypoints and mixins:

- Main entrypoint: `net.vanadium.mod`
- Client entrypoint: `net.vanadium.VanadiumClient`
- Common mixin config: `vanadium.mixins.json`
- Client mixin config: `vanadium.client.mixins.json`
