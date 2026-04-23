package ro.ase.cts.main;

import ro.ase.cts.adapter.Adapter;
import ro.ase.cts.clase.Spital.Medicament;


public class Main {

    static void procuraraMedicament(ro.ase.cts.clase.Farmacie.Medicament medicament)
    {
        medicament.cumparaMedicament();
    }
    static void main(String[] args) {
        Medicament medS=new Medicament("Mometasone Spray",25.6f);
        medS.prezintaReteta();
        medS.achizitioneazaMedicament();


        ro.ase.cts.clase.Farmacie.Medicament medF=new ro.ase.cts.clase.Farmacie.Medicament("Paracetamol");
        medF.cumparaMedicament();
        Adapter medAdapter=new Adapter(medS);

       // procuraraMedicament(medS);
        procuraraMedicament(medF);
        procuraraMedicament(medAdapter);


    }
}
