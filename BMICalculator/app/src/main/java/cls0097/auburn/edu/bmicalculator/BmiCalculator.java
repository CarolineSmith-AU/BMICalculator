package cls0097.auburn.edu.bmicalculator;

import android.util.Log;

public class BmiCalculator {

    //Instantiate variables
    private double weight;
    private double height;

    //Constructor
    public BmiCalculator(double weightIn, double heightIn) {

        weight = weightIn;
        height = heightIn;
    }

    //Methods
    //TODO: Add method that calculates expected BMI and prints message in TextView.
    public double getWeight() {

        return weight;
    }

    public void setWeight(double weightIn) {

        weight = weightIn;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(int heightIn) {
        height = heightIn;
    }

    public double calculateBmi() {
        double squared_height = Math.pow(height, 2);
        double weight_new = weight;
        double bmi = weight_new / squared_height;
        return bmi;
    }

    public String toString() {
        double bmi = calculateBmi();
        return "Your calculated BMI is " + Double.toString(bmi) + " kg/m^2";
    }
}
