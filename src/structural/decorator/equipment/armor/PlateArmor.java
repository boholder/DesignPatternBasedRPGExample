package structural.decorator.equipment.armor;

public class PlateArmor implements Armor {
    private final Integer defence = 30;

    @Override
    public String getName() {
        return "Plate Armor";
    }

    @Override
    public Integer getDefence() {
        return defence;
    }
}
