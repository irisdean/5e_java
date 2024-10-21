package dnd5e;

import dnd5e.characterclasses.*;
import dnd5e.characterclasses.casters.*;

import java.util.Scanner;

public class CharacterCreator {
    public void creator() {
        Scanner in = new Scanner(System.in);
        int charClass = in.nextInt();

        switch (charClass) {
            case 1 -> createArtificer();
            case 2 -> createBarbarian();
            case 3 -> createBard();
            case 4 -> createCleric();
            case 5 -> createDruid();
            case 6 -> createFighter();
            case 7 -> createMonk();
            case 8 -> createPaladin();
            case 9 -> createRanger();
            case 10 -> createRogue();
            case 11 -> createWarlock();
            case 12 -> createWarrior();
            case 13 -> createWizard();
        }
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