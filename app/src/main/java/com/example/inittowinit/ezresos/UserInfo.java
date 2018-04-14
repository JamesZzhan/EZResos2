package com.example.inittowinit.ezresos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserInfo extends AppCompatActivity {
    private TextView studentIDTV;
    private EditText studentIDET;
    private TextView bookingDateTV;
    private EditText dateET;
    private TextView startTimeTV;
    private EditText startTimeET;
    private TextView noOfPeopleTV;
    private EditText noOfPeopleET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        this.studentIDTV = (TextView)this.findViewById(R.id.studentIDTV);
        this.studentIDET = (EditText)this.findViewById(R.id.studentIDET);
        this.bookingDateTV = (TextView)this.findViewById(R.id.bookingDateTV);
        this.dateET = (EditText)this.findViewById(R.id.dateET);
        this.startTimeTV = (TextView)this.findViewById(R.id.startTimeTV);
        this.startTimeET = (EditText)this.findViewById(R.id.startTimeET);
        this.noOfPeopleTV = (TextView)this.findViewById(R.id.noOfPeopleTV);
        this.noOfPeopleET = (EditText)this.findViewById(R.id.noOfPeopleET);
    }
}
