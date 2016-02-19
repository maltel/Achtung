package com.example.malte.achtung;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
        players = (ArrayList<Player>) getIntent().getSerializableExtra("players");
        gw = new GameView(this, players);
        setContentView(gw);

        //setup all the stuff we need

        gameIsDone = false;

        //run();



    }



    public void run(){
        while(!gameIsDone) {
            for(Player p:players) {

                p.setyPos(p.getyPos() + p.getSpeed());
                p.setxPos(p.getxPos() + p.getSpeed());
                //Log.d("NFID", "jfidf");
                gw.invalidate();
            }
        }
    }





}
