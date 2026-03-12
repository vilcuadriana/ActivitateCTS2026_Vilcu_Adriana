package ro.ase.cts.clase;

public class Troleibuz extends MijlocTransport {
    public Troleibuz(int numarRoti, String NrInmatriculare) {
        super(numarRoti, NrInmatriculare);
    }
    @Override
    public void afisareDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("Troleibuzul are un nr. de roti: ").append(super.numarRoti);
        builder.append("Nr. Inmatriculare: ").append(super.numarInmatriculare);
        System.out.println(builder.toString());

    }
}
