package com.example.inittowinit.ezresos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity
{

    private EditText fnameET;
    private EditText lnameET;
    private EditText emailET;

    private String fname;
    private String lname;
    private String email;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference usersRef = database.getReference("users");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.fnameET = (EditText)this.findViewById(R.id.fnameTextBox);
        this.lnameET = (EditText)this.findViewById(R.id.lnameTextBox);
        this.emailET = (EditText)this.findViewById(R.id.emailTextBox);


    }

    public void continueAsGuestButtonPressed(View v)
    {
        this.fname = this.fnameET.getText().toString();
        this.lname = this.lnameET.getText().toString();
        this.email = this.emailET.getText().toString();

        if (fname != null && lname != null && email != null)
        {
            createUser(fname, lname, email);
            loadHomePage();
        }
    }

    public void createUser(String fname, String lname, String email)
    {
        DatabaseReference tempUser = usersRef.push();
        User currUser = new User(fname, lname, email);
        tempUser.setValue(currUser);
    }

    public void loadHomePage()
    {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}
