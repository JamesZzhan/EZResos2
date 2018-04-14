package com.example.inittowinit.ezresos;

public class TerraceRoom {
    public String maxPersons;
    public String availability;
    public String mEmail;


    public TerraceRoom() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public TerraceRoom(String fname, String lname, String email)
    {
        this.maxPersons = fname;
        this.availability = lname;
        this.mEmail = email;

    }

    public void display()
    {
        System.out.println("***** USER *****");
        System.out.println("Fname: " + this.mfname);
        System.out.println("Lname: " + this.mlname);
    }
}
