package cls0097.auburn.edu.bmicalculator;

public class StonesConverter {

    //variables
    private double weightStones;
    private static final double CONVERSION_FACTOR = 0.157473;

    //constructor
    public StonesConverter(double weightStonesIn) {

        weightStones = weightStonesIn;
    }

    //methods
    public double getWeightStones() {
        return weightStones;
    }

    public void setWeightStones(int weightStonesIn) {
        weightStones = weightStonesIn;
    }

    public double convertStonesToKilos() {
        return weightStones / CONVERSION_FACTOR;

        /*Reassign weightInKilos to num1 in "if-else" statement in MainActivity*/
    }
}
