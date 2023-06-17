package com.maniae.functions;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class ClientFinder {
    private static List<MinecraftClient> clients = new List<>();

    public static void initialize() {
        ClientTickEvents.START_CLIENT_TICK.register(client -> clients.Add(client));
        ClientTickEvents.END_CLIENT_TICK.register(client -> clients.Remove(client));
    }

    public static @Nullable MinecraftClient findClient(net.minecraft.entity.LivingEntity entity) {
        for (int i = 0; i < clients.count; i++) {
            MinecraftClient client = clients.ElementAt(i);
            if (client==null)
                continue;
            if (client.player != null && client.player.equals(entity))
                return client;
        }
        return null;
    }
}
