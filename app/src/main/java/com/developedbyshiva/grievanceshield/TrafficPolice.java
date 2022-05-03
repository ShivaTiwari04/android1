package com.developedbyshiva.grievanceshield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class TrafficPolice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic_police);
    }

    public void  trafficpolice (View view)
    {
        openurl("http://traffic.uppolice.gov.in/");
    }
    public void  echallan (View view)
    {
        openurl("https://parivahan.gov.in/parivahan//en/content/implemented-e-challan-mobile-app");
    }
    public void  vehchileser (View view)
    {
        openurl("https://parivahan.gov.in/parivahan//en/content/vehicle-related-services");
    }
    public void  downloadtrafficapp (View view)
    {
        openurl("https://play.google.com/store/apps/details?id=com.pspl.uptrafficpoliceapp&hl=en_IN");
    }
    public void  openurl(String url)
    {
        Uri uri=Uri.parse(url);
        Intent launchweb = new Intent (Intent.ACTION_VIEW,uri);
        startActivity(launchweb);

    }
}