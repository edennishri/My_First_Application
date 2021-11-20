package com.example.myfirstapplication;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class balcony_plants extends AppCompatActivity {

    RecyclerView recyclerView;
    static String balconyPlants[] = {"Monstera","Pothos", "White Pothos"};
    int balconyPlantsImages[] = {R.drawable.monstera, R.drawable.pothos,
            R.drawable.white_pothos};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balcony_plants);

        recyclerView = findViewById(R.id.balconyPlantsRecycleView);

        MyAdapter myAdapter1 = new MyAdapter(this,balconyPlants, balconyPlantsImages);
        recyclerView.setAdapter(myAdapter1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}