package com.planefightegame.ding.planefightegame.Game;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.view.MotionEvent;

import com.planefightegame.ding.planefightegame.R;

/**
 * PlayerPlane
 * 定义一个飞机玩家
 *
 * @author: DING
 * @time: 2016/1/30 21:27
 */
public class PlayerPlane extends Plane{


    private PlayerBullet[] playerBullet;
    int i=0;

    /**
     * @param surface
     */
    public PlayerPlane(GameSurface surface) {
        super(surface);
        planeX=screenW/2-planeImaWidth/2;
        planeY=screenH*4/5;
        planeImaWidth=50;
        planeImaHeight=60;
        playerBullet=new PlayerBullet[100];



    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        paint.setColor(Color.BLUE);
        canvas.drawRect(planeX, planeY, planeX + planeImaWidth, planeY + planeImaHeight, paint);
        playerBullet[i].draw(canvas,paint);


    }

    @Override
    public void logic() {
        super.logic();
        playerBullet[i].logic();
        i++;

    }

    @Override
    public void onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
    }
}
