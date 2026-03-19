package ro.ase.cts.clase;

public class SupaCiuperci extends Supa {

    public SupaCiuperci(float pret, float gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afisare() {
        StringBuilder sb=new StringBuilder();
        sb.append("Supa Ciuperci ").append(super.toString()).append("\n");
        System.out.print(sb.toString());
    }
}
