package ro.ase.cts.clase;

public class Hotel {
    private String numeHotel;
    private int numarCamere;
    private int nrCamereOcupate;

    private static Hotel instance=null;

    private Hotel(String numeHotel, int numarCamere, int nrCamereOcupate) {
        this.numeHotel = numeHotel;
        this.numarCamere = numarCamere;
        this.nrCamereOcupate = nrCamereOcupate;
    }

    public static synchronized Hotel getInstance(String numeHotel, int numarCamere, int nrCamereOcupate)
    {
        if(instance==null)
            instance=new Hotel(numeHotel,numarCamere,nrCamereOcupate);
        return instance;
    }

    public void rezervaCamera()
    {
        if(this.nrCamereOcupate<this.numarCamere)
        {
            System.out.println("Rezervarea a fost realizata");
            this.nrCamereOcupate++;
        }
        else
        {
            System.out.println("Nu exista camere disponibile");
        }

    }

    public void afisareDetaliiHotel()
    {
        StringBuilder  builder=new StringBuilder();
        builder.append("Nume Hotel:").append(this.numeHotel);
        builder.append("\n");
        builder.append("Nr. Camere: ").append(this.numarCamere);
        builder.append("\n");
        builder.append("Nr. Camere Ocupate: ").append(this.nrCamereOcupate);
        builder.append("\n");
        builder.append("Nr. Camere Disponibile: ").append(this.numarCamere-this.nrCamereOcupate);
        System.out.println(builder.toString());
    }

    public void gradOcupare()
    {

    }

}
