package com.example.inittowinit.ezresos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class manual_reservation extends AppCompatActivity {

    private ListView roomView;
    private EditText peopleView;
    private EditText startTimeET;
    private EditText endTimeET;


    private int people;
    private int startTime;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_reservation);

        this.roomView = (ListView)this.findViewById(R.id.roomView);
        this.peopleView = (EditText)this.findViewById(R.id.peopleView);
        this.startTimeET = (EditText)this.findViewById(R.id.startTimeET);
        this.endTimeET = (EditText)this.findViewById(R.id.endTimeET);


    }







}
