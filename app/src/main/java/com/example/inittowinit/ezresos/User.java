package com.example.inittowinit.ezresos;

public class User
{

    public String fname;
    public String lname;
    public String email;


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
