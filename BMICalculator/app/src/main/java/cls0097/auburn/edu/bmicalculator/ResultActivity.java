package cls0097.auburn.edu.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);

        //Create "if" statement that will send BMI message to next screen if intent has extra
        if (getIntent().hasExtra("cls0097.auburn.edu.STRING_RESULT")) {

            TextView bmiTextView = findViewById(R.id.bmiTextView);
            String text = getIntent().getExtras().getString("cls0097.auburn.edu.STRING_RESULT");
            bmiTextView.setText(text);
        }
    }
}
