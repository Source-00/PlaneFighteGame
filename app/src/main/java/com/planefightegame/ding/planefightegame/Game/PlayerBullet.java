package com.planefightegame.ding.planefightegame.Game;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;

/**
 * PlayerBullet
 *
 * @author: DING
 * @time: 2016/2/18 15:02
 */
public class PlayerBullet extends Bullet{
    public PlayerBullet(GameSurface surface,Plane plane) {
        super(surface);
        bulletX=plane.getPlaneX();
        bulletY=plane.getPlaneY()-10;
        bulletW=8;
        bulletH=20;
    }


    @Override
    public void draw(Canvas canvas, Paint paint) {
        super.draw(canvas, paint);
        paint.setColor(Color.RED);

        canvas.drawRect(bulletX, bulletY, bulletX + bulletW, bulletY + bulletH, paint);
        canvas.drawRect(bulletX+20,bulletY,bulletX+20+bulletW,bulletY+bulletH,paint);

    }

    @Override
    public void logic() {
        super.logic();
        bulletY-=20;
    }

    @Override
    public void onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
    }
}
