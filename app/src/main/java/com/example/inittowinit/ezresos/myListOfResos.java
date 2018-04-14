/*package com.example.inittowinit.ezresos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
                //Reservation.selectedReservation = Reservation.currentReservation.get(position);
                rList.startActivity(i);
            }
        });

        final ArrayAdapter<Question> adapter = new ArrayAdapter<Question>(this, android.R.layout.simple_list_item_1,Core.theQuestions);
        this.theQuestionList.setAdapter(adapter);

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child("questions");
        ValueEventListener questionListener = new ValueEventListener() {
            @Override

            public void onDataChange(DataSnapshot dataSnapshot) {
                // Get Post object and use the values to update the UI


                for(DataSnapshot aClass : dataSnapshot.getChildren())
                {
                    for(DataSnapshot aQuestion: aClass.getChildren())
                    {
                        System.out.println("*******************" + aQuestion.toString());
                        System.out.println(aQuestion.child("title").getValue() + " " + aQuestion.child("question").getValue() + " " + aQuestion.child("course").getValue());
                        Question temp = new Question(aQuestion.child("title").getValue().toString(), aQuestion.child("question").getValue().toString(), aQuestion.child("course").getValue().toString());
                        temp.setKey(aQuestion.getKey().toString());
                        Core.theQuestions.add(temp);
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
*/