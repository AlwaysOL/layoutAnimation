package com.yanjia.layoutanimation;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.GridLayoutAnimationController;

/**
 * @User Created by yanjia on 2017/11/27.
 * @Description
 */

public class GridRecycleView extends RecyclerView {
    public GridRecycleView(Context context) {
        super(context);
    }

    public GridRecycleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GridRecycleView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

//    @Override
//    protected void attachLayoutAnimationParameters(View child, ViewGroup.LayoutParams params, int index, int count) {
//        final LayoutManager layoutManager = getLayoutManager();
//        if(getAdapter() != null && layoutManager instanceof GridLayoutManager){
//            GridLayoutAnimationController.AnimationParameters animationParameters = (GridLayoutAnimationController.AnimationParameters) params.layoutAnimationParameters;
//
//            if(animationParameters == null) {
//                animationParameters = new GridLayoutAnimationController.AnimationParameters();
//                params.layoutAnimationParameters = animationParameters;
//            }
//
//            final int colums = ((GridLayoutManager) layoutManager).getSpanCount();
//
//            animationParameters.count = count;
//            animationParameters.index = index;
//            animationParameters.columnsCount = colums;
//            animationParameters.rowsCount = count/colums;
//
//            final int invertedIndex = count - 1 - index;
//            animationParameters.column = colums - 1 - (invertedIndex%colums);
//            animationParameters.row = animationParameters.rowsCount - 1 - invertedIndex/colums;
//        } else {
//            super.attachLayoutAnimationParameters(child, params, index, count);
//        }
//    }

    @Override
    protected void attachLayoutAnimationParameters(View child, ViewGroup.LayoutParams params,
                                                   int index, int count) {
        final LayoutManager layoutManager = getLayoutManager();
        if (getAdapter() != null && layoutManager instanceof GridLayoutManager){

            GridLayoutAnimationController.AnimationParameters animationParams =
                    (GridLayoutAnimationController.AnimationParameters) params.layoutAnimationParameters;

            if (animationParams == null) {
                animationParams = new GridLayoutAnimationController.AnimationParameters();
                params.layoutAnimationParameters = animationParams;
            }

            final int columns = ((GridLayoutManager) layoutManager).getSpanCount();

            animationParams.count = count;
            animationParams.index = index;
            animationParams.columnsCount = columns;
            animationParams.rowsCount = count / columns;

            final int invertedIndex = count - 1 - index;
            animationParams.column = columns - 1 - (invertedIndex % columns);
            animationParams.row = animationParams.rowsCount - 1 - invertedIndex / columns;

        } else {
            super.attachLayoutAnimationParameters(child, params, index, count);
        }
    }
}
