package behavioral.strategy.character;

import behavioral.strategy.weapon.Weapon;

public class Warrior extends Character {
    public Warrior() {
        super("Warrior");
    }

    @Override
    public Warrior equip(Weapon weapon) {
        super.weapon = weapon;
        return this;
    }

    public void split() {
        System.out.println(description("split") + this.weapon.beUsedToSplit());
    }
}
