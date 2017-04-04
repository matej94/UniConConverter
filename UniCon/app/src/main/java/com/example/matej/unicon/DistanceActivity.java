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

public class DistanceActivity extends AppCompatActivity {

    Button distaceConvert;
    EditText etDistance;
    TextView tvDistance;
    Spinner distanceSpinner;
    double rez;
    public static final String REZULTAT = "REZULTAT";
    Intent explicitIntent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);
        setUpUI();
    }
    private void setUpUI(){
        tvDistance = (TextView) findViewById(R.id.tvDistance);
        etDistance = (EditText) findViewById(R.id.etDistance);
        distanceSpinner = (Spinner) findViewById(R.id.distanceSpinner);
        distaceConvert = (Button) findViewById(R.id.distanceConvert);
        distaceConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rez = Double.parseDouble(etDistance.getText().toString());
                switch (distanceSpinner.getSelectedItemPosition()) {
                    case 0:
                        km_u_m();
                        break;
                    case 1:
                        m_u_km();
                        break;
                    case 2:
                        m_u_cm();
                        break;
                    case 3:
                        cm_u_m();
                        break;
                    case 4:
                        m_u_dm();
                        break;
                    case 5:
                        dm_u_m();
                        break;
                    case 6:
                        m_u_mm();
                        break;
                }
            }

            private void km_u_m() {
                explicitIntent.putExtra(REZULTAT, rez + "km\n\n" + (rez * 1000) + "m");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }

            private void m_u_km() {
                explicitIntent.putExtra(REZULTAT, rez + "m\n\n" + rez / 1000 + "km");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }

            private void m_u_cm() {
                explicitIntent.putExtra(REZULTAT, rez + "m\n\n" + rez * 100 + "cm");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }

            private void cm_u_m() {
                explicitIntent.putExtra(REZULTAT, rez + "cm\n\n" + (rez / 100) + "m");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }

            private void m_u_dm() {
                explicitIntent.putExtra(REZULTAT, rez + "m\n\n" + (rez * 10) + "dm");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }

            private void dm_u_m() {
                explicitIntent.putExtra(REZULTAT, rez + "dm\n\n" + (rez / 10) + "m");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }

            private void m_u_mm() {
                explicitIntent.putExtra(REZULTAT, rez + "m\n\n" + (rez * 1000) + "mm");
                explicitIntent.setClass(getApplicationContext(), FinalActivity.class);
                startActivity(explicitIntent);
            }
        });
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.distanceArray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        distanceSpinner.setAdapter(adapter);
    }
}