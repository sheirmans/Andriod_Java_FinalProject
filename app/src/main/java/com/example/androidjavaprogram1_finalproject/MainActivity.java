/*
 * CSE41246 - Android Java Fundamentals
 * Fall 2019
 * Final Project - Course Registration
 * Szeto, Sheirman
 */

package com.example.androidjavaprogram1_finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonStart = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.buttonStart = (Button) findViewById(R.id.buttonStart);

        // Create button callbacks
        this.buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Click Start Button", "Starting...");
                Intent intent = new Intent(MainActivity.this,
                        com.example.androidjavaprogram1_finalproject.Registration.class);
                startActivity(intent);
            }
        });

    }
}
