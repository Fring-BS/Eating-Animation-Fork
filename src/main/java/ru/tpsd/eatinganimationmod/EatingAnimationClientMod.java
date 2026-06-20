package ru.tpsd.eatinganimationmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;

/**
 * Eating Animation Fork - client initializer.
 *
 * <p>Starting with Minecraft 1.21.4, the legacy {@code ModelPredicateProviderRegistry}
 * ("overrides" + custom predicates such as {@code eating}/{@code eat}) was removed and
 * replaced with the new data-driven item model definition system (JSON files in
 * {@code assets/<namespace>/items/<item>.json}). The eating/drinking animation is now
 * driven entirely by those JSON files using the built-in {@code minecraft:using_item}
 * boolean property and {@code minecraft:use_duration} numeric property (with a scale
 * factor of 1/30 to convert elapsed ticks to the 0.0-1.0+ range the thresholds expect).</p>
 *
 * <p>As a result, this class no longer needs to register any model predicates. It only
 * registers the optional bundled resource pack that adds eating animations for items
 * from supported third-party mods (Adorn, Additional Additions, Farmer's Delight, etc.).</p>
 */
public class EatingAnimationClientMod implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // Register the bundled "Support Eating Animation" resource pack that adds
        // eating animations for items from supported third-party mods.
        FabricLoader.getInstance().getModContainer("eatinganimationid").ifPresent(eatinganimation ->
                ResourceManagerHelper.registerBuiltinResourcePack(
                        locate("supporteatinganimation"),
                        eatinganimation,
                        ResourcePackActivationType.DEFAULT_ENABLED));
    }

    public static Identifier locate(String path) {
        return Identifier.ofVanilla(path);
    }
}
