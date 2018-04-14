package com.example.inittowinit.ezresos;

import android.util.Pair;

import java.util.*;
import java.io.*;

public class Classroom
{
    public String location;
    public int roomSize;

    public Classroom()
    {
        //Basic constructor
    }

    public Classroom(String location, int roomSize)
    {
        this.location = location;
        this.roomSize = roomSize;
    }

}
