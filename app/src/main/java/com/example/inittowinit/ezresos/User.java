package com.example.inittowinit.ezresos;

import java.util.ArrayList;

public class User
{

    public String fname;
    public String lname;
    public String email;

    public ArrayList<Reservation> getMyReservations()
    {
        return myReservations;
    }

    public ArrayList<Reservation> myReservations;

    public String getUserID()
    {
        return userID;
    }

    public void setUserID(String userID)
    {
        this.userID = userID;
    }

    public String userID;


    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String fname, String lname, String email)
    {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }
}
