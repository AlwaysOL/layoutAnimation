package com.yanjia.layoutanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.view.animation.AnimationUtils;
import android.view.animation.GridLayoutAnimationController;
import android.view.animation.LayoutAnimationController;

public class GridRecycleViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycle_view);


        GridRecycleView gridRecycleView = (GridRecycleView) findViewById(R.id.gridRecycleView);
        gridRecycleView.setLayoutManager(new GridLayoutManager(gridRecycleView.getContext(), 4));
        gridRecycleView.setAdapter(new CardAdapter());
        gridRecycleView.addItemDecoration(new ItemOffsetDecoration(getResources().getDimensionPixelOffset(R.dimen.default_spacing_size)));
        LayoutAnimationController gridLayoutAnimationController =  AnimationUtils.loadLayoutAnimation(gridRecycleView.getContext(), R.anim.grid_layout_animator_from_bottom);
//        LayoutAnimationController gridLayoutAnimationController =  AnimationUtils.loadLayoutAnimation(gridRecycleView.getContext(), R.anim.layout_animation_fall_down);
        gridRecycleView.setLayoutAnimation(gridLayoutAnimationController);
        gridRecycleView.getAdapter().notifyDataSetChanged();
        gridRecycleView.scheduleLayoutAnimation();
    }
}
