package com.maniae.status_effect;

public class Status_Effects {
    public static final ICustomStatusEffect TAZED = new tazed();
    public static void RegisterStatusEffects(){
        TAZED.RegisterStatusEffect();
    }
}
