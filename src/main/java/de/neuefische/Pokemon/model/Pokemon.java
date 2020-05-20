package de.neuefische.Pokemon.model;

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
    public String toString() {
        return '\n' + "Pokemon: " +
                "type: " + type +
                ", colour: " + colour + '\n';
    }

}


