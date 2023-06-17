package com.maniae.handlers;

import com.maniae.ManiaeMod;
import com.maniae.functions.List;
import com.mojang.datafixers.types.Func;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;

import java.util.UUID;

public class ClientTick implements ClientTickEvents.StartTick {
    private List<UUID> filters = new List();
    private List<UUID> _checked = new List<>();
    public void addInputFilter(MinecraftClient func){
        ManiaeMod.LOGGER.info("Adding User to locked Player Controls");
        if (func != null && func.player!=null)
        filters.Add(func.player.getUuid());
    }
    public void removeInputFilter(MinecraftClient func){
        ManiaeMod.LOGGER.info("Removing user from locked Player Controls");
        if (func != null && func.player!=null)
        filters.Remove(func.player.getUuid());
    }
    @Override
    public void onStartTick(MinecraftClient client) {
        if (client.player != null) {
            if (filters.Contains(client.player.getUuid())) {
                ManiaeMod.LOGGER.info("Locking Player Controls");
                client.player.input.jumping=false;
                client.player.input.pressingForward=false;
                client.player.input.pressingBack=false;
                client.player.input.pressingLeft=false;
                client.player.input.pressingRight=false;
                client.player.input.sneaking=false;
                client.player.headYaw = client.player.prevHeadYaw;
                _checked.Add(client.player.getUuid());
            } else
                if (_checked.Contains(client.player.getUuid())){
                    _checked.Remove(client.player.getUuid());
                    client.options.rawMouseInput=true;
                }
        }
    }
}
