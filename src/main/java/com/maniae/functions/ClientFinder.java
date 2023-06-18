package com.maniae.functions;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ClientFinder {
    private static List<MinecraftClient> clients = new ArrayList<>();

    public static void initialize() {
        ClientTickEvents.START_CLIENT_TICK.register(client -> clients.add(client));
        ClientTickEvents.END_CLIENT_TICK.register(client -> clients.remove(client));
    }

    public static @Nullable MinecraftClient findClient(net.minecraft.entity.LivingEntity entity) {
        for (MinecraftClient client : clients) {
            if (client == null)
                continue;
            if (client.player != null && client.player.equals(entity))
                return client;
        }
        return null;
    }
}
