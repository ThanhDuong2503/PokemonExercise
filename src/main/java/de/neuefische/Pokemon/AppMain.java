package de.neuefische.Pokemon;

import de.neuefische.Pokemon.model.Glumanda;
import de.neuefische.Pokemon.model.Pikachu;

public class AppMain {
    public static void main(String[] args) {

        Pikachu pika = new Pikachu();
        Glumanda glu = new Glumanda();

        pika.goInsidePokeball();
        pika.comeOutOfPokeball();
        pika.ThunderAttack();

        glu.goInsidePokeball();
        glu.comeOutOfPokeball();
        glu.FireAttack();

    }
}