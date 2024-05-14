package com.example.nsiprojredo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Tramchateau extends AppCompatActivity {
    ImageButton Imagebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tramchateau);

        Imagebutton = (ImageButton) findViewById(R.id.imageButton4);
        Imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Tramchateau.this, map.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}