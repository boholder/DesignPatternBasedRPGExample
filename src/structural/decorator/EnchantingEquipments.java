package structural.decorator;

import structural.decorator.enchant.general.SolidStoreEnchant;
import structural.decorator.enchant.weapon.BlazeFlameEnchant;
import structural.decorator.equipment.armor.Armor;
import structural.decorator.equipment.armor.PlateArmor;
import structural.decorator.equipment.weapon.SteelSword;
import structural.decorator.equipment.weapon.Weapon;

public class EnchantingEquipments {
    public static void main(String[] args) {
        Weapon originWeapon = new SteelSword();
        System.out.println("originWeapon name: " + originWeapon.getName());
        System.out.println("originWeapon attack: " + originWeapon.getAttack());
        Weapon enchantWeapon = new BlazeFlameEnchant(originWeapon);
        System.out.println("enchantWeapon name: " + enchantWeapon.getName());
        System.out.println("enchantWeapon attack: " + enchantWeapon.getAttack());
        Weapon duelEnchantWeapon = new SolidStoreEnchant(enchantWeapon);
        System.out.println("duelEnchantWeapon name: " + duelEnchantWeapon.getName());
        System.out.println("duelEnchantWeapon attack: " + duelEnchantWeapon.getAttack());

        Armor originArmor = new PlateArmor();
        System.out.println("originArmor name: " + originArmor.getName());
        System.out.println("originArmor defence: " + originArmor.getDefence());
        Armor enchantArmor = new SolidStoreEnchant(originArmor);
        System.out.println("enchantArmor name: " + enchantArmor.getName());
        System.out.println("enchantArmor defence: " + enchantArmor.getDefence());

        //originWeapon name: Steel Sword
        //originWeapon attack: 15
        //enchantWeapon name: Blaze Flame Steel Sword
        //enchantWeapon attack: 35
        //duelEnchantWeapon name: Solid Store Blaze Flame Steel Sword
        //duelEnchantWeapon attack: 45
        //originArmor name: Plate Armor
        //originArmor defence: 30
        //enchantArmor name: Solid Store Plate Armor
        //enchantArmor defence: 50
    }
}
