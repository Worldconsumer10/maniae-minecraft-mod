package com.maniae.status_effect.status_list;

import com.maniae.ManiaeMod;
import com.maniae.functions.ClientFinder;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class tazed extends StatusEffect {
    public tazed() {
        super(StatusEffectCategory.HARMFUL,0xffd000);
    }
    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        ManiaeMod.clientTick.addInputFilter(ClientFinder.findClient(entity));
        super.onApplied(entity, attributes, amplifier);
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        ManiaeMod.clientTick.removeInputFilter(ClientFinder.findClient(entity));
        super.onRemoved(entity, attributes, amplifier);
    }
}
