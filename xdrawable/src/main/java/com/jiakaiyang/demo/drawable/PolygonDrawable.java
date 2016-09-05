package com.jiakaiyang.demo.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

import com.jiakaiyang.demo.base.Polygon;


/**
 * a polygon drawable
 */

public class PolygonDrawable extends Drawable {
    private Paint mPaint;
    private Path mPath;
    private Polygon polygon;


    public PolygonDrawable(Polygon polygon) {
        this.polygon = polygon;
        mPaint = new Paint();
    }

    @Override
    public void draw(Canvas canvas) {
        final Rect r = getBounds();

        float offsetX = r.left;
        float offsetY = r.top;

        this.mPath = polygon.toPath(offsetX, offsetY);

        canvas.drawPath(mPath, mPaint);
    }

    @Override
    public void setAlpha(int alpha) {

    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return 0;
    }

    public Paint getPaint() {
        return mPaint;
    }
}
