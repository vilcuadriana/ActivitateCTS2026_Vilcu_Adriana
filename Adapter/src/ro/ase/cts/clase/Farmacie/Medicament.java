package ro.ase.cts.clase.Farmacie;

public class Medicament {
    String nume;

    public Medicament(String nume) {
        this.nume = nume;
    }

    public void cumparaMedicament()
    {
        System.out.println("Medicament cumparat este  "+this.nume);
    }
}
