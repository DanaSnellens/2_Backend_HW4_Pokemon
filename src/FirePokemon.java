
public class FirePokemon extends Pokemon{

    private Boolean hasVisibleFlame;
    private String color;

    public FirePokemon(String name, int level, Boolean hasVisibleFlame, String color) {
        super(name, level);
        this.hasVisibleFlame = hasVisibleFlame;
        this.color = color;
    }

    @Override
    public void speaks(){
        System.out.println("I'm an fire pokemon");
    }
    @Override
    public void move(){
        System.out.println(getName() + " is good at burning down stuff");
    }
    public void flamewheel(){
        System.out.println(getName() + " used Flamewheel!");
    }
    public void ember(){
        System.out.println(getName() + " used Ember!");
    }

    public Boolean getHasVisibleFlame() {
        return hasVisibleFlame;
    }

    public void setHasVisibleFlame(Boolean hasVisibleFlame) {
        this.hasVisibleFlame = hasVisibleFlame;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
