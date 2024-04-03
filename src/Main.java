
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ElectricPokemon pikachu = new ElectricPokemon("Thor", 20, 2,"Thundershock");
        FirePokemon chamander = new FirePokemon("Mander", 17, true, "orange");
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 37, false, 9000);
        GrassPokemon sunkern = new GrassPokemon("Sunny", 9, false, 1.5f);
        WaterIcePokemon dewgong = new WaterIcePokemon("Dew", 64, false, 10000, true);

        pikachu.electroBall();
        chamander.flamewheel();
        squirtle.hydroPump();
        sunkern.grassKnot();
        dewgong.freezeEnemy();

        List<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.add(pikachu);
        pokemonList.add(chamander);
        pokemonList.add(squirtle);
        pokemonList.add(sunkern);
        pokemonList.add(dewgong);

        for (Pokemon p: pokemonList){
            p.eats();
            p.move();
            p.speaks();
        }
    }


}
