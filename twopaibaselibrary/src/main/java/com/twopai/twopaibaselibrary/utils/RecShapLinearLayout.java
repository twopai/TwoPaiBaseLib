package com.twopai.twopaibaselibrary.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/**
 * 作者：twopai on 2017/11/16.
 * 邮箱：twopai@hotmail.com
 */

public class RecShapLinearLayout extends View {
    private Paint mRSLPaint;
    private int mRSLColor= Color.argb(255,40,39,39);
    private int mRSLWidth;
    private int mRSLHeight;
    private int mRSLLeft;
    private Path path;

    public RecShapLinearLayout(Context context) {
        this(context,null);
    }

    public RecShapLinearLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public RecShapLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mRSLPaint = new Paint();
        mRSLPaint.setAntiAlias(true);
        mRSLPaint.setStrokeWidth(3);
        mRSLPaint.setColor(mRSLColor);
        mRSLPaint.setStrokeCap(Paint.Cap.ROUND);
        mRSLPaint.setStyle(Paint.Style.FILL);
        mRSLLeft =dp2px(20);
        path = new Path();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        mRSLWidth=getMeasuredWidth();
        mRSLHeight=getMeasuredHeight();
        Log.e("RecShapeL","width="+mRSLWidth+",height="+mRSLHeight);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
//        mRSLWidth =w;
//        mRSLHeight =h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        path.reset();
        path.moveTo(0,mRSLHeight/2);
        path.lineTo(mRSLLeft,0);
        path.lineTo(mRSLWidth-mRSLLeft,0);
        path.lineTo(mRSLWidth,mRSLHeight/2);
        path.lineTo(mRSLWidth-mRSLLeft,mRSLHeight);
        path.lineTo(mRSLLeft,mRSLHeight);
        canvas.drawPath(path,mRSLPaint);

    }
    public int dp2px(int dp){
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,dp,getResources().getDisplayMetrics());
    }

}
