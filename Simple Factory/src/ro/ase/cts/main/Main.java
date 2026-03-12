package ro.ase.cts.main;

import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.factory.Depou;
import ro.ase.cts.factory.Tipuri;

public class Main {

    static void main(String[] args)
    {
        Depou depou = new Depou();
        MijlocTransport autobuz=depou.getMijlocTransport(Tipuri.AUTOBUZ, 4,"B149ABC");
        MijlocTransport tramvai= depou.getMijlocTransport(Tipuri.TRAMVAI,20,"B324GHJ");

        autobuz.afisareDescriere();
        tramvai.afisareDescriere();

    }
}
