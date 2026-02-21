# Vanadium Shaders

## Overview
Vanadium is a shader loader for Minecraft that uses Vulkan graphics technology. It loads custom shader packs to change how your game looks - from subtle lighting improvements to dramatic visual effects.

## Features
- Load SPIR-V shader packs with custom visual effects
- Real-time hot reload - changes apply instantly without restarting
- In-game shader menu accessible from Video Settings
- Graceful fallback if something goes wrong
- Works exclusively with VulkanMod for best performance

## How to Use
1. Make sure VulkanMod is installed (required dependency)
2. Place your `.mcshader` packs in the `shaderpacks` folder inside your Minecraft directory
3. Launch Minecraft and go to Options → Video Settings → click "Vanadium Shaders"
4. Select a pack from the list and click "Enable Shaders"
5. Use the "Reload Packs" button to scan for newly added packs without restarting

### Commands
- `/vanadium list` - Shows all loaded shader packs
- `/vanadium status` - Shows which pack is active
- `/vanadium reload` - Reloads all packs from the shaderpacks folder
- `/vanadium activate <pack_id>` - Activates a specific pack

## Tips & Tricks
- Drop new `.mcshader` files into your shaderpacks folder while playing - they'll appear automatically
- If shaders cause issues, disable them and the fallback renderer will take over
- Only `.mcshader` files work (not `.zip` packs from other shaders)

## Known Limitations
- Requires VulkanMod to be installed - won't work without it
- Only supports precompiled SPIR-V shaders (no GLSL)
- Compute shaders are required in every pack
