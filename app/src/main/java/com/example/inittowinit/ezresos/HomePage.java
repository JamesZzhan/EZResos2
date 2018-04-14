package com.example.inittowinit.ezresos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

    }

    public void reserveRoomManButtonPressed (View v)
    {
        Intent i = new Intent(this, manual_reservation.class);
        this.startActivity(i);
    }

    public void reserveRoomGenButtonPressed (View v)
    {
        Intent i = new Intent(this, UserInfo.class);
        this.startActivity(i);
    }
    public void equipForExistResoButtonPressed (View v)
    {
        Intent i = new Intent(this, equipCurrentReso.class);
        this.startActivity(i);
    }
    public void cancelResoButtonPressed (View v)
    {
        Intent i = new Intent(this, manual_reservation.class);
        this.startActivity(i);
    }
    public void myResosButtonPressed (View v)
    {
        Intent i = new Intent(this, manual_reservation.class);
        this.startActivity(i);
    }
    public void profileButtonPressed (View v)
    {
        Intent i = new Intent(this, manual_reservation.class);
        this.startActivity(i);
    }
    


}
