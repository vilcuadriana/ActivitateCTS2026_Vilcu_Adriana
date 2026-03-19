package ro.ase.cts.clase;

public class SupaLegume extends Supa {

    public SupaLegume(float pret, float gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afisare() {
        StringBuilder sb=new StringBuilder();
        sb.append("Supa Legume ").append(super.toString()).append("\n");
        System.out.print(sb.toString());
    }
}
