package com.example.inittowinit.ezresos;

import java.util.ArrayList;

public class Reservation
{
    public Classroom room;
    public String reserveDate;
    public int startTime;
    public User registeredUser;

    public static ArrayList<Reservation> currentReservations = new ArrayList<>();

    public Reservation()
    {
        //default constructor
    }

    public Reservation(Classroom room, String reserveDate, int startTime, int classSize, User registeredUser)
    {
        this.room = room;
        this.reserveDate = reserveDate;
        this.startTime = startTime;
        this.registeredUser = registeredUser;
    }
}
