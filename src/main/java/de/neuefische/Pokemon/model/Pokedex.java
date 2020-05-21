package de.neuefische.Pokemon.model;

import java.util.ArrayList;

public class Pokedex {
    private ArrayList<Pokemon> pokedexlist = new ArrayList<Pokemon>();

    public void add(Pokemon pokemonId) {
        if(pokedexlist.contains(pokemonId)) {
            throw new RuntimeException("Pokemon already exists");
        }
        else {pokedexlist.add(pokemonId);
        }
    }

    public void printlist(){
        System.out.print("Pokedex: "+ '\n'+ pokedexlist + '\n');
    }


}
