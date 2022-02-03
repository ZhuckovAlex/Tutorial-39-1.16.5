package net.project.project.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class MagicSword extends SwordItem {

    public MagicSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // Here we can add effects on hit with this weapon to the target
        attacker.addPotionEffect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 6000));
        target.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, 2000, 1));
        target.addPotionEffect(new EffectInstance(Effects.POISON, 2000, 2));
        return super.hitEntity(stack, target, attacker);
    }
}