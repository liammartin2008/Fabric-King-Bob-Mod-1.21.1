package com.thelim23.kingbobmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CHEESE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f).build();

    public static final FoodComponent BANANA = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f).build();
}
