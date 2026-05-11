package ro.ase.cts.main;

import ro.ase.cts.clase.NotaDePlata;
import ro.ase.cts.clase.NotaDePlataAbstract;
import ro.ase.cts.decorator.NotaDePlataDecorator;
import ro.ase.cts.decorator.NotaDePlataIntaiMai;
import ro.ase.cts.decorator.NotaDePlataPrintatNoulAn;

public class Main {
    public static void main(String[] args) {
        int input = 2;
        NotaDePlataDecorator notaDePlataDecorator;

        NotaDePlataAbstract notaDePlata1 = new NotaDePlata("29-04-26", 153.56f);

        if(input == 1) {
            notaDePlataDecorator = new NotaDePlataIntaiMai(notaDePlata1);
        } else {
            notaDePlataDecorator = new NotaDePlataPrintatNoulAn(notaDePlata1);
        }

        notaDePlata1.printeaza();
        notaDePlataDecorator.printeazaFelicitare();
    }
}
