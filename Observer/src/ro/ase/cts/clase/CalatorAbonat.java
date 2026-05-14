package ro.ase.cts.clase;

import java.util.Observer;

public class CalatorAbonat implements Calator {
    String nume;
    private float sold;

    public void platesteBilet(float pret)
    {
        if(this.sold>pret) {
            System.out.println(this.nume + " " + " plateste " + pret + " pentru o calatorie");
            sold-=pret;
        }
        else
        {
            System.out.println("Sold insuficient. Mergeti pe jos ca face piciorul frumos");
        }

    }

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public CalatorAbonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificare(String NrLinie) {
        System.out.println(this.nume+" " +NrLinie);

    }





}
