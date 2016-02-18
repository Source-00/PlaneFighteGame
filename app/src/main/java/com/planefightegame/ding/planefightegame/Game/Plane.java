package com.planefightegame.ding.planefightegame.Game;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.Image;
import android.view.MotionEvent;
import android.widget.ImageView;

import com.planefightegame.ding.planefightegame.R;

/**
 * Plane
 *
 * @author: DING
 * @time: 2016/1/30 21:47
 */
public abstract class Plane extends Base{
    protected ImageView PlaneImage;//飞机图片
    protected float planeX;//飞机位置X
    protected float planeY;//飞机位置Y
    protected float planeImaWidth;//飞机照片的宽度
    protected float planeImaHeight;//飞机照片的高度

    /**
     * 构造函数
     *
     * @param surface
     */
    public Plane(GameSurface surface) {
        super(surface);
    }

    public float getPlaneY() {
        return planeY;
    }

    public void setPlaneY(float planeY) {
        this.planeY = planeY;
    }

    public float getPlaneX() {
        return planeX;
    }

    public void setPlaneX(float planeX) {
        this.planeX = planeX;
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        paint.setColor(Color.BLUE);
        canvas.drawRect(planeX,planeY,planeX+planeImaWidth,planeY+planeImaHeight,paint);

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
