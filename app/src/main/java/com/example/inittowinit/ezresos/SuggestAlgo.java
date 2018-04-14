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

    public SuggestAlgo(String data, String startTime, int numStudents)
    {
        for(int i = 0; i <= Classroom.allClassrooms.size(); i++)
        {
            if(numStudents <= Classroom.allClassrooms.get(i).roomSize)
            {
                System.out.println(Classroom.allClassrooms.get(i).location);
            }
        }
    }
}
