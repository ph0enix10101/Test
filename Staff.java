public class Staff extends Weapon {
    private int intelligence = 20;

    public Staff(String name, int level) {
        super(name, level);
        if (level != 1)
            intelligence += 5 * level; //Intelligence förändras med item level
    }

    public int getIntelligence() {
        return intelligence;
    }

}
