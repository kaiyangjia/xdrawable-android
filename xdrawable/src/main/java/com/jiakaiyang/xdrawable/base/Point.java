package com.jiakaiyang.xdrawable.base;

/**
 * Created by jia on 16/9/5.
 */

public class Point {
    //相对坐标
    private float relaX;
    private float relaY;

    //绝对坐标
    private float X;
    private float Y;


    public float getRelaX() {
        return relaX;
    }

    public void setRelaX(float relaX) {
        this.relaX = relaX;
    }

    public float getRelaY() {
        return relaY;
    }

    public void setRelaY(float relaY) {
        this.relaY = relaY;
    }

    public float getX() {
        return X;
    }

    public void setX(float x) {
        X = x;
    }

    public float getY() {
        return Y;
    }

    public void setY(float y) {
        Y = y;
    }
}
