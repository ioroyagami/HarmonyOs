package com.example.myapplication;

import com.example.myapplication.slice.FirstAbilitySliceSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class FirstAbilitySlice extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(FirstAbilitySliceSlice.class.getName());
    }
}
