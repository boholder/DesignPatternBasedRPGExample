package structural.decorator.enchant;

import structural.decorator.equipment.Equipment;

public interface EnchantDecorator extends Equipment {
    Equipment getInnerEquipment();
}
