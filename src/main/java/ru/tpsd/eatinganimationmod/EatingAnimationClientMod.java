package ru.tpsd.eatinganimationmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.Identifier;

/**
 * Eating Animation Fork - client initializer for Minecraft 26.x.
 *
 * <p>Registers the bundled "supporteatinganimation" resource pack as an
 * {@link PackActivationType#ALWAYS_ENABLED always-enabled} pack. This
 * means the pack:</p>
 * <ul>
 *   <li>Is enabled by default on every launch (appears in the "Selected" column
 *       of the Resource Packs menu, not the "Available" column).</li>
 *   <li>Cannot be disabled by the user — it is locked, just like vanilla's
 *       built-in "Default" resource pack.</li>
 *   <li>Does not require any options.txt manipulation, tick callbacks, or
 *       marker files. Minecraft's own resource pack system handles everything
 *       natively.</li>
 * </ul>
 */
public class EatingAnimationClientMod implements ClientModInitializer {

    private static final String MOD_ID = "eatinganimationid";
    private static final String BUNDLED_PACK_ID = "supporteatinganimation";

    @Override
    public void onInitializeClient() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer ->
                ResourceLoader.registerBuiltinPack(
                        locate(BUNDLED_PACK_ID),
                        modContainer,
                        PackActivationType.ALWAYS_ENABLED));
    }

    public static Identifier locate(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
