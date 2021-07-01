package behavioral.strategy.character;

import behavioral.strategy.weapon.Weapon;

public class Mage extends Character {
    public Mage() {
        super("Mage");
    }

    @Override
    public Mage equip(Weapon weapon) {
        super.weapon = weapon;
        return this;
    }

    public void castSpell() {
        System.out.println(super.description("cast a spell") + this.weapon.beUsedToCastSpell());
    }
}
