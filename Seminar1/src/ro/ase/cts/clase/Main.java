package ro.ase.cts.clase;
import ro.ase.cts.animale.FoodType;
import ro.ase.cts.animale.Lion;
import ro.ase.cts.animale.Maimuta;
import ro.ase.cts.animale.Zebra;
import ro.ase.cts.main.Zoo;
import ro.ase.cts.main.ZooKeeper;

public class Main{
    public static void main(String[] args) {
        Zoo zoo=new Zoo("Zoo Baneasa",new ZooKeeper("Ionescu"));
        Lion lion=new Lion("Lion",5, FoodType.MEAT,65);
        zoo.addAnimal(lion);
        zoo.addAnimal(new Zebra("Zebra",4,FoodType.GRASS,150));
        zoo.addAnimal(new Maimuta("Marcel",4,FoodType.BANANE));
        zoo.feedAllAnimals();

    }

}