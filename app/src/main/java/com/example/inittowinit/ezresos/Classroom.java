package com.example.inittowinit.ezresos;

import android.util.Pair;

import java.util.*;
import java.io.*;

public class Classroom {
    public String date;
    public static int time;
    private static int classroomMax;


    public static void main(String args[]) {
        ArrayList<String> rooms = new ArrayList<String>();
        List<Pair<String, Integer>> l = new ArrayList<>();
        l.add(new Pair<String, Integer>("Some name", 100));

        //Room Types
        rooms.add("Terrace Room");
        rooms.add("Albrecht Lounge");
        rooms.add("Pharmacy 147");
        rooms.add("Bluff");
        //Times
        if (time < 0 || time > 2400) {
            System.out.println("Please enter a valid time between 0000-2400!");
        }
        //SuggestAlgo( classroomMax);
    }


}
