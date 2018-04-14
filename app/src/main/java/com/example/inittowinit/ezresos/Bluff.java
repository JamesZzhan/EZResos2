package com.example.inittowinit.ezresos;

public class Bluff {
    public int maxPersons;
    public String availability;
    public int userID;


    public Bluff() {
        // Default constructor required for calls to DataSnapshot.getValue(TerraceRoom.class)
    }

    public Bluff(int useID, int maxPer, String avail)
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
