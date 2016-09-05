package com.jiakaiyang.xdrawable.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

import com.jiakaiyang.xdrawable.base.Polygon;


/**
 * a polygon drawable
 */

public class PolygonDrawable extends Drawable {
    private Path mPath;
    private Polygon polygon;


    public PolygonDrawable(Path mPath) {
        this.mPath = mPath;
    }

    @Override
    public void draw(Canvas canvas) {
        final Rect r = getBounds();
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
}
