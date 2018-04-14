package com.example.inittowinit.ezresos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserInfo extends AppCompatActivity {
    private TextView studentIDTV;
    private EditText studentIDET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);


    }
}
