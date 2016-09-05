package com.jiakaiyang.demo.base;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Path;

import com.jiakaiyang.demo.utils.UnitUtils;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jia on 16/9/5.
 */

public class Polygon {
    private List<Point> mPoints;

    public List<Point> getmPoints() {
        return mPoints;
    }

    public void setmPoints(List<Point> mPoints) {
        this.mPoints = mPoints;
    }


    public static Polygon fromXML(Context context, int resId){
        XmlResourceParser xmlResourceParser = context.getResources().getXml(resId);
        Polygon polygon = new Polygon();
        List<Point> list = new ArrayList<>();

        try {
            int event = xmlResourceParser.getEventType();
            while (event != XmlPullParser.END_DOCUMENT){
                switch (event){
                    case XmlResourceParser.START_DOCUMENT:

                        break;
                    case XmlResourceParser.START_TAG:
                        if("point".equals(xmlResourceParser.getName())){
                            Point point = new Point();
                            float dpX = Float.parseFloat(xmlResourceParser.getAttributeValue(0));
                            point.setX(UnitUtils.dp2px(context, dpX));

                            float dpY = Float.parseFloat(xmlResourceParser.getAttributeValue(1));
                            point.setY(UnitUtils.dp2px(context, dpY));
                            list.add(point);
                        }
                        break;
                    case XmlResourceParser.END_TAG:
                        break;
                }

                event = xmlResourceParser.next();
            }

            polygon.setmPoints(list);
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return polygon;
    }


    public Path toPath(float offsetX, float offsetY){
        Path path = new Path();
        boolean isFirst = true;
        Point pointFirst = null;
        for(Point point : mPoints){
            float x = point.getX() + offsetX;
            float y = point.getY() + offsetY;
            if(isFirst){
                path.moveTo(x, y);
                pointFirst = point;
                isFirst = false;
            }else {
                path.lineTo(x, y);
            }
        }

        //最后一个点和第一个点相连
        if(pointFirst != null){
            path.lineTo(pointFirst.getX() + offsetX, pointFirst.getY() + offsetY);
        }
        return path;
    }
}
