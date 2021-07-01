package behavioral.strategy.weapon;

public class Staff extends Weapon {
    public Staff() {
        super("staff");
    }

    @Override
    public String beUsedToSplit() {
        return "Woo!";
    }

    @Override
    public String beUsedToCastSpell() {
        return "Biu!";
    }
}
