public class WaterPokemon extends Pokemon {

    private boolean evolvesWithWaterstone;
    private int capacity;

    public WaterPokemon(String name, int level, boolean evolvesWithWaterstone, int capacity) {
        super(name, level);
        this.evolvesWithWaterstone = evolvesWithWaterstone;
        this.capacity = capacity;
    }


    @Override
    public void speaks(){
        System.out.println("I'm an water pokemon");
    }
    @Override
    public void move(){
        System.out.println(getName() + " is good at swimming");
    }
    public void iceBeam(){
        System.out.println(getName() + " used Ice Beam!");
    }
    public void hydroPump(){
        System.out.println(getName() + " used Hydro Pump!");
    }

    public boolean isEvolvesWithWaterstone() {
        return evolvesWithWaterstone;
    }

    public void setEvolvesWithWaterstone(boolean evolvesWithWaterstone) {
        this.evolvesWithWaterstone = evolvesWithWaterstone;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}