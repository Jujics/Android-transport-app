package com.example.nsiprojredo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class settings extends AppCompatActivity {
    ImageButton Imagebutton;
    Button button;
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Imagebutton = (ImageButton) findViewById(R.id.imageButton4);
        Imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(settings.this, MainActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
        button =(Button)findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(settings.this,Credit.class);
                startActivity(intent);
            }
        });
        button1 =(Button)findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(settings.this,conditions.class);
                startActivity(intent);
            }
        });

    }
}