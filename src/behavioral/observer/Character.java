package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Character implements Observer {
    private String name;
    private int level;

    public Character(String name) {
        this.name = name;
        this.level = 1;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof CharacterLevelUpSubject) {
            // As CharacterLevelUpSubject only passed a null as "arg" to here.
            level += 1;
            System.out.println(name + " level up to Lv." + level);
        }
    }
}
