package dnd5e.characterclasses;


import dnd5e.Player;

public class Wizard  extends Player {
    int classLevel = 0;
    final double casterType = 1;

    private final int[] firstLevelSlots;
    private final int[] secondLevelSlots;
    private final int[] thirdLevelSlots;
    private final int[] fourthLevelSlots;
    private final int[] fifthLevelSlots;
    private final int[] sixthLevelSlots;
    private final int[] seventhLevelSlots;
    private final int[] eighthLevelSlots;
    private final int[] ninthLevelSlots;
    private final int[] proficiencyBonus = super.proficiencyBonus;
    private int[] currentSlots = new int[9];

    /**
     * The constructor for a Wizard
     */
    public Wizard() {
        firstLevelSlots = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        secondLevelSlots = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        thirdLevelSlots = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        fourthLevelSlots = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        fifthLevelSlots = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        sixthLevelSlots = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        seventhLevelSlots = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        eighthLevelSlots = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ninthLevelSlots = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }
    @Override
    public void levelUp() {
        classLevel++;
        setCurrentSlots();
    }

    private void setCurrentSlots() {
        int slotsIndex = classLevel - 1;
        currentSlots[1] = firstLevelSlots[slotsIndex];
        currentSlots[2] = secondLevelSlots[slotsIndex];
        currentSlots[3] = thirdLevelSlots[slotsIndex];
        currentSlots[4] = fourthLevelSlots[slotsIndex];
        currentSlots[5] = fifthLevelSlots[slotsIndex];
        currentSlots[6] = sixthLevelSlots[slotsIndex];
        currentSlots[7] = seventhLevelSlots[slotsIndex];
        currentSlots[8] = eighthLevelSlots[slotsIndex];
        currentSlots[9] = ninthLevelSlots[slotsIndex];
    }
}
