package ro.ase.cts.adapter;

import ro.ase.cts.clase.Spital.Medicament;

public class Adapter extends ro.ase.cts.clase.Farmacie.Medicament {
    private Medicament medicament;

    public Adapter( Medicament medicament) {
        super(medicament.getNume());
        this.medicament = medicament;
    }

    @Override
    public void cumparaMedicament() {
        this.medicament.achizitioneazaMedicament();
    }
}
