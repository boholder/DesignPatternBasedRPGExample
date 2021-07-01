package structural.decorator.enchant.weapon;

import structural.decorator.equipment.Equipment;
import structural.decorator.equipment.weapon.Weapon;

public class BlazeFlameEnchant implements WeaponEnchantDecorator {
    private final Weapon weapon;
    private final Integer additionalAttack = 20;

    public BlazeFlameEnchant(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public Equipment getInnerEquipment() {
        return weapon;
    }

    @Override
    public String getName() {
        return "Blaze Flame " + weapon.getName();
    }

    @Override
    public Integer getAttack() {
        return additionalAttack + weapon.getAttack();
    }
}
