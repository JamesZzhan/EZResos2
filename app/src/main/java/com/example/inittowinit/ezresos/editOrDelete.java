package com.example.inittowinit.ezresos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class editOrDelete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_or_delete);
    }

    public void editButtonPressed (View v)
    {
        Intent i = new Intent(this, manual_reservation.class);
        this.startActivity(i);
    }

    public void deleteButtonPressed (View v)
    {
        Intent i = new Intent(this, delete.class);
        this.startActivity(i);
    }
}
