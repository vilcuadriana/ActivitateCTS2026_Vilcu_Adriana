package ro.ase.cts.clase;

public abstract class MijlocTransport {
    protected int numarRoti;
    protected String numarInmatriculare;

    public MijlocTransport(int numarRoti, String numarInmatriculare) {
        this.numarRoti = numarRoti;
        this.numarInmatriculare = numarInmatriculare;
    }

    public abstract void afisareDescriere();


    public static class Autobuz extends MijlocTransport {
        public Autobuz(int numarRoti, String numarInmatriculare)
        {
            super(numarRoti, numarInmatriculare);
        }

        @Override
        public void afisareDescriere() {
            StringBuilder builder = new StringBuilder();
            builder.append("Atutobuzul are un nr. de roti: ").append(super.numarRoti);
            builder.append("\n Nr. Inmatriculare: ").append(super.numarInmatriculare);
            System.out.println(builder.toString());
        }
    }
}
