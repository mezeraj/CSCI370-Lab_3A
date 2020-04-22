package com.introtoandroid.advancedadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    Student s1 = new Student("Computer Science", "John", "Lennon");
    Student s2 = new Student("Finance","Paul", "Mcartney");
    Student s3 = new Student("music","George", "Harrison");
    Student s4 = new Student("Math", "Ringo", "Starr");


    ArrayList<Student> students = new ArrayList<>();

    StudentAdapter studentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        listView = findViewById(R.id.student);

        studentAdapter = new StudentAdapter(getApplicationContext(), students);
        listView.setAdapter(studentAdapter);


    }
}
