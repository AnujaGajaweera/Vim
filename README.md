# Vanadium Mod

**Vanadium Mod** is a **Vulkan-native shader pack loader** for Minecraft Java Edition, designed to provide a modern, stable, and production-ready SPIR-V shader pipeline. It is fully compatible with **Fabric** (Quilt-friendly) and integrates seamlessly with **VulkanMod**.

Vanadium allows developers and players to run **precompiled SPIR-V shaders** without interfering with existing GLSL shader ecosystems (including Iris `.zip` shaders).

---

## Features

**🔹 Vulkan SPIR-V Shader Pipeline**
Load and bind vertex, fragment, and compute shaders in Minecraft via Vulkan.

**🔹 Hot-Reloading**
Change shader packs without restarting Minecraft. Live updates with automatic rollback on errors.

**🔹 Shader Configuration UI**

* Menu: `Options → Video Settings → Vanadium Shaders`
* View shader metadata: Name, Author, Description, Version, Supported Minecraft version
* Icon preview for each shader pack
* Enable/Disable packs and reload shaders live

**🔹 Compute Shader Support**
Execute GPU compute shaders safely where supported.

**🔹 Safe Fallback**
Automatic fallback to the default Vulkan renderer if shaders fail to load.

**🔹 Iris-Safe Operation**

* `.mcshader` packs are fully isolated
* Does not parse or modify `.zip` shaderpacks
* No conflicts with Iris or other GLSL shader loaders

**🔹 Developer-Friendly Logging**

* Shader compilation and pipeline errors logged
* Hot-reload diagnostics

---

## Shader Pack Format (`.mcshader`)

Vanadium uses **precompiled SPIR-V shaders** packaged in `.mcshader` ZIP archives.

**Required Files:**

**Metadata JSON (`vanadium.json`)**

```json
{
  "name": "Example Shader",
  "author": "AuthorName",
  "description": "A simple SPIR-V shader pack.",
  "icon": "icon.png",
  "version": "1.0.0",
  "minecraft_version": "1.19+"
}
```

**Shader Modules**

* Vertex shader: `shader.vert.spv`
* Fragment shader: `shader.frag.spv`
* Optional compute shader: `shader.comp.spv`
* Optional geometry shader: `shader.geom.spv`

> Vanadium **ignores `.zip` shaderpacks** to avoid conflicts with Iris.

---

## Installation

1. Install Minecraft Java Edition.
2. Install Fabric (Quilt optional).
3. Install VulkanMod.
4. Place `Vanadium Mod.jar` in your `mods/` folder.
5. Place your `.mcshader` shader packs into the `/shaderpacks/` folder.
6. Launch Minecraft.
7. Navigate to:

```
Options → Video Settings → Vanadium Shaders
```

---

## Usage

* Select an active shader pack from the UI.
* Click **Reload** to hot-reload changes.
* Toggle compute shaders if supported by GPU.
* Use the logs for debugging shader compilation issues.

---

## Example Shader Pack Structure

```
myshader.mcshader/
├── vanadium.json
├── shader.vert.spv
├── shader.frag.spv
├── shader.comp.spv  (optional)
├── icon.png         (optional)
```

---

## Mod Compatibility

* Compatible with Fabric, Quilt (if supported)
* Renderer: VulkanMod required
* Safe to use alongside Iris, Sodium, Lithium, and Phosphor
* Does **not** interfere with `.zip` shaderpacks

---

## Contributing

Vanadium is **open-source**. Contributions are welcome!

* Follow the existing modular architecture.
* Keep Vulkan resource handling correct.
* Ensure `.mcshader` packs remain Iris-safe.
* Use the provided Gradle setup for building and testing.

---

## License

Vanadium Mod is licensed under **LGPL 3.0**.

---

## Contact

For support or questions, open an issue in the GitHub repository:
[https://github.com/AnujaGajaweera/Vanadium](https://github.com/AnujaGajaweera/Vanadium)
