
public class GrassPokemon extends Pokemon{
    private Boolean hasFlower;
    private float weight;

    public GrassPokemon(String name, int level, Boolean hasFlower, float weight) {
        super(name, level);
        this.hasFlower = hasFlower;
        this.weight = weight;
    }

    @Override
    public void speaks(){
        System.out.println(getName() + " is a grass pokemon");
    }
    @Override
    public void move(){
        System.out.println(getName() + " is good at climbing");
    }
    public void grassKnot(){
        System.out.println(getName() + " used Grassknot!");
    }
    public void leafstorm(){
        System.out.println(getName() + " used Leafstrom!");
    }

    public Boolean getHasFlower() {
        return hasFlower;
    }

    public void setHasFlower(Boolean hasFlower) {
        this.hasFlower = hasFlower;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
