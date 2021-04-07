package com.example.assignment_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void urdu(View view) {
        Intent intent=new Intent(this, UrduPlay.class);
        startActivity(intent);
    }

    public void abc(View view) {
        Intent intent=new Intent(this, AbcPlay.class);
        startActivity(intent);
    }

    public void counting(View view) {
        Intent intent=new Intent(this, countingPlay.class);
        startActivity(intent);
    }

    public void poem(View view) {
        Intent intent = new Intent(this,poemplay.class);
        startActivity(intent);
    }


}