package ro.ase.cts.clase;

public class Tramvai  extends MijlocTransport {
    public Tramvai(int numarRoti, String NrInmatriculare) {
        super(numarRoti, NrInmatriculare);
    }
    @Override
    public void afisareDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tramvaiul are un nr. de roti: ").append(super.numarRoti);
        builder.append("Nr. Inmatriculare: ").append(super.numarInmatriculare);
        System.out.println(builder.toString());

    }
}
