package com.developedbyshiva.grievanceshield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Loginpage extends AppCompatActivity {
    EditText usr,pass;
    ImageButton login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        login=findViewById(R.id.loginbtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"login sucessful",Toast.LENGTH_SHORT).show();
                Intent i =new Intent(Loginpage.this,Home.class);
                Toast.makeText(getApplicationContext(),"Welcome User",Toast.LENGTH_SHORT).show();
                startActivity(i);


            }
        });


    }
}