package de.neuefische.Pokemon.model;

public class Pikachu extends Pokemon{


    @Override
    public void roar() {
        System.out.print("Pikachuuuu");
    }

    public Pikachu(String type, String colour) {
        super(type, colour);
    }

    public static void ThunderAttack(){
        System.out.println("use THUNDER");
    }



}
