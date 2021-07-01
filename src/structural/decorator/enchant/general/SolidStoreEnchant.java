package structural.decorator.enchant.general;

import structural.decorator.enchant.armor.ArmorEnchantDecorator;
import structural.decorator.enchant.weapon.WeaponEnchantDecorator;
import structural.decorator.equipment.Equipment;
import structural.decorator.equipment.armor.Armor;
import structural.decorator.equipment.weapon.Weapon;

/**
 * This enchantment can be applied on both weapon type and armor type equipment.
 */
public class SolidStoreEnchant implements WeaponEnchantDecorator, ArmorEnchantDecorator {
    private final Equipment equipment;

    private final Integer additionalAttack = 10;
    private final Integer additionalDefence = 20;

    public SolidStoreEnchant(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public Equipment getInnerEquipment() {
        return equipment;
    }

    @Override
    public String getName() {
        return "Solid Store " + equipment.getName();
    }

    @Override
    public Integer getDefence() {
        if (equipment instanceof Armor) {
            return additionalDefence + ((Armor) equipment).getDefence();
        } else {
            return 0;
        }
    }

    @Override
    public Integer getAttack() {
        if (equipment instanceof Weapon) {
            return additionalAttack + ((Weapon) equipment).getAttack();
        } else {
            return 0;
        }
    }
}
