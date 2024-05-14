package com.example.nsiprojredo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton Imagebutton;
    ImageButton Imagebutton1;
    ImageButton Imagebutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Imagebutton = (ImageButton) findViewById(R.id.imageButton2);
        Imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, settings.class);
                startActivity(intentLoadNewActivity);
            }
        });
        Imagebutton1 = (ImageButton) findViewById(R.id.imageButton);
        Imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, map.class);
                startActivity(intentLoadNewActivity);
            }
        });
        Imagebutton2 = (ImageButton) findViewById(R.id.imageButton3);
        Imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, itinaraire.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
