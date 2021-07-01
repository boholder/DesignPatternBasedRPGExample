package structural.decorator.enchant.weapon;

import structural.decorator.equipment.Equipment;
import structural.decorator.equipment.weapon.Weapon;

/**
 * This enchantment can only be created by EnchantCombiner.
 * When a weapon's decoration chain contains both BlazeFlameEnchant and SolidStoreEnchant,
 * EnchantCombiner removes one BlazeFlameEnchant and one SolidStoreEnchant from the chain,
 * and add one EruptionVolcanoEnchant into the chain.
 */
public class EruptionVolcanoEnchant implements WeaponEnchantDecorator {
    private final Weapon weapon;
    private final Integer additionalAttack = 50;


    public EruptionVolcanoEnchant(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public Equipment getInnerEquipment() {
        return weapon;
    }

    @Override
    public String getName() {
        return "Eruption Volcano " + weapon.getName();
    }

    @Override
    public Integer getAttack() {
        return additionalAttack + weapon.getAttack();
    }
}
