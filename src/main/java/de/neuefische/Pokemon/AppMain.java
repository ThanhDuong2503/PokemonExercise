package de.neuefische.Pokemon;

import de.neuefische.Pokemon.model.Glumanda;
import de.neuefische.Pokemon.model.Pikachu;
import de.neuefische.Pokemon.model.Pokemon;

public class AppMain {
    public static void main(String[] args) {

        Pikachu pika = new Pikachu("Electro", "yellow" );
        Glumanda glu = new Glumanda("Fire", "red");

        System.out.print(pika);
        pika.goInsidePokeball();
        pika.comeOutOfPokeball();
        pika.ThunderAttack();
        pika.roar();


        System.out.print(glu);
        glu.goInsidePokeball();
        glu.comeOutOfPokeball();
        glu.FireAttack();
        glu.roar();


    }
}