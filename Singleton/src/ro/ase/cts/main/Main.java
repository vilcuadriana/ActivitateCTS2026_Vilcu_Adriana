package ro.ase.cts.main;

import ro.ase.cts.clase.Hotel;

public class Main {
    static void main(String[] args) {
        Hotel hotel1 = Hotel.getInstance("Intercontinental",7,5);
        Hotel hotel2=Hotel.getInstance("Grand Hotel", 200,0);
        hotel1.rezervaCamera();
        hotel1.rezervaCamera();

        hotel2.rezervaCamera();
        hotel2.rezervaCamera();


        hotel1.afisareDetaliiHotel();



        /// intantele hotel1 si hotel2 sunt identice

    }
}
