package com.example.inittowinit.ezresos;

public class Reservation
{
    public String reserveDate;
    public String startTime;
    public String classSize;
    public User registeredUser;

    public Reservation()
    {
        //default constructor
    }

    public Reservation(String reserveDate, String startTime, String classSize, User registeredUser)
    {
        this.reserveDate = reserveDate;
        this.startTime = startTime;
        this.classSize = classSize;
        this.registeredUser = registeredUser;
    }
}
