package ro.ase.cts.decorator;

import ro.ase.cts.clase.NotaDePlataAbstract;

public class NotaDePlataIntaiMai extends NotaDePlataDecorator{
    public NotaDePlataIntaiMai(NotaDePlataAbstract notaDePlataAbstract) {
        super(notaDePlataAbstract);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani de 1MAI B)");
    }
}
