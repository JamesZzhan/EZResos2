package com.example.inittowinit.ezresos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class manual_reservation extends AppCompatActivity {

    private ListView roomView;

    private EditText roomName;
    private EditText peopleView;
    private EditText startTimeET;
    private EditText endTimeET;
    private EditText dateView;

    private Button submit;





    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_reservation);

        this.roomView = (ListView)this.findViewById(R.id.roomView);
        this.roomName = (EditText)this.findViewById(R.id.roomName);
        this.peopleView = (EditText)this.findViewById(R.id.peopleView);
        this.startTimeET = (EditText)this.findViewById(R.id.startTimeET);
        this.endTimeET = (EditText)this.findViewById(R.id.endTimeET);
        this.dateView = (EditText)this.findViewById(R.id.dateView);

        this.submit = (Button)this.findViewById(R.id.submit);

    }

    public void onSubmitButtonClicked(View v)
    {
        String roomName = this.roomName.getText().toString();
        String startTime = this.startTimeET.getText().toString();
        String endTime = this.endTimeET.getText().toString();
        String date = this.dateView.getText().toString();
        String peopleNumber = this.peopleView.getText().toString();
    }




}
