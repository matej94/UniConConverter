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

public class TemperatureActivity extends AppCompatActivity {

    Button temperatureConvert;
    EditText etTemperature;
    TextView tvTemperature;
    Spinner temperatureSpinner;
    double rez;
    public static final String REZULTAT = "REZULTAT";
    Intent explicitIntent = new Intent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        setUpUI();
    }
    private void setUpUI(){
        tvTemperature = (TextView) findViewById(R.id.tvTemperature);
        etTemperature = (EditText) findViewById(R.id.etTemperature);
        temperatureConvert = (Button) findViewById(R.id.temperatureConvert);
        temperatureSpinner = (Spinner) findViewById(R.id.temperatureSpinner);


        temperatureConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rez = Double.parseDouble(etTemperature.getText().toString());
                switch (temperatureSpinner.getSelectedItemPosition()){
                    case 0:
                        C_u_K();
                        break;
                    case 1:
                        K_u_C();
                        break;
                    case 2:
                        C_u_F();
                        break;
                    case 3:
                        F_u_C();
                        break;
                }
            }
            private void C_u_K(){
                explicitIntent.putExtra(REZULTAT,rez + "Celziusa\n\n" + (rez+273.15) + "Kelvina");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }
            private void K_u_C(){
                explicitIntent.putExtra(REZULTAT,rez + "Kelvina\n\n" + (rez-273.15) + "Celziusa");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }
            private void C_u_F(){
                explicitIntent.putExtra(REZULTAT,rez + "Celziusa\n\n" + ((rez*1.8)+32) + "Fahrenheita");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }
            private void F_u_C(){
                explicitIntent.putExtra(REZULTAT,rez + "Fahrenheita\n\n" + ((rez-32)/1.8) + "Celziusa");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.temperatureArray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        temperatureSpinner.setAdapter(adapter);
    }
}