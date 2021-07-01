package behavioral.observer;

public class CharactersFightingInTheDungeon {
    public static void main(String[] args) {
        // prepare
        Character alice = new Character("Alice");
        Character bob = new Character("Bob");

        CharacterLevelUpSubject aliceExp =
                new CharacterLevelUpSubject("Alice", 100);
        aliceExp.addObserver(alice);
        CharacterLevelUpSubject bobExp =
                new CharacterLevelUpSubject("Bob", 150);
        bobExp.addObserver(bob);

        ExperiencePointGainSubject expGainSubject = new ExperiencePointGainSubject();
        expGainSubject.addObserver(aliceExp);
        expGainSubject.addObserver(bobExp);

        // begin adventure
        expGainSubject.winBattle(50);
        expGainSubject.winBattle(50);
        expGainSubject.winBattle(100);

        //They won a battle!
        //Bob gains 50 exp.
        //Alice gains 50 exp.
        //They won a battle!
        //Bob gains 50 exp.
        //Alice gains 50 exp.
        //Alice level up to Lv.2
        //They won a battle!
        //Bob gains 100 exp.
        //Bob level up to Lv.2
        //Alice gains 100 exp.
        //Alice level up to Lv.3

        // Notice that we added aliceExp first,
        // but bobExp always gains message ahead,
        // here this the reason in source code of java.util.Observable:
        //         for (int i = arrLocal.length-1; i>=0; i--)
        //            ((Observer)arrLocal[i]).update(this, arg);
    }
}
