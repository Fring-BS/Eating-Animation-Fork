package ru.tpsd.eatinganimationmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.Identifier;

public class EatingAnimationClientMod implements ClientModInitializer {

    private static final String MOD_ID = "eatinganimationid";

    @Override
    public void onInitializeClient() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(eatinganimation ->
            ResourceManagerHelper.registerBuiltinResourcePack(
                locate("supporteatinganimation"),
                eatinganimation,
                ResourcePackActivationType.ALWAYS_ENABLED));
    }

    public static Identifier locate(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
