package com.example.inittowinit.ezresos;

public class User
{
    public String mfname;
    public String mlname;
    public String mEmail;


    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String fname, String lname, String email)
    {
        this.mfname = fname;
        this.mlname = lname;
        this.mEmail = email;

    }

    public void display()
    {
        System.out.println("***** USER *****");
        System.out.println("Fname: " + this.mfname);
        System.out.println("Lname: " + this.mlname);
    }
}
