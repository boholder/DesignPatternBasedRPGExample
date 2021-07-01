package behavioral.observer;

import java.util.Observable;

/**
 * A Subject that notices CharacterLevelUpSubjects to add experience points on themself.
 * <p>
 * Note that JDK gives us java.util.Observable instead of an interface
 * for writing observer pattern's subject part.
 * (java.util.Observer is an interface.)
 * So... if we want our classes inherit from our own parent class,
 * we have to re-write that part.
 */
public class ExperiencePointGainSubject extends Observable {
    public void winBattle(Integer exp) {
        System.out.println("They won a battle!");
        setChanged();
        notifyObservers(exp);
    }
}
