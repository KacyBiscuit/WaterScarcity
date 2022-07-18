package io.github.KacyBiscuit.water_scarcity.mixin;

import net.minecraft.fluid.WaterFluid;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WaterFluid.class)
public class WaterFluidMixin {
	@Inject(method = "isInfinite", at = @At("HEAD"), cancellable = true)
	void isInfinite(CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(false);
	}
}
