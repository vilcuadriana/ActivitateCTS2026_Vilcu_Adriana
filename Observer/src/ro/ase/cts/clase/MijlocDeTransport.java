package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocDeTransport {
    protected String linie;
    List<Calator> listacalatori;

    public MijlocDeTransport(String linie) {
        this.linie=linie;
        this.listacalatori=new ArrayList<>();
    }
    public void abonareCalator(Calator calator){
        listacalatori.add(calator);
    }
    public void dezabonareCalator(Calator calator){
        listacalatori.remove(calator);
    }
    public void notificareCalator(String mesaj){
        for(Calator calator:this. listacalatori){
            calator.notificare(mesaj);
        }
    }
    public abstract void pleacaDinDepou();
    public abstract void ramaneBlocatInTrafic();
}
