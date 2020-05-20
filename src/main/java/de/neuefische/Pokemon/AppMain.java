package de.neuefische.Pokemon;

import de.neuefische.Pokemon.model.Glumanda;
import de.neuefische.Pokemon.model.Pikachu;

public class AppMain {
    public static void main(String[] args) {

        Pikachu pika = new Pikachu("Elektro", "yellow" );
        Glumanda glu = new Glumanda("Fire", "red");

        System.out.print(pika);
        pika.goInsidePokeball();
        pika.comeOutOfPokeball();
        pika.ThunderAttack();

        System.out.print(glu);
        glu.goInsidePokeball();
        glu.comeOutOfPokeball();
        glu.FireAttack();


    }
}