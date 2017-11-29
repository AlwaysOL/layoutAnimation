package com.yanjia.layoutanimation.util;

import android.content.Context;

/**
 * @User Created by yanjia on 2017/11/28.
 * @Description
 */

public class DisplayUtil {
    public static int dp2px(Context context, float dpValue){
        if(context == null) return (int) (dpValue * 1.5f + 0.5f);
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
