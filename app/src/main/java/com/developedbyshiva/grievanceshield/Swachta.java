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

public class Swachta extends AppCompatActivity {
    ImageButton b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swachta);
        b1=findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phonecall();

            }
        });
    }

    private void phonecall() {
        Intent i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:+91 1969"));
        if (ContextCompat.checkSelfPermission(getApplicationContext(),CALL_PHONE)== PackageManager.PERMISSION_GRANTED){
            startActivity(i);
        }
        else{
            if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){

                requestPermissions(new String[]{CALL_PHONE},1);
            }
        }
    }

    public void  swachtasite (View view)
    {
        openurl("https://swachhbharat.mygov.in/");
    }
    public void  takepledge (View view)
    {
        openurl("https://swachhbharat.mygov.in/basic-page/take-pledge");
    }
    public void  downloadswachtaapp (View view)
    {
        openurl("https://play.google.com/store/apps/details?id=com.ichangemycity.swachhbharat&hl=en_IN");
    }

    public void  openurl(String url)
    {
        Uri uri=Uri.parse(url);
        Intent launchweb = new Intent (Intent.ACTION_VIEW,uri);
        startActivity(launchweb);

    }
}