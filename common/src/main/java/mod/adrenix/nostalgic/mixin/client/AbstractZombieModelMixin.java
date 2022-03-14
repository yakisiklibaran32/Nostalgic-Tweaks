package mod.adrenix.nostalgic.mixin.client;

import mod.adrenix.nostalgic.client.config.MixinConfig;
import net.minecraft.client.model.AbstractZombieModel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(AbstractZombieModel.class)
public abstract class AbstractZombieModelMixin
{
    /**
     * Prevents arm movement animations when a zombie becomes aggressive or attacks.
     * Controlled by the zombie arm animation toggle.
     */

    @ModifyArg(method = "setupAnim(Lnet/minecraft/world/entity/monster/Monster;FFFFF)V", index = 2, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/model/AnimationUtils;animateZombieArms(Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;ZFF)V"))
    protected boolean onAnimateAggressiveZombieArms(boolean vanilla)
    {
        return !MixinConfig.Animation.oldZombieArms() && vanilla;
    }

    @ModifyArg(method = "setupAnim(Lnet/minecraft/world/entity/monster/Monster;FFFFF)V", index = 3, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/model/AnimationUtils;animateZombieArms(Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;ZFF)V"))
    protected float onAnimateAttackZombieArms(float vanilla)
    {
        return MixinConfig.Animation.oldZombieArms() ? 0.0F : vanilla;
    }
}