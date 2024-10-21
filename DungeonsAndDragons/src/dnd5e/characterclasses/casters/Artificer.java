package dnd5e.characterclasses.casters;


public class Artificer extends Caster {
    int classLevel = 0;
    private final int[] infusionsKnown = {0, 4, 4, 4, 4, 6, 6, 6, 6, 8, 8, 8, 8, 10, 10, 10, 10, 12, 12, 12};

    private final int[] firstLevelSlots;
    private final int[] secondLevelSlots;
    private final int[] thirdLevelSlots;
    private final int[] fourthLevelSlots;
    private final int[] fifthLevelSlots;
    private final int[] sixthLevelSlots;
    private final int[] seventhLevelSlots;
    private final int[] eighthLevelSlots;
    private final int[] ninthLevelSlots;
    private final int[] proficiencyBonus = super.getProficiency();
    private int[] currentSlots = new int[9];

    /**
     * The constructor for an Artificer
     */
    public Artificer() {
        firstLevelSlots = new int[]{2, 2, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        secondLevelSlots = new int[]{0, 0, 0, 0, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        thirdLevelSlots = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        fourthLevelSlots = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 3, 3};
        fifthLevelSlots = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2};
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