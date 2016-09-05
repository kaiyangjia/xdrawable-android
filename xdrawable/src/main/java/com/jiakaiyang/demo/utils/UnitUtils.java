package com.jiakaiyang.demo.utils;

import android.content.Context;

/**
 * Created by jia on 16/9/5.
 */

public class UnitUtils {

    public static float dp2px(Context context, float dpValue){
        float density = context.getResources().getDisplayMetrics().density;
        return dpValue * density;
    }


    public static float px2dp(Context context, float pxValue){
        float density = context.getResources().getDisplayMetrics().density;
        return pxValue / density;
    }
}
