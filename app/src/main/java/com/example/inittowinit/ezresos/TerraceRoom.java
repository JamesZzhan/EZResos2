package com.example.inittowinit.ezresos;

public class TerraceRoom {
    public int maxPersons;
    public String availability;
    public int studentID;


    public TerraceRoom() {
        // Default constructor required for calls to DataSnapshot.getValue(TerraceRoom.class)
    }

    public TerraceRoom(int studID, int maxPer, String avail)
    {
        this.maxPersons = maxPer;
        this.availability = avail;
        this.studentID = studID;


    }

    public void display()
    {
        System.out.println("***** USER *****");
        System.out.println("Fname: " + this.mfname);
        System.out.println("Lname: " + this.mlname);
    }
}
