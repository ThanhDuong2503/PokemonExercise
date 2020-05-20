package de.neuefische.Pokemon.model;

import java.util.Objects;

public abstract class Pokemon {

    public abstract void roar();


    public static void goInsidePokeball() {
        System.out.println("Pokemon is inside Pokeball");
    }

    public static void comeOutOfPokeball() {
        System.out.println("Pokemon comes out");
    }

    private String type;
    private String colour;

    public Pokemon(String type, String colour) {
        this.type = type;
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(type, pokemon.type) &&
                Objects.equals(colour, pokemon.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, colour);
    }

    @Override
    public String toString() {
        return '\n' + "Pokemon: " +
                "type: " + type +
                ", colour: " + colour + '\n';
    }

}


