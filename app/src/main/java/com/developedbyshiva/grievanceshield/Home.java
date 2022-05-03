package com.developedbyshiva.grievanceshield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {
    ImageButton b1,b2,b3,b4,b5,b6;
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        vibrator=(Vibrator)getSystemService(VIBRATOR_SERVICE);
        b1=findViewById(R.id.farm);
        b2=findViewById(R.id.swachta);
        b3=findViewById(R.id.crime);
        b4=findViewById(R.id.traffic);
        b5=findViewById(R.id.aboutus);
        b6=findViewById(R.id.emergency);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, FarmersHelp.class);
                startActivity(i);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Swachta.class);
                startActivity(i);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, CrimePolice.class);
                startActivity(i);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, TrafficPolice.class);
                startActivity(i);

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Aboutus.class);
                startActivity(i);

            }
        });




        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vib();
                Intent i = new Intent(Home.this, Emergency.class);
                startActivity(i);

            }
        });

        
    }


    public void  openurl(String url)
    {
        Uri uri=Uri.parse(url);
        Intent launchweb = new Intent (Intent.ACTION_VIEW,uri);
        startActivity(launchweb);

    }


    private void vib() {
        vibrator.vibrate(2000);
    }
}