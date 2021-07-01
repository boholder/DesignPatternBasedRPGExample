package behavioral.strategy.character;

import behavioral.strategy.weapon.Weapon;

public abstract class Character {
    private String role;
    protected Weapon weapon;

    public Character(String name) {
        this.role = name;
    }

    /**
     * Equip a weapon and return the instance itself.
     */
    public abstract Character equip(Weapon weapon);

    protected String description(String action) {
        return role + " uses " + this.weapon.getName() + " to " + action + ": ";
    }
}
