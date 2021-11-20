package com.example.myfirstapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class house_plants extends AppCompatActivity {

    //declare the relevant titles, images, and view for the rows

    RecyclerView recyclerView;
    static String housePlants[] = {"Calathea Makoyana","Kenzia", "Monstera Monkey"};
    int housePlantsImages[] = {R.drawable.calathea_makoyana, R.drawable.kenzia,
            R.drawable.monstera_monkey};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_plants);

        //initialize the array with the relevant array from the resources
        //housePlants = getResources().getStringArray(R.array.house_plants);

        //initialize the view by the id
        recyclerView = findViewById(R.id.housePlantsRecycleView);

        MyAdapter myAdapter = new MyAdapter(this,housePlants, housePlantsImages);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}