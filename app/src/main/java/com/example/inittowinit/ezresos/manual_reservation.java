package com.example.inittowinit.ezresos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reservationsRef = database.getReference("reservation");

    public Reservation currRes;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_reservation);


        this.roomName = (EditText)this.findViewById(R.id.roomName);
        this.peopleView = (EditText)this.findViewById(R.id.peopleView);
        this.startTimeET = (EditText)this.findViewById(R.id.startTimeET);
        this.endTimeET = (EditText)this.findViewById(R.id.endTimeET);
        this.dateView = (EditText)this.findViewById(R.id.dateView);

        this.submit = (Button)this.findViewById(R.id.submit);

    }

    public void onSubmitButtonClicked(View v)
    {
        System.out.print("CLICKED!!");
        String roomName = this.roomName.getText().toString();
        int startTime = Integer.parseInt(startTimeET.getText().toString());
        String endTime = this.endTimeET.getText().toString();
        String date = this.dateView.getText().toString();
        int peopleNumber = Integer.parseInt(peopleView.getText().toString());


                    DatabaseReference tempRes = reservationsRef.push();
                    currRes = new Reservation(roomName, date, startTime, peopleNumber);
                    tempRes.setValue(currRes);
                    Reservation.currentReservations.add(currRes);
                    User.myReservations.add(currRes);

                    Intent intent = new Intent(this, HomePage.class);
                    this.startActivity(intent);

    }




}
