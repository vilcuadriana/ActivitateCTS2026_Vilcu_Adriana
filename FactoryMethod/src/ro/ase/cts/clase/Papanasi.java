package ro.ase.cts.clase;

public class Papanasi extends Desert{

    public Papanasi(float pret, float gramaj, int calorii) {
        super(pret, gramaj, calorii);
    }

    @Override
    public void afisare() {
        StringBuilder sb=new StringBuilder();
        sb.append("Papanasii :").append(super.toString()).append("\n");
        System.out.print(sb.toString());
    }
}
