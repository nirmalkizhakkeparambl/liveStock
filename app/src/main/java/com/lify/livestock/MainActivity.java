package com.lify.livestock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ImageAdapter imageAdapter;

    private int[] imageIds = {R.drawable.breeds, R.drawable.buffalo, R.drawable.goat, R.drawable.sheep, R.drawable.pig, R.drawable.rabbit};
    private String[] imageTitles = {"Cattle", "Buffalo", "Goat", "Sheep", "Pig","Rabbit"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

         imageAdapter = new ImageAdapter(imageIds, imageTitles,MainActivity.this);
         recyclerView.setAdapter(imageAdapter);

        }

}
