package com.example.malte.achtung;

import android.graphics.Color;

/**
 * Created by Malte on 17.02.2016.
 */
public class Player implements java.io.Serializable {

    private int xPos, yPos, speed, color;

    public Player(int xPos, int yPos, int speed, int color) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.speed = speed;
        this.color = color;
    }

    public int getColor() {
        return this.color;
    }
    public int getxPos(){
        return this.xPos;
    }
    public int getyPos(){
        return this.yPos;
    }
    public int getSpeed(){
        return this.speed;
    }


    public void setxPos(int xPos){
        this.xPos = xPos;
    }

    public void setyPos(int yPos){
        this.yPos = yPos;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }




}
