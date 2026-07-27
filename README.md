# Eating Animation Fork

A simple, client-side **Fabric and NeoForge** mod that adds smooth 3-stage sprite animations for eating food and drinking potions in Minecraft. Watch your apple get smaller bite-by-bite, your bread tear apart, your potion bottle empty sip-by-sip — all in your hand, in the hotbar, and in the inventory.

> **Unofficial fork** of the beloved [Eating Animation](https://modrinth.com/mod/eating-animation) mod by `theone_ss`, ported to Fabric and NeoForge for modern Minecraft versions using the new 1.21.4+ item model definition system. Original mod is MIT licensed; this fork is MIT licensed too. Full credit to the original author.

---

## Features

- **All vanilla foods & drinks animated** — every food item in the game has its own custom 3-frame eating animation.
- **Bundled mod-support resource pack** — ships with a built-in, default-enabled resource pack that adds eating animations for **280+ food items** across **15 popular mods**:
  - Adorn (4 items) — hot chocolate, glow berry tea, sweet berry juice, nether wart coffee
  - Additional Additions (4 items) — berry pie, chicken nugget, fried egg, honeyed apple
  - BetterEnd (14 items)
  - BetterNether (7 items)
  - Botania (2 items)
  - Create (5 items)
  - Duckling (1 item)
  - Expanded Delight (33 items)
  - **Farmer's Delight (all items)**
  - Food Plus ID (93 items)
  - Hybrid-Aquatic (12 items)
  - Naturalist (11 items)
  - Snow Pig (2 items)
  - The Bumblezone (5 items)
  - Winterly (3 items)
- **Works everywhere** — in your hand, in the hotbar, in the inventory, and on other players. Anywhere items render, the animation plays.
- **Pure client-side** — no server install required. Drop the jar in your `mods/` folder and you're done. Works on vanilla servers too.
- **No performance impact** — uses Minecraft's native item model system, no tick events, no mixins, no per-frame rendering hooks.
- **Dual loader support** — available for both **Fabric** and **NeoForge**. Pick the jar that matches your loader.

---

## Installation

### Fabric
1. Install [Fabric Loader](https://fabricmc.net/use/) for your Minecraft version
2. Download [Fabric API](https://modrinth.com/mod/fabric-api) for your Minecraft version and drop it in your `mods/` folder
3. Download **Eating Animation Fork** (Fabric jar) from this page and drop it in your `mods/` folder
4. Launch Minecraft — that's it, no config needed

### NeoForge
1. Install [NeoForge](https://neoforged.net/) for your Minecraft version
2. Download **Eating Animation Fork** (NeoForge jar) from this page and drop it in your `mods/` folder
3. Launch Minecraft — that's it, no config needed

---

## What's different from the original mod

This fork is a full rewrite of the rendering pipeline to use Minecraft 1.21.4's new **data-driven item model definition** system

---

## Known issues / FAQ

**Q: The mod doesn't load / shows as incompatible in MultiMC / Prism Launcher.**
A: Make sure you downloaded the jar that matches your loader (Fabric or NeoForge) and your Minecraft version. The Fabric and NeoForge jars are NOT interchangeable — check the filename before installing.

**Q: Does this work on servers?**
A: Yes — it's purely client-side. You can join any vanilla server and the animations will work. The server doesn't need this mod installed.

**Q: Can I use this in my modpack?**
A: Yes — MIT licensed, no permission needed. Just include the jar in your modpack and credit the original author (`theone_ss`) and this fork.

**Q: Will this be ported to Forge / Quilt?**
A: Not by me. The mod is MIT licensed, so anyone is welcome to port it.

---

## License & Credits

**MIT Licensed** — see [LICENSE](https://github.com/Fring-BS/Eating-Animation-Fork/blob/main/LICENSE).

- **Original mod**: [Eating Animation](https://modrinth.com/mod/eating-animation) by `theone_ss`, `spusik_`, `PinkGoosik`, `DoctorNight1` — MIT licensed
- **This fork**: maintained by **Fring** ([github.com/Fring-BS](https://github.com/Fring-BS)), ported to Fabric and NeoForge for modern Minecraft versions using the new item model definition system
- **All artwork** (food/drink sprites, mod icon) is from the original mod, used under the MIT license

If you find a bug or want to request support for a new mod's food items, please open an issue on the [project repository](https://github.com/Fring-BS/Eating-Animation-Fork/issues).

---

## Links

- **Source code**: [GitHub](https://github.com/Fring-BS/Eating-Animation-Fork)
- **Issue tracker**: [GitHub Issues](https://github.com/Fring-BS/Eating-Animation-Fork/issues)
- **Original mod**: [Modrinth](https://modrinth.com/mod/eating-animation) · [CurseForge](https://curseforge.com/minecraft/mc-mods/eating-animation-fabric) · [GitHub](https://github.com/Theoness1/EatingAnimation)