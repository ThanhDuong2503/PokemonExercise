package de.neuefische.Pokemon.model;

public class Glurak extends Glumanda{
    public Glurak(String type, String colour) {
        super(type, colour);
    }

    @Override
    public void roar() {
        System.out.println("Gluraaaaaak");
    }
    public static void superFireAttack(){
        System.out.print("use Fireblast");
    }
}
