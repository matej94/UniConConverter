package com.example.matej.unicon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    TextView tvRezultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        setUpUI();
    }
    private void setUpUI(){
        tvRezultat = (TextView) findViewById(R.id.tvRezultat);

        Intent Intent = getIntent();
        if(Intent.hasExtra(TemperatureActivity.REZULTAT)){
            tvRezultat.setText(Intent.getStringExtra(TemperatureActivity.REZULTAT));
        }
        if(Intent.hasExtra(TimeActivity.REZULTAT)){
            tvRezultat.setText(Intent.getStringExtra(TimeActivity.REZULTAT));
        }
        if(Intent.hasExtra(DistanceActivity.REZULTAT)){
            tvRezultat.setText(Intent.getStringExtra(DistanceActivity.REZULTAT));
        }
        if(Intent.hasExtra(SpeedActivity.REZULTAT)){
            tvRezultat.setText(Intent.getStringExtra(SpeedActivity.REZULTAT));
        }
    }
}
