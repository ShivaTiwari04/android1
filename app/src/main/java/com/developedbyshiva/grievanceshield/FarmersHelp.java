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

public class FarmersHelp extends AppCompatActivity {
    ImageButton b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmers_help);

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
        i.setData(Uri.parse("tel:+91 18001801551"));
        if (ContextCompat.checkSelfPermission(getApplicationContext(),CALL_PHONE)== PackageManager.PERMISSION_GRANTED){
            startActivity(i);
        }
        else{
            if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){

                requestPermissions(new String[]{CALL_PHONE},1);
            }
        }
    }

    public void  farmerportal (View view)
    {
        openurl("https://farmer.gov.in/ecitizen.aspx");
    }
    public void  grievance (View view)
    {
        openurl("https://icar.org.in/node/1922");
    }
    public void  mkissan (View view)
    {
        openurl("https://mkisan.gov.in/");
    }
    public void  schemeinfo (View view)
    {
        openurl("http://dare.nic.in/");
    }
    public void  weather (View view)
    {
        openurl("https://farmer.gov.in/WeatherReport/weatherreport.aspx");
    }
    public void  downloadfarmapp (View view)
    {
        openurl("https://play.google.com/store/apps/details?id=in.cdac.bharatd.agriapp&hl=en");
    }
    public void  openurl(String url)
    {
        Uri uri=Uri.parse(url);
        Intent launchweb = new Intent (Intent.ACTION_VIEW,uri);
        startActivity(launchweb);

    }
}