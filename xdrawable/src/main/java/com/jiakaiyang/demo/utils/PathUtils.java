package com.jiakaiyang.demo.utils;

import android.graphics.Path;

import com.jiakaiyang.demo.base.Point;
import com.jiakaiyang.demo.base.Polygon;

/**
 * Created by jia on 16/9/5.
 */

public class PathUtils {

    public static Path convertPolygonToPath(Polygon polygon){
        Path path = new Path();
        boolean hasMove = false;

        for(Point point : polygon.getmPoints()){
            if(!hasMove){
                path.moveTo(point.getX(), point.getY());
                hasMove = true;
            }

            path.lineTo(point.getX(), point.getY());
        }

        return path;
    }
}
