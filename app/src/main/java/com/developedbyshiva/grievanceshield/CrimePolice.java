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

public class CrimePolice extends AppCompatActivity {
    ImageButton b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime_police);

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
        i.setData(Uri.parse("tel:+91 100"));
        if (ContextCompat.checkSelfPermission(getApplicationContext(),CALL_PHONE)== PackageManager.PERMISSION_GRANTED){
            startActivity(i);
        }
        else{
            if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){

                requestPermissions(new String[]{CALL_PHONE},1);
            }
        }
    }

    public void  missingperson (View view)
    {
        openurl("https://www.uppolice.gov.in/article/en/missing-person?cd=NAAzADcAMwA%3D");
    }
    public void  childsafety (View view)
    {
        openurl("https://www.childlineindia.org/?gclid=EAIaIQobChMIzPuXlceH7AIV9MEWBR31wgfBEAAYASAAEgID3fD_BwE");
    }
    public void  womensafety (View view)
    {
        openurl("https://wpl1090up.in/");
    }
    public void  uppolice (View view)
    {
        openurl("http://up100.uppolice.gov.in/hi/Pages/Home.aspx");
    }
    public void  downloadpoliceapp (View view)
    {
        openurl("https://play.google.com/store/apps/details?id=uttarpradesh.citizen.app&hl=en_IN");
    }
    public void  openurl(String url)
    {
        Uri uri=Uri.parse(url);
        Intent launchweb = new Intent (Intent.ACTION_VIEW,uri);
        startActivity(launchweb);

    }
}