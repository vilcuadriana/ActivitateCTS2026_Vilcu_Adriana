package ro.ase.cts.clase.Spital;

public class Medicament {
    private String nume;
    private float pret;

    public Medicament(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }

    public void achizitioneazaMedicament()
    {
        if(prezintaReteta())
        {
            System.out.println("Medicamentul "+this.nume+" a fost achizitionat la pretul de "+this.pret);
        }
        else
        {
            System.out.println("Clientul nu a prezentat reteta");
        }

    }
    public boolean prezintaReteta()
    {
       return !(this.nume.length()<=10);
    }

}
