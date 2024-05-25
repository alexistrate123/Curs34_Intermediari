package Curs34_Tema_Ex2;

public class Main {
    public static void main(String[] args) {
        Trainer ash = new Trainer("Ash");

        Pokemon pikachu = new Pokemon("Pikachu");
        Pokemon bulbasaur = new Pokemon("Bulbasaur");
        Pokemon charmander = new Pokemon("Charmander");
        Pokemon squirtle = new Pokemon("Squirtle");
        Pokemon jigglypuff = new Pokemon("Jigglypuff");

        ash.addPokemonToCollection(pikachu);
        ash.addPokemonToCollection(bulbasaur);
        ash.addPokemonToCollection(charmander);
        ash.addPokemonToCollection(squirtle);
        ash.addPokemonToCollection(jigglypuff);

        ash.releaseAllPokemons();
    }
}

