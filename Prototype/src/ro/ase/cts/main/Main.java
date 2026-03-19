package ro.ase.cts.main;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareAbstracta;

public class Main {
    static void main(String[] args) {
//        Rezervare rez1=new Rezervare("GABI",20,20,"0753341394");
//        Rezervare rez2=(Rezervare) rez1.clone();

        RezervareAbstracta rez1=new Rezervare("GABI",20,20,"0753341394");
        RezervareAbstracta rez2= rez1.clone();

        ((Rezervare)rez2).setOraRezervare(10);
        ((Rezervare)rez2).setZiuaRezervarii(10);

        System.out.println(rez1.toString());
        System.out.println(rez2.toString());
    }
}
