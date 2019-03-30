package com.example.androidjavaprogram1_finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Registration extends AppCompatActivity {

    EditText firstName = null;
    EditText lastName = null;
    String grade = null;

    RadioGroup radioGroupGrade = null;
    RadioButton radioButton9 = null;
    RadioButton radioButton10 = null;
    RadioButton radioButton11 = null;
    RadioButton radioButton12 = null;

    Button buttonNext = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        this.firstName = findViewById(R.id.editTextFirstName);
        this.lastName = findViewById(R.id.editTextLastName);

 //       if(this.radioButton9.isChecked()) {
            grade = "9th Grade";
 //           return;
 //       }
 //       if(this.radioButton10.isChecked()) {
            grade = "10th Grade";
 //           return;
 //       }
 //       if(this.radioButton11.isChecked()) {
            grade = "11th Grade";
 //           return;
 //      }
 //       if(this.radioButton12.isChecked()) {
            grade = "12th Grade";
 //           return;
 //       }

        this.buttonNext = (Button)findViewById(R.id.buttonNext);

        // Create button callbacks
        this.buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Click Start Button", "Starting...");
                Intent intent = new Intent(Registration.this,
                        com.example.androidjavaprogram1_finalproject.CourseEnroll.class);

                intent.putExtra("firstName", String.valueOf(firstName));
                intent.putExtra("lastName", String.valueOf(lastName));
                intent.putExtra("grade", grade);

                startActivity(intent);
            }
        });


    }
}
