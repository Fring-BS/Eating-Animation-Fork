# Eating Animation Fork

A simple, client-side Fabric mod that adds smooth 3-stage sprite animations for eating food and drinking potions in Minecraft 1.21.11. Watch your apple get smaller bite-by-bite, your bread tear apart, your potion bottle empty sip-by-sip — all in your hand, in the hotbar, and in the inventory.

> **Unofficial fork** of the beloved [Eating Animation](https://github.com/Theoness1/EatingAnimation) mod by `theone_ss`, ported to Minecraft 1.21.11 using the new 1.21.4+ item model definition system. Original mod is MIT licensed; this fork is MIT licensed too. Full credit to the original author.

---

## Features

- **43 vanilla foods & drinks animated** — every food item in the game (apple, bread, cooked beef, golden apple, chorus fruit, suspicious stew, milk bucket, honey bottle, ominous bottle, and 35 more) has its own custom 3-frame eating animation.
- **Animated potions** — all potion types play a 3-frame drinking animation with the correct liquid color (the potion tint is preserved during drinking, so a healing potion stays red, night vision stays blue, etc.).
- **Bundled mod-support resource pack** — ships with a built-in, default-enabled resource pack that adds eating animations for **271 food items** across **15 popular mods**:
  - Adorn (4 items) — hot chocolate, glow berry tea, sweet berry juice, nether wart coffee
  - Additional Additions (4 items) — berry pie, chicken nugget, fried egg, honeyed apple
  - BetterEnd (14 items)
  - BetterNether (7 items)
  - Botania (2 items)
  - Create (5 items)
  - Duckling (1 item)
  - Expanded Delight (33 items)
  - Farmer's Delight (75 items)
  - Food Plus ID (93 items)
  - Hybrid-Aquatic (12 items)
  - Naturalist (11 items)
  - Snow Pig (2 items)
  - The Bumblezone (5 items)
  - Winterly (3 items)
- **Works in your hand, in the hotbar, in the inventory, in item frames, and on other players** — anywhere items render, the animation plays.
- **Pure client-side** — no server install required. Drop the jar in your `mods/` folder and you're done.
- **No performance impact** — uses Minecraft's native item model system, no tick events, no mixins, no per-frame rendering hooks.

---

## Requirements

| Dependency | Version |
|------------|---------|
| Minecraft Java Edition | **1.21.11** (also works on 1.21.4 through 1.21.10) |
| Fabric Loader | 0.18.1 or newer |
| Fabric API | 0.140.2+1.21.11 or newer |
| Java | 21+ |

---

## Installation

1. Install [Fabric Loader](https://fabricmc.net/use/) for Minecraft 1.21.11
2. Download [Fabric API](https://modrinth.com/mod/fabric-api) and drop it in your `mods/` folder
3. Download **Eating Animation Fork** from this page and drop it in your `mods/` folder
4. Launch Minecraft 1.21.11 — that's it, no config needed

The bundled mod-support resource pack is enabled by default. If you don't want the third-party mod animations, you can disable it in `Options → Resource Packs`.

---

## What's different from the original mod

This fork is a full rewrite of the rendering pipeline to use Minecraft 1.21.4's new **data-driven item model definition** system (the original mod used `ModelPredicateProviderRegistry` + JSON `"overrides"` blocks, which Mojang removed in 1.21.4).

Key changes:

- **Targets Minecraft 1.21.11** with Fabric Loader 0.18.1, Yarn 1.21.11+build.4, Fabric API 0.140.2+1.21.11
- **Builds with Loom 1.14 + Gradle 9.2 + Java 21**
- **314 item model JSON files** (`assets/<namespace>/items/<food>.json`) generated from the original mod's legacy override files, using `minecraft:condition` (`using_item`) + `minecraft:range_dispatch` (`use_duration` scaled by 1/30) to drive the 3-stage animation
- **All 939 original per-stage frame models** (`apple_eating_0.json`, `apple_eating_1.json`, `apple_eating_2.json`, etc.) preserved unchanged — same artwork as the original mod
- **All 957 original textures** preserved unchanged
- **Zero Java rendering code** — the mod's only Java class just registers the bundled resource pack. All animation logic lives in the JSON files, which means better performance, easier maintenance, and no mixins to break on Minecraft updates
- **Potion rendering fixed** — potions now use the correct vanilla 1.21.11 model (`minecraft:item/potion`) with the proper packed-int tint (`default: -13083194`), and the tint is applied to all 3 drinking frames so the liquid color stays correct during the drinking animation

---

## Known issues / FAQ

**Q: The mod doesn't load / shows as incompatible in MultiMC / Prism Launcher.**
A: Make sure you're launching Minecraft **1.21.11** with Fabric Loader 0.16+ and Fabric API 0.140.2+1.21.11 (or newer) installed.

**Q: Does this work on servers?**
A: Yes — it's purely client-side. You can join any vanilla server and the animations will work. The server doesn't need this mod installed.

**Q: Can I use this in my modpack?**
A: Yes — MIT licensed, no permission needed. Just include the jar in your modpack and credit the original author (`theone_ss`) and this fork.

**Q: Will this be ported to Forge / NeoForge / Quilt?**
A: Not by me. The mod is MIT licensed, so anyone is welcome to port it. Quilt users can probably run the Fabric version directly via Quilt's Fabric compatibility layer.

---

## License & Credits

**MIT Licensed** — see [LICENSE](https://github.com/Fring-BS/Eating-Animation-Fork/blob/main/LICENSE)

- **Original mod**: [Eating Animation](https://github.com/Theoness1/EatingAnimation) by `theone_ss`, `spusik_`, `PinkGoosik`, `DoctorNight1` — MIT licensed
- **This fork**: maintained by **[Fring]**, ported to Minecraft 1.21.11 using the new item model definition system
- **All artwork** (food/drink sprites, mod icon) is from the original mod, used under the MIT license

If you find a bug or want to request support for a new mod's food items, please open an issue on the [project repository](https://github.com/Fring-BS/Eating-Animation-Fork/issues).

---

## Links

- **Source code**: [GitHub](https://github.com/Fring-BS/Eating-Animation-Fork)
- **Issue tracker**: [GitHub Issues](https://github.com/Fring-BS/Eating-Animation-Fork/issues)
