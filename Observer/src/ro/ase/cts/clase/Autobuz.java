package ro.ase.cts.clase;

public class Autobuz extends MijlocDeTransport{
    public Autobuz(String linie) {
        super(linie);
    }

    @Override
    public void pleacaDinDepou() {
        String mesaj="Autobuzul de pe linia "+super.linie+" pleaca din baza";
        notificareCalator(mesaj);
    }

    @Override
    public void ramaneBlocatInTrafic() {
        String mesaj="Autobuzul de pe linia "+super.linie+" a ramas blocat in trafic";
        notificareCalator(mesaj);

    }
}
