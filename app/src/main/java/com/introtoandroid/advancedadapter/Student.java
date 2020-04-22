package com.introtoandroid.advancedadapter;

import androidx.appcompat.app.AppCompatActivity;

public class Student extends AppCompatActivity {
    private String major;
    private String first;
    private String last;


    Student (String m, String fn, String ln) {
        major = m;
        first = fn;
        last = ln;

    }

    public String getMajor(){

        return major;
    }
    public void setMajor(String temp){
        major = temp;
    }

    public String getFirst(){

        return first;
    }
    public void setFirst(String temp){

        first = temp;
    }

    public String getLast(){
        return last;
    }
    public void setLast(String temp){

        last = temp;
    }


}
