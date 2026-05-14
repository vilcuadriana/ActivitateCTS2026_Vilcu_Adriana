package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Calator;
import ro.ase.cts.clase.CalatorAbonat;
import ro.ase.cts.clase.MijlocDeTransport;

public class Main {
    static void main(String[] args) {
        Calator calator=new CalatorAbonat("Andrei");
        Calator calator2=new CalatorAbonat("Mihai");
        Calator calator3=new CalatorAbonat("Razvan");
        Calator calator4=new CalatorAbonat("Calin");


        MijlocDeTransport autobuz=new Autobuz("10");
        autobuz.abonareCalator(calator);
        autobuz.abonareCalator(calator2);
        autobuz.abonareCalator(calator3);
        autobuz.pleacaDinDepou();
        autobuz.abonareCalator(calator4);
        autobuz.ramaneBlocatInTrafic();


    }
}
