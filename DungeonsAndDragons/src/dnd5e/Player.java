package dnd5e;

public abstract class Player implements Character{
    private String name;
    private int hitPoints;
    private int totalLevel;
    private String alignment;
    private String background;
    private final int numStats = 6;
    protected static final int numLevels = 20;
    private int[] statArray = new int[numStats];
    protected final int[] proficiencyBonus = {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6};

    public int attack() {
        return 0;
    }
    public int defend() {
        return 0;
    }
}
