package com.example.inittowinit.ezresos;

import java.util.ArrayList;

public class Reservation
{
    private Classroom room;
    private String reserveDate;
    private int startTime;
    private User registeredUser;
    private String key;



    public static Reservation selectedReservation = null;
    public static ArrayList<Reservation> currentReservations = new ArrayList<Reservation>();

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

    public void setKey(String key)
    {
        this.key = key;
    }

    public String getKey()
    {
        return key;
    }

    public Classroom getRoom() {
        return room;
    }

    public void setRoom(Classroom room) {
        this.room = room;
    }

    public String getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(String reserveDate) {
        this.reserveDate = reserveDate;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public User getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(User registeredUser) {
        this.registeredUser = registeredUser;
    }
}
