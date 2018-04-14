package com.example.inittowinit.ezresos;

import android.app.DownloadManager;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SuggestAlgo
{
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reservationsRef = database.getReference("reservation");

    public Reservation currRes;

    public SuggestAlgo()
    {
        //basic constructor
    }

    public SuggestAlgo(Classroom room, String date, int startTime, int numOfStudents, int classroomMax, User currUser)
    {
        if(Reservation.currentReservations.contains(room))
        {
                if (numOfStudents <= classroomMax)
                {
                    DatabaseReference tempRes = reservationsRef.push();
                    currRes = new Reservation(room, date, startTime, numOfStudents, currUser);
                    tempRes.setValue(currRes);
                    Reservation.currentReservations.add(currRes);
                    User.myReservations.add(currRes);
                }
        }
    }
}
