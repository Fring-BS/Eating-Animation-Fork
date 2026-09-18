package ru.tpsd.eatinganimationmod;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.AddPackFindersEvent;

@Mod(value = EatingAnimationNeoForgeMod.MOD_ID, dist = Dist.CLIENT)
public class EatingAnimationNeoForgeMod {

    public static final String MOD_ID = "eatinganimationid";
    private static final String BUNDLED_PACK_PATH = "resourcepacks/supporteatinganimation";

    public EatingAnimationNeoForgeMod(IEventBus modEventBus) {
        modEventBus.addListener(this::onAddPackFinders);
    }

    private void onAddPackFinders(AddPackFindersEvent event) {
        if (event.getPackType() != PackType.CLIENT_RESOURCES) {
            return;
        }
        event.addPackFinders(
                Identifier.fromNamespaceAndPath(MOD_ID, BUNDLED_PACK_PATH),
                PackType.CLIENT_RESOURCES,
                Component.literal("Eating Animation Fork - mods support"),
                PackSource.DEFAULT,
                true,
                Pack.Position.TOP);
    }
}
