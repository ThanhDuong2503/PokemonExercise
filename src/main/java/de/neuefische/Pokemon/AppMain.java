package de.neuefische.Pokemon;

import de.neuefische.Pokemon.model.*;

import java.util.ArrayList;
import java.util.Optional;

public class AppMain {
    public static void main(String[] args) {

        Pikachu pika = new Pikachu("Electro", "yellow" );
        Glumanda glu = new Glumanda("Fire", "red");

        System.out.println(pika);
        pika.goInsidePokeball();
        pika.comeOutOfPokeball();
        pika.ThunderAttack();
        pika.roar();


        System.out.println(glu);
        glu.goInsidePokeball();
        glu.comeOutOfPokeball();
        glu.FireAttack();
        glu.roar();

        System.out.println('\n'+"---------------------------------------"+'\n');


        //ArrayList <String> pokemonList = new ArrayList<String>();
        //pokemonList.add("Pikachu");
        //pokemonList.add("Glumanda");
        //pokemonList.add("Shiggy");

        //System.out.print(pokemonList);
        //System.out.print(pokemonList.contains("Shiggy"));

        // String[] pokemonArray= new String[5];
        // pokemonArray[0]="Pikachu";
        // pokemonArray[1]="Glumanda";
        // pokemonArray[2]="Shiggy";
        // pokemonArray[3]="Onyx";
        // pokemonArray[4]="Mewtwo";

        ArrayList<Pikachu> pikachulist = new ArrayList<Pikachu>();
        pikachulist.add(new Pikachu("Electro", "orange"));
        pikachulist.add(new Pikachu("Electro", "red"));
        pikachulist.add(new Pikachu("Electro", "black"));
        pikachulist.add(new Pikachu("Electro", "white"));
        pikachulist.add(new Pikachu("Electro", "blue"));


        pikachulist.remove(new Pikachu("Electro", "white"));

        System.out.println(pikachulist.get(2));

        for(int i=0; i<pikachulist.size();i++){
            System.out.println(pikachulist.get(i));
        }

        System.out.println('\n'+"---------------------------------------"+'\n');

        ArrayList<Glumanda> glumandalist = new ArrayList<Glumanda>();
        glumandalist.add(new Glumanda("Fire", "cyan"));
        glumandalist.add(new Glumanda("Fire", "magenta"));
        glumandalist.add(new Glumanda("Fire", "yellow"));

        for (Glumanda glumanda : glumandalist){
            System.out.println(glumanda);
        }

        try {
            Pokedex dex = new Pokedex();
            dex.add(new Glumanda("Fire", "cyan"));
            dex.add(new Pikachu("Electro", "yellow"));
            dex.add(new Glumanda("Fire", "cyan"));

            dex.printlist();
        }
            catch (RuntimeException e) {
            System.out.print(e);
        }


        System.out.println('\n'+"---------------------------------------"+'\n');

        Glurak glurak = new Glurak("Fire", "orange");
        System.out.println(glurak);
        glurak.roar();
        glurak.superFireAttack();
    }
}