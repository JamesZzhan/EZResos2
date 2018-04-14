package com.example.inittowinit.ezresos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class myListOfResos extends AppCompatActivity {
    private ListView myReservationList;
    private myListOfResos rList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list_of_resos);
        Reservation.currentReservations.clear();
        this.rList = this;
        setContentView(R.layout.activity_my_list_of_resos);

        this.myReservationList = (ListView) this.findViewById(R.id.myResosList);
        this.myReservationList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(rList, delete.class);
                //Reservation.selectedReservation = Reservation.currentReservation.get(position);
                rList.startActivity(i);
            }
        });


    }
}
