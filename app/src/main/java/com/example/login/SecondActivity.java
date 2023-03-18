package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView lname,emaildata,phone;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        lname=findViewById(R.id.textViewlname);
        emaildata=findViewById(R.id.textViewemail);
        phone=findViewById(R.id.textViewphonedata);


        Intent i = getIntent();
        String takeLastname=i.getStringExtra("lastname");
        String takeEmail=i.getStringExtra("email");
        int takePhonenumber=i.getIntExtra("phonenumber",0);


        lname.setText("Hello "+takeLastname);
        emaildata.setText("your email "+takeEmail);
        phone.setText("your number "+takePhonenumber);



    }
}