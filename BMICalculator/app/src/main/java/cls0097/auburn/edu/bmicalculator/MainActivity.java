package cls0097.auburn.edu.bmicalculator;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    EditText weightEditText /*= (EditText) findViewById(R.id.weightEditText)*/;
    double toKilosWeight = 0;
    double toMetersHeight = 0;

    //TODO: Debug
    //TODO: Add "Try-Catch" statements to catch Negative Value Exceptions

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner weightUnitsSpinner = findViewById(R.id.weightUnitsSpinner);
        final Spinner heightSpinner = findViewById(R.id.heightSpinner);

        //Create ArrayAdapter that will take items from weight_units_array and put them into a default spinner layout

        //Option 1:
        /*ArrayAdapter<CharSequence> adapter1 =
                ArrayAdapter.createFromResource(this, R.array.weight_units_array,
                        android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        weightUnitsSpinner.setAdapter(adapter1);*/

        //Create ArrayAdapter that will take items from height_array and put them into a default spinner layout
        /*ArrayAdapter<CharSequence> adapter2 =
                ArrayAdapter.createFromResource(this, R.array.height_array,
                        android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        heightSpinner.setAdapter(adapter2);*/

        //Option 2:
        ArrayAdapter adapter1 = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,  getResources().getStringArray(R.array.weight_units_array));
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        weightUnitsSpinner.setAdapter(adapter1);

        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.height_array));
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        heightSpinner.setAdapter(adapter2);

        //create Button object for calculateButton
        Button calculateButton = /*(Button)*/ findViewById(R.id.calculateButton);

        //Set OnClickListener() for calculateButton
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create onClickSelectedItemListener() for selected item in spinner
                weightUnitsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        String selectedWeightUnit = parent.getItemAtPosition(position).toString();
                        String pound = "lb";
                        weightEditText = findViewById(R.id.weightEditText);
                        double weight = Double.parseDouble(weightEditText.getText().toString());

                        PoundsConverter a = new PoundsConverter(weight);
                        StonesConverter b = new StonesConverter(weight);

                        if (selectedWeightUnit.equals(pound)) {

                            toKilosWeight = a.convertPoundsToKilos();

                        }

                        else {

                            toKilosWeight = b.convertStonesToKilos();
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                //Create onCLickSelectedItemListener() for heightSpinner
                heightSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        String selectedHeight = parent.getItemAtPosition(position).toString();

                        String inches59 = "4'11";
                        String inches60 = "5'0";
                        String inches61 = "5'1";
                        String inches62 = "5'2";
                        String inches63 = "5'3";
                        String inches64 = "5'4";
                        String inches65 = "5'5";
                        String inches66 = "5'6";
                        String inches67 = "5'7";
                        String inches68 = "5'8";
                        String inches69 = "5'9";
                        String inches70 = "5'10";
                        String inches71 = "5'11";
                        String inches72 = "6'0";
                        String inches73 = "6'1";
                        String inches74 = "6'2";
                        String inches75 = "6'3";
                        String inches76 = "6'4";
                        String inches77 = "6'5";
                        String inches78 = "6'6";
                        String inches79 = "6'7";
                        String inches80 = "6'8";
                        String inches81 = "6'9";
                        String inches82 = "6'10";
                        String inches83 = "6'11";

                        if (selectedHeight.equals(inches59)) {
                            int height = 59;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches60)) {
                            int height = 60;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches61)) {
                            int height = 61;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches62)) {
                            int height = 62;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches63)) {
                            int height = 63;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches64)) {
                            int height = 64;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches65)) {
                            int height = 65;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches66)) {
                            int height = 66;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches67)) {
                            int height = 67;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches68)) {
                            int height = 68;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches69)) {
                            int height = 69;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches70)) {
                            int height = 70;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches71)) {
                            int height = 71;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches72)) {
                            int height = 72;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches73)) {
                            int height = 73;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches74)) {
                            int height = 74;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches75)) {
                            int height = 75;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches76)) {
                            int height = 76;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches77)) {
                            int height = 77;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches78)) {
                            int height = 78;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches79)) {
                            int height = 79;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches80)) {
                            int height = 80;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches81)) {
                            int height = 81;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches82)) {
                            int height = 82;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }

                        else if (selectedHeight.equals(inches83)) {
                            int height = 83;
                            HeightConverter c = new HeightConverter(height);
                            toMetersHeight = c.convertInchesToMeters();
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                BmiCalculator calculatedBmi = new BmiCalculator(toKilosWeight, toMetersHeight);
                calculatedBmi.calculateBmi();
                Intent resultIntent = new Intent(getApplicationContext(), ResultActivity.class);
                resultIntent.putExtra("cls0097.auburn.edu.STRING_RESULT", calculatedBmi.toString());
                startActivity(resultIntent);
            }
        });
     }
}
