package Curs34_Tema_Ex2;

import java.util.ArrayList;

public class Trainer {
     String name;
     ArrayList<Pokemon> pokemons = new ArrayList<>();

    public Trainer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                '}';
    }

    public void addPokemonToCollection(Pokemon pokemon) {
       // pokemons.add(pokemon);
       // System.out.println(pokemon + " was added to " + name + "'s collection.");
        //pokemon.sayHello();
        this.pokemons.add(pokemon);
    }

    public void releaseAllPokemons() {
       // System.out.println(name + " is releasing all pokemons.");
        for (Pokemon pokemon : pokemons) {
            pokemon.sayHello();
        }
       // pokemons.clear();
    }
}
