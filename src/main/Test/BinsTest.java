import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void incrementBinTest() {
        //Given
        Bins bins = new Bins(5);
        Integer number = 21;
        Integer expected = 1;

        //When
        bins.incrementBin(number);
        Integer actual = bins.getBin(number);

        //Then
        assertEquals(expected,actual);

    }

    @Test
    public void incrementBinTestWithNegative() {
        //Given
        Bins bins = new Bins(5);
        Integer number = 4;

        //When
        try{
            bins.incrementBin(number);
            Integer actual = bins.getBin(number);
            fail("Expecting null");}

        //Then
        catch(NullPointerException e) {
            Assert.assertTrue(e instanceof NullPointerException);
        }

    }

    @Test
    public void incrementBinTestWithNull() {
        //Given
        Bins bins = new Bins(5);
        Integer number = null;

        //When
        try{
            bins.incrementBin(number);
            Integer actual = bins.getBin(number);
            fail("Expecting null");}

        //Then
        catch(NullPointerException e) {
            Assert.assertTrue(e instanceof NullPointerException);
        }

    }

    @Test
    public void hasBinBoxTest() {
        //Given
        Bins bins = new Bins(7);
        Integer number = 40;
        Boolean expected = true;

        //When
        bins.incrementBin(number);
        Boolean actual = bins.hasBinBox(number);

        //Then
        Assert.assertEquals(expected,actual);
    }


}