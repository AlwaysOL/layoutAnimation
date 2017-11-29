package com.yanjia.layoutanimation.tickview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.yanjia.layoutanimation.R;

public class TickActivity extends AppCompatActivity {

    private static final String TAG = TickActivity.class.getSimpleName();

    TickView tickView;
    TickView tickViewAccent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tick);
        tickView = (TickView) findViewById(R.id.tick_view);
        tickView.getConfig().setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(TickView tickView, boolean isCheck) {

            }
        }).setTickAnimatorListener(new TickAnimatorListener.TickAnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(TickView tickView) {
                super.onAnimationStart(tickView);
            }

            @Override
            public void onAnimationEnd(TickView tickView) {
                super.onAnimationEnd(tickView);
                tickView.setClickable(true);
            }
        });


        tickViewAccent = (TickView) findViewById(R.id.tick_view_accent);
        tickViewAccent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isChecked = tickViewAccent.isChecked() ? false : true;
                tickViewAccent.setChecked(isChecked);
                tickViewAccent.setClickable(false);
                tickViewAccent.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tickViewAccent.setClickable(true);
                    }
                }, 1000);
            }
        });
        findViewById(R.id.check_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tickView.setChecked(true);
                tickViewAccent.setChecked(true);
            }
        });

        findViewById(R.id.uncheck_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tickView.setChecked(false);
                tickViewAccent.setChecked(false);
            }
        });
    }
}
