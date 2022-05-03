package com.developedbyshiva.grievanceshield;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import static android.Manifest.permission.CALL_PHONE;

public class Emergency extends AppCompatActivity {
    ImageButton b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phonecall1();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phonecall2();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phonecall3();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phonecall4();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phonecall5();
            }
        });
    }

    private void phonecall5() {
        Intent i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:+91 112"));
        if (ContextCompat.checkSelfPermission(getApplicationContext(),CALL_PHONE)== PackageManager.PERMISSION_GRANTED){
            startActivity(i);
        }
        else{
            if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){

                requestPermissions(new String[]{CALL_PHONE},1);
            }
        }
    }

    private void phonecall1() {
        Intent i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:+91 108"));
        if (ContextCompat.checkSelfPermission(getApplicationContext(),CALL_PHONE)== PackageManager.PERMISSION_GRANTED){
            startActivity(i);
        }
        else{
            if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){

                requestPermissions(new String[]{CALL_PHONE},1);
            }
        }
    }

    private void phonecall2() {
        Intent i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:+91 1098"));
        if (ContextCompat.checkSelfPermission(getApplicationContext(),CALL_PHONE)== PackageManager.PERMISSION_GRANTED){
            startActivity(i);
        }
        else{
            if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){

                requestPermissions(new String[]{CALL_PHONE},1);
            }
        }
    }

    private void phonecall3() {
        Intent i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:+91 101"));
        if (ContextCompat.checkSelfPermission(getApplicationContext(),CALL_PHONE)== PackageManager.PERMISSION_GRANTED){
            startActivity(i);
        }
        else{
            if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){

                requestPermissions(new String[]{CALL_PHONE},1);
            }
        }
    }

    private void phonecall4() {
        Intent i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:+91 1090"));
        if (ContextCompat.checkSelfPermission(getApplicationContext(),CALL_PHONE)== PackageManager.PERMISSION_GRANTED){
            startActivity(i);
        }
        else{
            if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){

                requestPermissions(new String[]{CALL_PHONE},1);
            }
        }
    }
}