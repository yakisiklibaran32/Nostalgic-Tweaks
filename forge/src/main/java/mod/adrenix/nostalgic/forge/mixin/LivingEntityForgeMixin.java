package mod.adrenix.nostalgic.forge.mixin;

import mod.adrenix.nostalgic.util.MixinInjector;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import java.util.function.Consumer;

@Mixin(LivingEntity.class)
public abstract class LivingEntityForgeMixin
{
    /**
     * Separates items from a clumped item entity into multiple item entities when a mob is killed.
     * Controlled by the item merging toggle.
     */
    @ModifyArg(method = "dropFromLootTable", at = @At(value = "INVOKE", target = "Ljava/util/List;forEach(Ljava/util/function/Consumer;)V"))
    protected Consumer<ItemStack> onDropFromLootTable(Consumer<ItemStack> consumer)
    {
        return MixinInjector.Item.explodeStack(consumer);
    }
}