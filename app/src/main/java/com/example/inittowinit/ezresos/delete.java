package com.example.inittowinit.ezresos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class delete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
    }

    public void yesButtonPressed (View v)
    {
        int position = -1;
        Reservation.selectedReservation = Reservation.currentReservations.get(position);
        Reservation.currentReservations.remove(position);
        Intent i = new Intent(this, HomePage.class);
        this.startActivity(i);
    }

    public void noButtonPressed (View v)
    {
        Intent i = new Intent(this, HomePage.class);
        this.startActivity(i);
    }
}
