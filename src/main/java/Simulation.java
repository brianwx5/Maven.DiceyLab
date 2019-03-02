import java.util.Set;

public class Simulation {

    private Integer numberOfDices;
    private Integer numberOfRolls;
    private Dice dice;
    private Bins bin;

    public Simulation(Integer numberOfDices, Integer numberOfRolls) {
        this.numberOfDices = numberOfDices;
        this.numberOfRolls = numberOfRolls;
        this.dice = new Dice(numberOfDices);
        this.bin = dice.getBin();
    }

    public void runSimulation() {
        for(Integer i = 1; i<= this.numberOfRolls; i++) {
            this.dice.tossAndSum();
        }
    }

    public void printResults() {
        String result = String.format("***\nSimulation of %d dice tossed for %d times.\n***\n",numberOfDices,numberOfRolls);
        Set<Integer> element = this.bin.returnBinBoxes().keySet();
        for(Integer key : element) {
            double percentage = (double)bin.getBin(key)/(double) numberOfRolls;
            result += String.format("%2d :%9d :%.2f %s\n",key, this.bin.getBin(key), percentage, printStars(percentage));
            System.out.println(result);
        }
    }

    public String printStars(double percentage) {
        String stars = "";
        for(double i = 0.0; i <percentage; i+=0.01 ) {
            stars +=  "*";
        }
        return stars;
    }

    public static void main(String[] args) {
        Simulation simulation = new Simulation(2,1000000);
        simulation.runSimulation();
        simulation.printResults();

    }


}
