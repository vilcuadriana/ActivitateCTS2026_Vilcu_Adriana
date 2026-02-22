package ro.ase.cts.animale;

public class Zebra extends Animal {
    private int lineNr;

    public Zebra(String name, int age, FoodType foodType, int lineNr) {
        super(name, age, foodType);
        this.lineNr = lineNr;
    }

    @Override
    public void eat(String zooKeeperName) {
        System.out.println("Zookeperul: "+zooKeeperName+"i-a dat sa manance leului: "+super.name+ " " +super.foodType);

    }
}
