package ro.ase.cts.teste;

import org.junit.Assert;
import ro.ase.cts.clase.CalatorAbonat;

public class CalatorAbonatTest {
    @org.junit.Test
    public void testCalatorAbonat() {
        CalatorAbonat calator= new CalatorAbonat("Nick");
        calator.setSold(5.5f);
        calator.platesteBilet(1f);
        Assert.assertEquals(calator.getSold(), 4.5f);


    }

}