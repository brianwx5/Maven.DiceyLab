public class Dice {


    private int numberOfDice;
    private Bins bin;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
        this.bin = new Bins(numberOfDice);
    }

    public Integer tossAndSum() {
        Integer result = 0;
        for(int i =0; i<numberOfDice; i++){
            result += (int) (Math.random()*6 +1);
        }
        this.bin.incrementBin(result);
        return result;
    }

    public int getNumberOfDice() {
        return this.numberOfDice;
    }

    public Bins getBin() {
        return this.bin;
    }



}
