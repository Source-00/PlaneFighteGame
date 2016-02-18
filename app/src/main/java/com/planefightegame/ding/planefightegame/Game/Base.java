package com.planefightegame.ding.planefightegame.Game;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

/**
 * Base
 *
 * @author: DING
 * @time: 2016/1/30 21:51
 *
 *
 */
public abstract class Base {
    protected GameSurface surface;
    Resources res;

    /**
     * 当前屏幕宽
     */
    protected int screenW;
    /**
     * 当前屏幕高
     */
    protected int screenH;

    /**
     * 构造函数
     * @param surface
     */

    public Base(GameSurface surface){
        this.surface=surface;

        this.screenW=surface.getWidth();
        this.screenH=surface.getHeight();
    }
    /**
     * 画图
     * @param canvas 画布
     * @param paint  画笔
     */
    public abstract  void draw(Canvas canvas,Paint paint);

    /**
     * 逻辑
     */
    public abstract void logic();

    /**
     * 触摸事件
     * @param event
     */

    public abstract void onTouchEvent(MotionEvent event);

    /**
     * 按键点击事件
     */
    public abstract void onKeyDown();
}
