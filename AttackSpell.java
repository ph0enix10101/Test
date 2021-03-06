public class AttackSpell extends Spell{
    private String damageType;
    private int defaultDamage;

    public AttackSpell(String name, int cost, int levelReq, String damageType,int defaultDamage) {
        super(name,cost,levelReq);
        this.damageType = damageType;
        this.defaultDamage = defaultDamage;
    }

    public String getDamageType(){
        return damageType;
    }

    public int getDefaultDamage(){
        return defaultDamage;
    }

    public int getModifiedDamage(int intelligence){
        return defaultDamage + intelligence;
    }
}
