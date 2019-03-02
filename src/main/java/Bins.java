import java.util.TreeMap;

public class Bins {

    private TreeMap<Integer, Integer> bin = new TreeMap<Integer, Integer>();

    public Bins(Integer numberOfDice) {
        for (Integer i = numberOfDice; i <= (numberOfDice * 6); i++) {
            this.bin.put(i, 0);
        }
    }

    //increment value by each key (binnumber)
    public void incrementBin(Integer binNumber) {
        Integer newValue = this.bin.get(binNumber) + 1;
        this.bin.put(binNumber, newValue);
    }

    //returns value associated with key
    public Integer getBin(Integer bigNumber) { return  bin.get(bigNumber);}

    //returns the bin
    public TreeMap<Integer, Integer> returnBinBoxes() {return  bin;}

    //This tells us if the value was actually recorded
    public Boolean hasBinBox(Integer binNumber) {return (this.bin.containsKey(binNumber));};


}
