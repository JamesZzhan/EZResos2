package com.example.inittowinit.ezresos;

public class TerraceRoom {
    public int maxPersons;
    public String availability;
    public int userID;


    public TerraceRoom() {
        // Default constructor required for calls to DataSnapshot.getValue(TerraceRoom.class)
    }

    public TerraceRoom(int useID, int maxPer, String avail)
    {
        this.maxPersons = maxPer;
        this.availability = avail;
        this.userID = useID;


    }

    public void display()
    {
        System.out.println("***** USER *****");
        System.out.println("Max Persons: " + this.maxPersons);
        System.out.println("Availability: " + this.availability);
        System.out.println("Student/Faculty ID: " + this.userID);
    }
}
