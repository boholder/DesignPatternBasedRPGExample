package behavioral.strategy.weapon;

public abstract class Weapon {
    private final String name;

    public Weapon(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    /**
     * Every weapon can be used at least in these two ways.
     */
    public abstract String beUsedToSplit();

    public abstract String beUsedToCastSpell();
}
