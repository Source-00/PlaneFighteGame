package com.planefightegame.ding.planefightegame.Game;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

/**
 * Bullet
 *
 * 子弹父类
 *
 * @author: DING
 * @time: 2016/1/30 22:05
 */
public class Bullet extends Base{


    protected float bulletX;
    protected float bulletY;
    protected float bulletW;
    protected float bulletH;

    /**
     * 构造函数
     *
     * @param surface
     */
    public Bullet(GameSurface surface) {
        super(surface);
    }

    public float getBulletX() {
        return bulletX;
    }

    public void setBulletX(int bulletX) {
        this.bulletX = bulletX;
    }

    public float getBulletY() {
        return bulletY;
    }

    public void setBulletY(int bulletY) {
        this.bulletY = bulletY;
    }

    public float getBulletW() {
        return bulletW;
    }

    public void setBulletW(int bulletW) {
        this.bulletW = bulletW;
    }

    public float getBulletH() {
        return bulletH;
    }

    public void setBulletH(int bulletH) {
        this.bulletH = bulletH;
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {

    }

    @Override
    public void logic() {

    }

    @Override
    public void onTouchEvent(MotionEvent event) {

    }

    @Override
    public void onKeyDown() {

    }
}
