package com.example.androidjavaprogram1_finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CourseEnroll extends AppCompatActivity {

    String firstName = null;
    String lastName = null;
    String grade = null;


/*
    TextView textViewFirstName = null;
    TextView textViewLastName = null;
    TextView textViewGrade = null;
*/

    ListView simpleList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_enroll);
     /*
        this.textViewFirstName = findViewById(R.id.textViewFirstName);
        this.textViewLastName = findViewById(R.id.textViewLastName);
        this.textViewGrade = findViewById(R.id.textViewGrade);
     */

        //get extra value
        this.firstName = String.valueOf(getIntent().getIntExtra("firstName", ' '));
        this.lastName = String.valueOf(getIntent().getIntExtra("lastName", ' '));
        this.grade = String.valueOf(getIntent().getIntExtra("grade", ' '));

        //set value
/*      textViewFirstName.setText(firstName);
        textViewLastName.setText(lastName);
        textViewGrade.setText(grade);
*/

        //get List View value & Adaptor
        simpleList = (ListView) findViewById(R.id.listViewCourse);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.activity_listview);
        adapter.add("French 101");
        adapter.add("French 102");
        adapter.add("French 201");
        adapter.add("French 202");

        this.simpleList.setAdapter(adapter);
    }

}
