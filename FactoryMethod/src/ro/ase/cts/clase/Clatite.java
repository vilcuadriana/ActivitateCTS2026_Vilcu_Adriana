package ro.ase.cts.clase;

public class Clatite extends Desert {
    public Clatite(float pret, float gramaj, int calorii) {
        super(pret, gramaj, calorii);
    }

    @Override
    public void afisare() {
        StringBuilder sb=new StringBuilder();
        sb.append("Clatitele :").append(super.toString()).append("\n");
        System.out.print(sb.toString());
    }
}
