import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void tossAndSumTest() {
        //Given
        Dice dice = new Dice(5);
        Bins bin = new Bins(5);
        Integer numberOfDices = 5;


        //When
        Integer numberFromRoll = dice.getNumberOfDice();
        boolean haveNumberInBin = bin.hasBinBox(numberFromRoll);

        //Then
        Assert.assertTrue(haveNumberInBin);
    }

    @Test
    public void tossZeroDiceTest(){
        //Given
        Dice dice = new Dice(0);
        Bins bin = new Bins(0);
        Integer numberOfDices = 0;

        //When
        Integer numberFromRoll = 0;
        boolean haveNumberInBin = bin.hasBinBox(numberFromRoll);

        //Then
        Assert.assertTrue(haveNumberInBin);

    }


}