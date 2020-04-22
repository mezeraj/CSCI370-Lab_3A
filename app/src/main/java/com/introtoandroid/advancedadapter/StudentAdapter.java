package com.introtoandroid.advancedadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends BaseAdapter {

    private LayoutInflater lInflate;
    private Context context;
    private ArrayList<Student> source;

    StudentAdapter (Context c, ArrayList a){
        context = c;
        source = a;
        lInflate = (LayoutInflater) context.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
    }

    @Override
    public int getCount() {
        return source.size();
    }

    @Override
    public Object getItem(int position) {
        return source.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = lInflate.inflate(R.layout.list_view_row, parent, false);

        TextView major = rowView.findViewById(R.id.major);
        TextView first = rowView.findViewById(R.id.first_name);
        TextView last = rowView.findViewById(R.id.last_name);


        Student student = (Student) getItem(position);
        major.setText(student.getMajor());
        first.setText(student.getFirst());
        last.setText(student.getLast());


        return rowView;
    }

}
