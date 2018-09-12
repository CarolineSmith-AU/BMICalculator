package cls0097.auburn.edu.bmicalculator;

public class PoundsConverter {

    //variables
    private double weightPounds;
    private static final double CONVERSION_FACTOR = 2.20462;

    //constructor
    public PoundsConverter(double weightPoundsIn) {

        weightPounds = weightPoundsIn;
    }

    //methods

    public double getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(int weightPoundsIn) {
        weightPounds = weightPoundsIn;
    }

    public double convertPoundsToKilos() {
        return weightPounds / CONVERSION_FACTOR;

        /*Reassign weightInKilos to num1 in "if-else" statement in MainActivity*/
    }
}
