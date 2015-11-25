package android.arit.dusit.ac.th.radio;

import android.graphics.Color;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public RadioButton r1, r2, r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = (RadioButton) findViewById(R.id.radioButton);
        r2 = (RadioButton) findViewById(R.id.radioButton2);
        r3 = (RadioButton) findViewById(R.id.radioButton3);
        final RelativeLayout mealLayout = (RelativeLayout) findViewById(R.id.mealLayout);


        r1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mealLayout.setBackgroundColor(Color.YELLOW);
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mealLayout.setBackgroundColor(Color.RED);
            }
        });


        r3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mealLayout.setBackgroundColor(Color.GREEN);
            }
        });


    }
}
