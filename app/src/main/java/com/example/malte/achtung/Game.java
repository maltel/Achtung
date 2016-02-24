package com.example.malte.achtung;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.logging.Handler;

/**
 * Created by Malte on 17.02.2016.
 */
public class Game extends AppCompatActivity{

    private boolean gameIsDone;

    private ArrayList<Player> players;
    private GameView gw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //setup all the stuff we need

        players = new ArrayList<Player>();
        gw = (GameView) findViewById(R.id.GameView);


        Player p1 = new Player(100, 100, 1, Color.GREEN);
        Player p2 = new Player(500, 500, 1, Color.RED);
        players.add(p1);
        players.add(p2);

        gw.setPlayers(players);

        gameIsDone = false;

        run();



    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }



    public void run(){
        int a = 0;
        while(a < 100) {




            for(Player p:players) {

                p.setyPos(p.getyPos() + p.getSpeed());
                p.setxPos(p.getxPos() + p.getSpeed());
                p.addToPath(p.getxPos() + p.getSpeed(), p.getyPos() + p.getSpeed());
                //Log.d("NFID", "jfidf");
                gw.invalidate();

            }
            a++;
        }
    }





}
