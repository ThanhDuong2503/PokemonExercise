package de.neuefische.Pokemon.model;

public class Glumanda extends Pokemon{

    @Override
    public void roar() {
        System.out.println("Glumandaaaa");
    }

    public Glumanda(String type, String colour) {
        super(type, colour);
    }

    public static void FireAttack(){
        System.out.println("use FIRE");
    }

}
