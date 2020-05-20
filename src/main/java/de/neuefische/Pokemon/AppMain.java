package de.neuefische.Pokemon;

import de.neuefische.Pokemon.model.Glumanda;
import de.neuefische.Pokemon.model.Pikachu;

import java.util.ArrayList;

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

        System.out.print('\n'+"---------------------------------------"+'\n');

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

        System.out.print(pikachulist.get(2));

        for(int i=0; i<pikachulist.size();i++){
            System.out.print(pikachulist.get(i));
        }

        ArrayList<Glumanda> glumandalist = new ArrayList<Glumanda>();
        glumandalist.add(new Glumanda("Fire", "cyan"));
        glumandalist.add(new Glumanda("Fire", "magenta"));
        glumandalist.add(new Glumanda("Fire", "yellow"));

        System.out.print(glumandalist.get(1));

        for (Glumanda glumanda : glumandalist){
            System.out.print(glumanda);
        }
    }
}