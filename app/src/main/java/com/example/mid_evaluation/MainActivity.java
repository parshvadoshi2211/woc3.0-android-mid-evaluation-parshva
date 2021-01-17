package com.example.mid_evaluation;

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

    public void Montable(View view)
    {
        Intent intent = new Intent(this,monActivity.class);
        startActivity(intent);
    }

    public void Tuetable(View view)
    {
        Intent intent = new Intent(this,tueActivity.class);
        startActivity(intent);
    }
    public void Wedtable(View view)
    {
        Intent intent = new Intent(this,wedActivity.class);
        startActivity(intent);
    }
    public void Thutable(View view)
    {
        Intent intent = new Intent(this,thuActivity.class);
        startActivity(intent);
    }
    public void Fritable(View view)
    {
        Intent intent = new Intent(this,friActivity.class);
        startActivity(intent);
    }
    public void Sattable(View view)
    {
        Intent intent = new Intent(this,satActivity.class);
        startActivity(intent);
    }
}