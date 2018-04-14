package com.example.inittowinit.ezresos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


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

        usersRef.addValueEventListener(new ValueEventListener()
        {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                System.out.println(dataSnapshot.toString());
                for(DataSnapshot child : dataSnapshot.getChildren())
                {
                    User value = child.getValue(User.class);
                    value.display();
                }

            }

            @Override
            public void onCancelled(DatabaseError error)
            {
                // Failed to read value
                System.out.println("********* Failed to read value. " + error.toException());
            }
        });
    }

    public void continueAsGuestButtonPressed(View v)
    {
        this.fname = this.fnameET.getText().toString();
        this.lname = this.lnameET.getText().toString();
        this.email = this.emailET.getText().toString();

        if (fname != null && lname != null && email != null)
        {
            createUser(fname, lname, email);
        }
    }

    public void createUser(String fname, String lname, String email)
    {
        DatabaseReference tempUser = usersRef.push();
        User usr = new User(fname, lname, email);
        tempUser.setValue(usr);
    }
}
