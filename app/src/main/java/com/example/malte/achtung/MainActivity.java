package com.example.malte.achtung;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.graphics.Color;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setup all the stuff we need



        final Button single_player_button = (Button) this.findViewById(R.id.singleplayerButton);
        single_player_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent game = new Intent(MainActivity.this, Game.class);
                startActivity(game);

            }
        });

        final Button multi_player_button = (Button) this.findViewById(R.id.multiplayerButton);
        multi_player_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent game = new Intent(MainActivity.this, Game.class);
                startActivity(game);

            }
        });



    }






}
