package com.example.neerajdeshpande.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;

import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void popularMoviesToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Popular Movies application";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


    public void stockHawkToast(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Stock Hawk application";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }


    public void buildItBigger(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Build It Bigger application";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


    public void makeYourAppMaterial(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Make Your App Material application";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


    public void goUbiquitous(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Go Ubiquitous application";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    public void capstone(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Capstone application";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }




}
