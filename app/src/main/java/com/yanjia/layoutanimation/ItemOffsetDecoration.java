package com.yanjia.layoutanimation;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * @User Created by yanjia on 2017/11/27.
 * @Description
 */

public class ItemOffsetDecoration extends RecyclerView.ItemDecoration {
    private int mSpacing;

    public ItemOffsetDecoration(int itemOffset){
        mSpacing = itemOffset;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.set(mSpacing, mSpacing,mSpacing,mSpacing);
    }
}
