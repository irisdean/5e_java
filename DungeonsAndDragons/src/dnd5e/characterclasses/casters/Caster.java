package dnd5e.characterclasses.casters;

import dnd5e.Player;

public class Caster extends Player {
    protected int[] getProficiency() {
        return super.proficiencyBonus;
    }

    @Override
    public void levelUp() {}
}