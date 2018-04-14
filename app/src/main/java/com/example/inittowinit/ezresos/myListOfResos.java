package com.example.inittowinit.ezresos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class myListOfResos extends AppCompatActivity
{
    private ListView myReservationList;
    private myListOfResos rList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list_of_resos);
        Reservation.currentReservations.clear();
        this.rList = this;
        setContentView(R.layout.activity_my_list_of_resos);

        this.myReservationList = (ListView)this.findViewById(R.id.myResosList);
        this.myReservationList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(rList, delete.class);
                Reservation.selectedReservation = Reservation.currentReservations.get(position);
                rList.startActivity(i);
            }
        });

        final ArrayAdapter<Reservation> adapter = new ArrayAdapter<Reservation>(this, android.R.layout.simple_list_item_1,Reservation.currentReservations);
        this.myReservationList.setAdapter(adapter);

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child("questions");
        ValueEventListener questionListener = new ValueEventListener()
        {
            @Override

            public void onDataChange(DataSnapshot dataSnapshot) {
                // Get Post object and use the values to update the UI


                for(DataSnapshot aClass : dataSnapshot.getChildren())
                {
                    for(DataSnapshot aReservation: aClass.getChildren())
                    {

                       // Reservation temp = new Reservation(aReservation.child("Room").getValue().toString(), aReservation.child("Date").getValue().toString(), aReservation.child("Time").getValue().toString());
                        //temp.setKey(aReservation.getKey().toString());
                        //if()
                    }
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };
        mDatabase.addValueEventListener(questionListener);

    }
}
