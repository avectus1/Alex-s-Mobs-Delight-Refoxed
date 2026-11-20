package dev.arakiel.alexsmobsdelight.init;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;

/**
 * Small bridge for Alex's Mobs registry objects.
 *
 * <p>Alex's Mobs only exposes plain {@code Supplier}s, and 1.21 stores a {@code Holder} on
 * {@code MobEffectInstance}, so effects are looked up as holders here.</p>
 *
 * <p>1.21 serialises that holder through {@code Registry#holderByNameCodec}, which only accepts a real
 * {@code Holder.Reference}. An Architectury {@code RegistrySupplier} is a {@code Holder} but not a
 * reference, so storing one on an effect instance crashes when the entity is saved
 * ("Unregistered holder in ... / minecraft:mob_effect"). Both helpers therefore return the registry
 * reference instead.</p>
 */
public final class AMDHolders {
    private AMDHolders() {
    }

    public static Holder<MobEffect> effect(MobEffect effect) {
        return BuiltInRegistries.MOB_EFFECT.wrapAsHolder(effect);
    }

    /**
     * Resolves one of Alex's Mobs' effects by its registry name, e.g. {@code amEffect("fear")}.
     *
     * <p>Looked up by name instead of through {@code AMEffectRegistry}'s fields, because the
     * 1.21.1 ports of Alex's Mobs declare those fields with different types (Alex's Mobs Neo uses
     * {@code Holder}, the Unofficial Port uses {@code DeferredHolder}). Linking against either
     * type crashes on the other port with a {@code NoSuchFieldError}; the registry name is the
     * same in both.</p>
     */
    public static Holder<MobEffect> amEffect(String name) {
        return BuiltInRegistries.MOB_EFFECT.getHolderOrThrow(ResourceKey.create(Registries.MOB_EFFECT,
                ResourceLocation.fromNamespaceAndPath("alexsmobs", name)));
    }

    /** Resolves the registry reference of one of our own deferred effects. */
    public static Holder<MobEffect> effect(RegistrySupplier<MobEffect> effect) {
        return BuiltInRegistries.MOB_EFFECT.getHolderOrThrow(
                ResourceKey.create(Registries.MOB_EFFECT, effect.getId()));
    }
}
