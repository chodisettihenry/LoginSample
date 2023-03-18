package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText Lastname;
    EditText email;
    EditText phoneNumber;

    Button send;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Lastname=findViewById(R.id.edittextLastName);
        email=findViewById(R.id.editViewEmail);
        phoneNumber=findViewById(R.id.editTextPhone);

        send=findViewById(R.id.buttonsend);




        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userLastname = Lastname.getText().toString();
                String userEmail=email.getText().toString();
                int userPhone=Integer.valueOf(phoneNumber.getText().toString());

                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("lastname",userLastname);
                i.putExtra("email",userEmail);
                i.putExtra("phonenumber",userPhone);
                startActivity(i);
                
            }
        });



    }
}