package behavioral.strategy.weapon;

public class Sword extends Weapon {

    public Sword() {
        super("sword");
    }

    @Override
    public String beUsedToSplit() {
        return "Swish!";
    }

    @Override
    public String beUsedToCastSpell() {
        return "... nothing happened.";
    }
}
