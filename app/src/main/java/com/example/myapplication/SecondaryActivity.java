package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class SecondaryActivity  extends AppCompatActivity {

    private Button button1;
    private Button button2;

    private FragmentManager fragmentManager = getSupportFragmentManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.secondary_activity);

        button1 = findViewById(R.id.button_1);

        button1.setOnClickListener(v -> {
            fragmentManager.beginTransaction()
                    .addToBackStack("Grup One")
                    .replace(R.id.fragmentContainerView, new GrupOne(), null)
                    .commit();
        });


        button2 = findViewById(R.id.button_2);

        button2.setOnClickListener(v -> {
            fragmentManager.beginTransaction()
                    .addToBackStack("Grup Two")
                    .replace(R.id.fragmentContainerView, new GrupTwo(), null)
                    .commit();
        });
    }
}
