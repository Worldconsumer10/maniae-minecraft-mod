package com.maniae.status_effect;

import com.maniae.ManiaeMod;
import com.maniae.status_effect.status_list.tazed;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Status_Effects {
    public static final StatusEffect TAZED = new tazed();
    public static void RegisterStatusEffects(){
        Registry.register(Registry.STATUS_EFFECT, new Identifier(ManiaeMod.MOD_ID,"tazed"),TAZED);
    }
}
