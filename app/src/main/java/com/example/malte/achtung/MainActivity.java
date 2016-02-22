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

    private ArrayList<Player> players;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setup all the stuff we need

        players = new ArrayList<Player>();


        Player p1 = new Player(100, 100, 1, Color.GREEN);
        Player p2 = new Player(500, 500, 1, Color.RED);
        players.add(p1);
        players.add(p2);



        final Button start_game_button = (Button) this.findViewById(R.id.startGameButton);
        start_game_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent game = new Intent(MainActivity.this, Game.class);
                game.putExtra("players", players);
                startActivity(game);

            }
        });



    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }





}
