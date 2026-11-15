# Alex's Mobs Delight Refoxed

A Farmer's Delight compatibility add-on for **Alex's Mobs Neo** on NeoForge 1.21.1. It adds around 100 new foods and 9 new tools, and most of the key ingredients come from hunting the mobs of Alex's Mobs.

This is a fork of [Alex's Mobs Delight Reborn](https://www.curseforge.com/minecraft/mc-mods/alexs-mobs-delight-reborn) by FromtheArakiel. The only change is the Alex's Mobs port it runs on: [Alex's Mobs Neo](https://www.curseforge.com/minecraft/mc-mods/alexs-mobs-neo) with the real Citadel, instead of [Alex's Mobs Continued](https://www.curseforge.com/minecraft/mc-mods/alexs-mobs-continued).

## Requirements

- NeoForge 21.1 for Minecraft 1.21.1
- [Alex's Mobs Neo](https://www.curseforge.com/minecraft/mc-mods/alexs-mobs-neo) 1.22 or newer
- [Citadel](https://www.curseforge.com/minecraft/mc-mods/citadel) 2.7 or newer
- [Farmer's Delight](https://www.curseforge.com/minecraft/mc-mods/farmers-delight)
- [Architectury API](https://www.curseforge.com/minecraft/mc-mods/architectury-api) 13.0.11 or newer
- Optional: JEI, Jade

Fabric is not supported, because Alex's Mobs Neo is NeoForge-only.

## What changed from Reborn

- Compiles against Alex's Mobs Neo 1.22.9 and Citadel 2.7.1 instead of Alex's Mobs Continued 2.2.2. Continued bundles its own copy of Citadel inside `com.github.alexthe666.alexsmobs.citadel`; Alex's Mobs Neo uses the real Citadel (`com.github.alexthe666.citadel`).
- Declares Citadel as a required dependency and requires Alex's Mobs 1.22 or newer.
- Removed the Fabric module.
- Renamed to Alex's Mobs Delight Refoxed. The mod ID stays `alexsmobsdelight`, so existing worlds keep their items.

## Building

```
./gradlew :neoforge:build
```

The mod jar is written to `neoforge/build/libs/`. The dependency jars the build compiles against are in `libs/`.

## Credits

- [BF_Meow](https://www.curseforge.com/members/bf_meow/projects): the original [Alex's Mobs Delight](https://www.curseforge.com/minecraft/mc-mods/alexs-mobs-delight)
- [FromtheArakiel](https://www.curseforge.com/members/fromthearakiel/projects): the NeoForge 1.21.1 port, [Alex's Mobs Delight Reborn](https://github.com/FromtheArakiel/Alexs-Mobs-Delight-Reborn)

## License

GNU Lesser General Public License v3.0, the same as the original mod and Reborn. See [LICENSE.txt](LICENSE.txt).

## Bugs

Report them in the CurseForge comments or on this repository's Issues page.
