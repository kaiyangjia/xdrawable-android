package com.jiakaiyang.demo.xdrawable;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.jiakaiyang.demo.base.Polygon;
import com.jiakaiyang.demo.drawable.PolygonDrawable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testPolygonDrawable();
    }

    private void testPolygonDrawable(){
        Polygon polygon = Polygon.fromXML(this, R.xml.test_polygon);
        PolygonDrawable polygonDrawable = new PolygonDrawable(polygon);

        Paint paint = polygonDrawable.getPaint();
        paint.setStyle(Paint.Style.STROKE);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setImageDrawable(polygonDrawable);
    }
}
