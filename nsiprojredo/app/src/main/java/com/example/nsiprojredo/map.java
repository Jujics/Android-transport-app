package com.example.nsiprojredo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class map extends AppCompatActivity {
    ImageButton Imagebutton;
    Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Imagebutton = (ImageButton) findViewById(R.id.imageButton4);
        Imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(map.this, MainActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
        button =(Button)findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(map.this,LigneA.class);
                startActivity(intent);
            }
        });
        button1 =(Button)findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(map.this,ligneb.class);
                startActivity(intent);
            }
        });
        button2 =(Button)findViewById(R.id.button9);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(map.this,LigneC.class);
                startActivity(intent);
            }
        });
        button3 =(Button)findViewById(R.id.button11);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(map.this,Ligned.class);
                startActivity(intent);
            }
        });
        button4 =(Button)findViewById(R.id.button12);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(map.this,Lignee.class);
                startActivity(intent);
            }
        });
        button5 =(Button)findViewById(R.id.button13);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(map.this,Lignev.class);
                startActivity(intent);
            }
        });
        button6 =(Button)findViewById(R.id.button14);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(map.this,lignep.class);
                startActivity(intent);
            }
        });
        button7 =(Button)findViewById(R.id.button15);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(map.this,lignet.class);
                startActivity(intent);
            }
        });
        button8 =(Button)findViewById(R.id.button02);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(map.this,Ligneo.class);
                startActivity(intent);
            }
        });
        button9 =(Button)findViewById(R.id.button17);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(map.this,ter1.class);
                startActivity(intent);
            }
        });
        button10 =(Button)findViewById(R.id.button18);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(map.this,ter2.class);
                startActivity(intent);
            }
        });
        button11 =(Button)findViewById(R.id.button19);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(map.this,tgv.class);
                startActivity(intent);
            }
        });
        button12 =(Button)findViewById(R.id.button20);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(map.this,tramtrou.class);
                startActivity(intent);
            }
        });
        button13 =(Button)findViewById(R.id.button21);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(map.this,tramegarles.class);
                startActivity(intent);
            }
        });
        button14 =(Button)findViewById(R.id.button22);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(map.this,Tramchateau.class);
                startActivity(intent);
            }
        });
    }
}