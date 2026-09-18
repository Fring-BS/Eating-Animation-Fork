package ru.tpsd.eatinganimationmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.Identifier;

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
