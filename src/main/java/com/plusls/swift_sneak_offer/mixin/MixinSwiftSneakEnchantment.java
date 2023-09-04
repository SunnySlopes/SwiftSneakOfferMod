package com.plusls.swift_sneak_offer.mixin;

import net.minecraft.world.item.enchantment.SwiftSneakEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SwiftSneakEnchantment.class)
public class MixinSwiftSneakEnchantment {
    @Inject(method = "isTradeable", at=@At(value = "HEAD"), cancellable = true)
    private void allowTrade(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
