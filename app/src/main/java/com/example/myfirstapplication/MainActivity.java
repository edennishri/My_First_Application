package com.example.myfirstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button housePlantsButton;
    private Button balconyPlantsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //activating the buttons using relevant functions defined follows

        housePlantsButton = (Button) findViewById(R.id.housePlantsButton);
        housePlantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHousePlants();
            }
        });
        balconyPlantsButton = (Button) findViewById(R.id.balconyPlantsButton);
        balconyPlantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBalconyPlants();
            }
        });

    }
    public void openHousePlants(){
        Intent intent = new Intent(this, house_plants.class);
        startActivity(intent);
    }
    public void openBalconyPlants(){
        Intent intent = new Intent(this, balcony_plants.class);
        startActivity((intent));
    }
}