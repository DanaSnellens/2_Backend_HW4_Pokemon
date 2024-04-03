
public class ElectricPokemon extends Pokemon{

    private int knownElecticAtks;
    private String faveElcAttack;


    public ElectricPokemon(String name, int level, int knownElecticAtks,String faveElcAttack) {
        super(name, level);
        this.knownElecticAtks = knownElecticAtks;
        this.faveElcAttack = faveElcAttack;
    }

    @Override
    public void speaks(){
        System.out.println("I'm an electric pokemon");
    }
    @Override
    public void move(){
        System.out.println(getName() + " is fast!");
    }

    public void thunderPunch(){
        System.out.println(getName() + " used Thunder Punch!");
    }
    public void electroBall(){
        System.out.println(getName() + " used ElectroBall!");
    }

    public int getKnownElecticAtks() {
        return knownElecticAtks;
    }

    public void setKnownElecticAtks(int knownElecticAtks) {
        this.knownElecticAtks = knownElecticAtks;
    }

    public String getFaveElcAttack() {
        return faveElcAttack;
    }

    public void setFaveElcAttack(String faveElcAttack) {
        this.faveElcAttack = faveElcAttack;
    }
}
