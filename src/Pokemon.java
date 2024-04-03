public abstract class Pokemon {
    private String name;
    private int level;



    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void eats(){
        System.out.println(getName() + " ate a Poffin!");
    }
    public abstract void speaks();
    public abstract void move();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}