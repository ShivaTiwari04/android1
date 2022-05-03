package com.developedbyshiva.grievanceshield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Developer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
    }
    public void  fb (View view)
    {
        openurl("https://www.facebook.com/profile.php?id=100038985144114");
    }
    public void  insta (View view)
    {
        openurl("https://twitter.com/shivati63365381");
    }
    public void  twitter (View view)
    {
        openurl("https://www.instagram.com/shivatiwari9211/");
    }
    public void  openurl(String url)
    {
        Uri uri=Uri.parse(url);
        Intent launchweb = new Intent (Intent.ACTION_VIEW,uri);
        startActivity(launchweb);

    }
}