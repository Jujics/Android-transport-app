package com.example.nsiprojredo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class itinaraire extends AppCompatActivity {
    ImageButton Imagebutton;
    Button button;
    TextView textvw;
    EditText ed1;
    EditText ed2;
    TextView textvw2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinaraire);


        Imagebutton = (ImageButton) findViewById(R.id.imageButton4);
        Imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(itinaraire.this, MainActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
        button = (Button) findViewById(R.id.button2);
        ed1 =(EditText)findViewById(R.id.departsta);
        ed2 =(EditText)findViewById(R.id.arrivesta);
        textvw = (TextView)findViewById(R.id.textView6);
        textvw2 = (TextView)findViewById(R.id.textView7);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = 0;
                int i1 = 0;
                String name      =  ed1.getText().toString();
                String name2      =  ed2.getText().toString();
                if (name.equals("Theatre")){
                    i = 0;
                }
                if (name2.equals("Theatre")){
                    i1 = 0;
                }
                if (name.equals("Blanqueer")){
                    i = 1;
                }
                if (name2.equals("Blanqueer")){
                    i1 = 1;
                }
                if (name.equals("Dessante givrée")){
                    i = 4;
                }
                if (name2.equals("Dessante givrée")){
                    i1 = 4;
                }
                if (name.equals("DTC")){
                    i = 3;
                }
                if (name2.equals("DTC")){
                    i1 = 3;
                }
                if (name.equals("Coeur")){
                    i = 2;
                }
                if (name2.equals("Coeur")){
                    i1 = 2;
                }
                if (name.equals("Chateau")){
                    i = 5;
                }
                if (name2.equals("Chateau")){
                    i1 = 5;
                }
                if (name.equals("Caverne de Satan")){
                    i = 6;
                }
                if (name2.equals("Caverne de Satan")){
                    i1 = 6;
                }
                if (name.equals("Avenue des drapeaux")){
                    i = 7;
                }
                if (name2.equals("Avenue des drapeaux")){
                    i1 = 7;
                }
                if (name.equals("Port")){
                    i = 8;
                }
                if (name2.equals("Port")){
                    i1 = 8;
                }
                if (name.equals("Egarlest")){
                    i = 17;
                }
                if (name2.equals("Egarlest")){
                    i1 = 17;
                }
                if (name.equals("Sand City")){
                    i = 16;
                }
                if (name2.equals("Sand City")){
                    i1 = 16;
                }
                if (name.equals("Polnareffland")){
                    i = 15;
                }
                if (name2.equals("Polnareffland")){
                    i1 = 15;
                }
                if (name.equals("Phare")){
                    i = 13;
                }
                if (name2.equals("Phare")){
                    i1 = 13;
                }
                if (name.equals("Musée")){
                    i = 9;
                }
                if (name2.equals("Musée")){
                    i1 = 9;
                }
                if (name.equals("Licorne")){
                    i = 10;
                }
                if (name2.equals("Licorne")){
                    i1 = 10;
                }
                if (name.equals("Foret")){
                    i = 11;
                }
                if (name2.equals("Foret")){
                    i1 = 11;
                }
                if (name.equals("Trou")){
                    i = 12;
                }
                if (name2.equals("Trou")){
                    i1 = 12;
                }
                if (name.equals("Snowden")){
                    i = 21;
                }
                if (name2.equals("Snowden")){
                    i1 = 21;
                }
                if (name.equals("Aceterdam")){
                    i = 20;
                }
                if (name2.equals("Aceterdam")){
                    i1 = 20;
                }
                if (name.equals("Eaubonne")){
                    i = 19;
                }
                if (name2.equals("Eaubonne")){
                    i1 = 19;
                }
                if (name.equals("Jardin des Plantes")){
                    i = 18;
                }
                if (name2.equals("Jardin des Plantes")){
                    i1 = 18;
                }
                if (name.equals("Mocheroom")){
                    i = 25;
                }
                if (name2.equals("Mocheroom")){
                    i1 = 25;
                }
                if (name.equals("Chez Syd")){
                    i = 26;
                }
                if (name2.equals("Chez Syd")){
                    i1 = 26;
                }
                if (name.equals("Pyramide")){
                    i = 28;
                }
                if (name2.equals("Pyramide")){
                    i1 = 28;
                }
                if (name.equals("Jump Arc-En-Ciel")){
                    i = 29;
                }
                if (name2.equals("Jump Arc-En-Ciel")){
                    i1 = 29;
                }
                if (name.equals("Univercitée")){
                    i = 27;
                }
                if (name2.equals("Univercitée")){
                    i1 = 27;
                }
                if (name.equals("Bidonville")){
                    i = 24;
                }
                if (name2.equals("Bidonville")){
                    i1 = 24;
                }
                if (name.equals("Horny Jail")){
                    i = 23;
                }
                if (name2.equals("Horny Jail")){
                    i1 = 23;
                }
                if (name.equals("Parc National De la Branche")){
                    i = 22;
                }
                if (name2.equals("Parc National De la Branche")){
                    i1 = 22;
                }
                if (name.equals("Prefecture")){
                    i = 30;
                }
                if (name2.equals("Prefecture")){
                    i1 = 30;
                }
                if (name.equals("Bry gare TGV")){
                    i = 31;
                }
                if (name2.equals("Bry gare TGV")){
                    i1 = 31;
                }
                if (name.equals("Marché")){
                    i = 32;
                }
                if (name2.equals("Marché")){
                    i1 = 32;
                }
                if (name.equals("VTF sur Seine")){
                    i = 33;
                }
                if (name2.equals("VTF sur Seine")){
                    i1 = 33;
                }
                if (name.equals("Val de ta G")){
                    i = 34;
                }
                if (name2.equals("Val de ta G")){
                    i1 = 34;
                }
                if (name.equals("Trou Marché")){
                    i = 35;
                }
                if (name2.equals("Trou Marché")){
                    i1 = 35;
                }
                if (name.equals("Ecole Primaire")){
                    i = 36;
                }
                if (name2.equals("Ecole Primaire")){
                    i1 = 36;
                }
                if (name.equals("Hospital")){
                    i = 37;
                }
                if (name2.equals("Hospital")){
                    i1 = 37;
                }
                if (name.equals("Trou 55000")){
                    i = 19;
                }
                if (name2.equals("Trou 55000")){
                    i1 = 19;
                }
                if (name.equals("Haut du trou")){
                    i = 38;
                }
                if (name2.equals("Haut du trou")){
                    i1 = 38;
                }
                if (name.equals("Canal")){
                    i = 39;
                }
                if (name2.equals("Canal")){
                    i1 = 39;
                }
                if (name.equals("Manoir")){
                    i = 40;
                }
                if (name2.equals("Manoir")){
                    i1 = 40;
                }
                if (name.equals("Grand Rue")){
                    i = 41;
                }
                if (name2.equals("Grand Rue")){
                    i1 = 41;
                }
                if (name.equals("Gloomlight")){
                    i = 42;
                }
                if (name2.equals("Gloomlight")){
                    i1 = 42;
                }
                if (name.equals("Chez pierre")){
                    i = 43;
                }
                if (name2.equals("Chez pierre")){
                    i1 = 43;
                }
                if (name.equals("Floating Iles")){
                    i = 44;
                }
                if (name2.equals("Floating Iles")){
                    i1 = 44;
                }
                if (name.equals("Chez Raph")){
                    i = 45;
                }
                if (name2.equals("Chez Raph")){
                    i1 = 45;
                }
                if (name.equals("Bridge City")){
                    i = 46;
                }
                if (name2.equals("Bridge City")){
                    i1 = 46;
                }
                if (name.equals("Avenue des monuments")){
                    i = 14;
                }
                if (name2.equals("Avenue des monuments")){
                    i1 = 14;
                }
                if (name.equals("Porceville")){
                    i = 50;
                }
                if (name2.equals("Porceville")){
                    i1 = 50;
                }
                if (name.equals("Outpost")){
                    i = 49;
                }
                if (name2.equals("Outpost")){
                    i1 = 49;
                }
                if (name.equals("Suisse")){
                    i = 48;
                }
                if (name2.equals("Suisse")){
                    i1 = 48;
                }
                if (name.equals("Chez Monokis")){
                    i = 47;
                }
                if (name2.equals("Chez Monokis")){
                    i1 = 47;
                }
                if (name.equals("La baie des bois")){
                    i = 58;
                }
                if (name2.equals("La baie des bois")){
                    i1 = 58;
                }
                if (name.equals("Windenbourg central")){
                    i = 52;
                }
                if (name2.equals("Windenbourg central")){
                    i1 = 52;
                }
                if (name.equals("Lycée magique Georges Pompidou")){
                    i = 56;
                }
                if (name2.equals("Lycée magique Georges Pompidou")){
                    i1 = 56;
                }
                if (name.equals("Hollyboob")){
                    i = 57;
                }
                if (name2.equals("Hollyboob")){
                    i1 = 57;
                }
                if (name.equals("INFP Windenbourg TER")){
                    i = 51;
                }
                if (name2.equals("INFP Windenbourg TER")){
                    i1 = 51;
                }
                if (name.equals("Centre Commercial Binaire")){
                    i = 53;
                }
                if (name2.equals("Centre Commercial Binaire")){
                    i1 = 53;
                }
                if (name.equals("Casino")){
                    i = 54;
                }
                if (name2.equals("Casino")){
                    i1 = 54;
                }
                if (name.equals("Ferme")){
                    i = 55;
                }
                if (name2.equals("Ferme")){
                    i1 = 55;
                }
                if (name.equals("Musée Biomes")){
                    i = 59;
                }
                if (name2.equals("Musée Biomes")){
                    i1 = 59;
                }
                DijkstraExample functions = new DijkstraExample();
                DijkstraExample.main("test",i,i1,name2,name,textvw,textvw2);
            }
        });

    }

}