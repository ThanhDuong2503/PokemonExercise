package de.neuefische.Pokemon.model;

import java.util.ArrayList;

public class Pokedex {
    private ArrayList<Pokemon> pokedexlist = new ArrayList<Pokemon>();

    public void add(Pokemon pokemon) {
        if(pokedexlist.contains(pokemon)) {
            throw new RuntimeException("Pokemon already exists!");
        }
        else {this.pokedexlist.add(pokemon);
        }
    }
}
