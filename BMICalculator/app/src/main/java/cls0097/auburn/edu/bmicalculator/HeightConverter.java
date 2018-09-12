package cls0097.auburn.edu.bmicalculator;

public class HeightConverter {

    //variables
    double heightInches;
    public static final double CONVERSION_FACTOR = 39.3701;

    //constructor
    public HeightConverter(double heightInchesIn) {
        heightInches = heightInchesIn;
    }

    //methods
    public double getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(int heightInchesIn) {
        heightInches = heightInchesIn;
    }

    public double convertInchesToMeters() {
        return heightInches / CONVERSION_FACTOR;


        /*Reassign weightInKilos to num2 in "if-else" statement in MainActivity*/
    }
}
