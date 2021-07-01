package structural.decorator.equipment.weapon;

public class SteelSword implements Weapon {
    private final Integer attack = 15;

    @Override
    public String getName() {
        return "Steel Sword";
    }

    @Override
    public Integer getAttack() {
        return attack;
    }
}
