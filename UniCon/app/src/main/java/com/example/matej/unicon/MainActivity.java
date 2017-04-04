package com.example.matej.unicon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button speedButton, temperatureButton, distanceButton, timeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpUI();
    }
    private void setUpUI(){
        speedButton = (Button) findViewById(R.id.speedButton);
        speedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicitIntent = new Intent();
                explicitIntent.setClass(getApplicationContext(), SpeedActivity.class);
                startActivity(explicitIntent);
            }
        });
        temperatureButton = (Button) findViewById(R.id.temperatureButton);
        temperatureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicitIntent = new Intent();
                explicitIntent.setClass(getApplicationContext(), TemperatureActivity.class);
                startActivity(explicitIntent);
            }
        });
        distanceButton = (Button) findViewById(R.id.distanceButton);
        distanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicitIntent = new Intent();
                explicitIntent.setClass(getApplicationContext(), DistanceActivity.class);
                startActivity(explicitIntent);
            }
        });
        timeButton = (Button) findViewById(R.id.timeButton);
        timeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicitIntent = new Intent();
                explicitIntent.setClass(getApplicationContext(), TimeActivity.class);
                startActivity(explicitIntent);
            }
        });
    }
}
