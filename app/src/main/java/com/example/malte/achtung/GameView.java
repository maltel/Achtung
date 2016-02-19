package com.example.malte.achtung;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Malte on 18.02.2016.
 */
public class GameView extends View {

    Paint paint = new Paint();
    ArrayList<Player> players;

    public GameView(Context context, ArrayList<Player> players) {
        super(context);
        this.players = players;

    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.FILL);
        for(Player p:players) {
            //Log.d("NFID", "jfidf");
            paint.setColor(p.getColor());
            canvas.drawCircle(p.getxPos(), p.getyPos(), 10, paint);
        }
    }

}
