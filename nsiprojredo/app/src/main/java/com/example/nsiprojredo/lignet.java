package com.example.nsiprojredo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class lignet extends AppCompatActivity {
    ImageButton Imagebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lignet);

        Imagebutton = (ImageButton) findViewById(R.id.imageButton4);
        Imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(lignet.this, map.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}