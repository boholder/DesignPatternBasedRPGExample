package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class CharacterLevelUpSubject extends Observable implements Observer {
    private Integer accumulatedExp;
    private final Integer levelUpRequiredExp;
    private final String characterName;

    public CharacterLevelUpSubject(String characterName, int levelUpRequiredExp) {
        this.characterName = characterName;
        this.levelUpRequiredExp = levelUpRequiredExp;
        this.accumulatedExp = 0;
    }

    @Override
    public void update(Observable o, Object arg) {
        // Just write in a standard way, we don't need to determine which subject sent the message.
        if (o instanceof ExperiencePointGainSubject) {
            gainExp((Integer) arg);
        }
    }

    private void gainExp(Integer arg) {
        accumulatedExp += arg;
        System.out.println(characterName + " gains " + arg + " exp.");
        if (isLevelUpHappen()) {
            prepareLevelUp();
        }
        // When super.changed is false, it won't trigger the notice process.
        notifyObservers();
    }

    private void prepareLevelUp() {
        accumulatedExp -= levelUpRequiredExp;
        setChanged();
    }

    private boolean isLevelUpHappen() {
        return accumulatedExp >= levelUpRequiredExp;
    }
}
