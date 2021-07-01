package behavioral.strategy;

import behavioral.strategy.character.Mage;
import behavioral.strategy.character.Warrior;
import behavioral.strategy.weapon.Staff;
import behavioral.strategy.weapon.Sword;

public class CharactersUseWeapons {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.equip(new Sword()).split();
        warrior.equip(new Staff()).split();

        Mage mage = new Mage();
        mage.equip(new Sword()).castSpell();
        mage.equip(new Staff()).castSpell();

        //Warrior uses sword to split: Swish!
        //Warrior uses staff to split: Woo!
        //Mage uses sword to cast a spell: ... nothing happened.
        //Mage uses staff to cast a spell: Biu!
    }
}

