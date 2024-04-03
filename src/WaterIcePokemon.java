
public class WaterIcePokemon extends WaterPokemon {
    private boolean iceMain;


    public WaterIcePokemon(String name, int level, boolean evolvesWithWaterstone, int capacity, boolean iceMain) {
        super(name, level, evolvesWithWaterstone, capacity);
        this.iceMain = iceMain;
    }

    @Override
    public void speaks() {
        if (iceMain) {
            System.out.println("I'm a Ice-Water Pokemon");
        } else {
            System.out.println("I'm a Water-Ice Pokemon");
        }
    }
    public void freezeEnemy () {
        System.out.println(getName() + " freezes their Enemy!");
    }

}
