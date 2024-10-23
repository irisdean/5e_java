package dnd5e;

import dnd5e.characterclasses.*;

import java.util.Scanner;

public class CharacterCreator {
    private final Scanner in;
    public CharacterCreator(Scanner in) {
        this.in = in;
    }

    public Player creator() {
        int charClass = in.nextInt();
        Player pc;

        switch (charClass) {
            case 1  -> pc = createArtificer();
            case 2  -> pc = createBarbarian();
            case 3  -> pc = createBard();
            case 4  -> pc = createCleric();
            case 5  -> pc = createDruid();
            case 6  -> pc = createFighter();
            case 7  -> pc = createMonk();
            case 8  -> pc = createPaladin();
            case 9  -> pc = createRanger();
            case 10 -> pc = createRogue();
            case 11 -> pc = createWarlock();
            case 12 -> pc = createWarrior();
            case 13 -> pc = createWizard();
            default -> pc = null;
        }
        return pc;
    }
    private Artificer createArtificer() {
        Artificer playerArtificer = new Artificer();
        return playerArtificer;
    }

    private Barbarian createBarbarian() {
        Barbarian playerBarbarian = new Barbarian();
        return playerBarbarian;
    }

    private Bard createBard() {
        Bard playerBard = new Bard();
        return playerBard;
    }

    private Cleric createCleric() {
        Cleric playerCleric = new Cleric();
        return playerCleric;
    }

    private Druid createDruid() {
        Druid playerDruid = new Druid();
        return playerDruid;
    }

    private Fighter createFighter() {
        Fighter playerFighter = new Fighter();
        return playerFighter;
    }

    private Monk createMonk() {
        Monk playerMonk = new Monk();
        return playerMonk;
    }

    private Paladin createPaladin() {
        Paladin playerPaladin = new Paladin();
        return playerPaladin;
    }

    private Ranger createRanger() {
        Ranger playerRanger = new Ranger();
        return playerRanger;
    }

    private Rogue createRogue() {
        Rogue playerRogue = new Rogue();
        return playerRogue;
    }

    private Warlock createWarlock() {
        Warlock playerWarlock = new Warlock();
        return playerWarlock;
    }

    private Warrior createWarrior() {
        Warrior playerWarrior = new Warrior();
        return playerWarrior;
    }

    private Wizard createWizard() {
        Wizard playerWizard = new Wizard();
        return playerWizard;
    }
}