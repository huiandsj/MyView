package com.reyzar.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class DrawView2 extends View {

    Paint paint=new Paint();
    public DrawView2(Context context) {
        super(context);
    }

    public DrawView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.BLACK);
        canvas.drawRect(50,100,200,200,paint);
    }
}
