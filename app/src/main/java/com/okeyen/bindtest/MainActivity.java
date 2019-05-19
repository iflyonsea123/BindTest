package com.okeyen.bindtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static final String TAG =  "BindTest";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int pid = android.os.Process.myPid();
        Log.d(TAG,MainActivity.class.getName()+":"+pid);
    }


    public void buttonSecondClick(View view) {
        Student.NAME="Ken";
        startActivity(new Intent(this,SecondActivity.class));
        Log.d(TAG,Student.NAME);
    }
}
