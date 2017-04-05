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

public class TimeActivity extends AppCompatActivity {

    Button timeConvert;
    EditText etTime;
    TextView tvTime;
    Spinner timeSpinner;
    double rez;
    public static final String REZULTAT="REZULTAT";
    Intent explicitIntent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        setUpUI();
    }
    private void setUpUI(){
        tvTime = (TextView) findViewById(R.id.tvTime);
        etTime = (EditText) findViewById(R.id.etTime);
        timeConvert = (Button) findViewById(R.id.timeConvert);
        timeSpinner = (Spinner) findViewById(R.id.timeSpinner);


        timeConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rez = Double.parseDouble(etTime.getText().toString());
                switch (timeSpinner.getSelectedItemPosition()){
                    case 0:
                        sat_u_sec();
                        break;
                    case 1:
                        sec_u_sat();
                        break;
                    case 2:
                        dan_u_min();
                        break;
                    case 3:
                        min_u_sec();
                        break;
                }
            }
            private void sat_u_sec(){
                explicitIntent.putExtra(REZULTAT,rez +"\n" + "h\n\n" + (rez*3600)+ "\n" + "sec");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }
            private void sec_u_sat(){
                explicitIntent.putExtra(REZULTAT,rez +"\n" + "sec\n\n" + (rez/3600) +"\n" + "h");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }
            private void dan_u_min(){
                explicitIntent.putExtra(REZULTAT,rez +"\n" + "d\n\n" + (rez*1440) +"\n" + "min");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }
            private void min_u_sec(){
                explicitIntent.putExtra(REZULTAT,rez +"\n" + "min\n\n" + (rez*60) +"\n" + "sec");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.timeArray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        timeSpinner.setAdapter(adapter);
    }
}