package com.example.matej.unicon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class SpeedActivity extends AppCompatActivity {
    Button speedConvert;
    EditText etSpeed;
    TextView tvSpeed;
    Spinner speedSpinner;
    double rez;
    public static final String REZULTAT="REZULTAT";
    Intent explicitIntent = new Intent();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
        setUpUI();
    }
    private void setUpUI(){
        tvSpeed = (TextView) findViewById(R.id.tvSpeed);
        etSpeed = (EditText) findViewById(R.id.etSpeed);
        speedConvert = (Button) findViewById(R.id.speedConvert);
        speedSpinner = (Spinner) findViewById(R.id.speedSpinner);


        speedConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rez = Double.parseDouble(etSpeed.getText().toString());
                switch (speedSpinner.getSelectedItemPosition()){
                    case 0:
                        Kmh_u_ms();
                        break;
                    case 1:
                        ms_u_Kmh();
                        break;
                    case 2:
                        Kmh_u_Mph();
                        break;
                    case 3:
                        Mph_u_Kmh();
                        break;
                }
            }
            private void Kmh_u_ms(){
                explicitIntent.putExtra(REZULTAT,rez +"\n" + "Kmh\n\n" + (rez/3.6) +"\n" + "m/s");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }
            private void ms_u_Kmh(){
                explicitIntent.putExtra(REZULTAT,rez +"\n" + "m/s\n\n" + (rez*3.6) +"\n" + "Kmh");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }
            private void Kmh_u_Mph(){
                explicitIntent.putExtra(REZULTAT,rez +"\n" + "Kmh\n\n" + (rez*0.62) +"\n" + "Mph");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }
            private void Mph_u_Kmh() {
                explicitIntent.putExtra(REZULTAT, rez +"\n" + "Mph\n\n" + (rez / 0.62) +"\n" + "Kmh");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }

        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.speedArray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        speedSpinner.setAdapter(adapter);
    }
}
