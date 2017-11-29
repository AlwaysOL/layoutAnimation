package com.yanjia.layoutanimation.tickview;

/**
 * @User Created by yanjia on 2017/11/28.
 * @Description
 */

public interface TickAnimatiorListener {
    void onAnimationStart(TickView tickView);
    void onAnimationEnd(TickView tickView);

    abstract class TickAnimationAdapter implements TickAnimatiorListener{
        @Override
        public void onAnimationStart(TickView tickView) {

        }

        @Override
        public void onAnimationEnd(TickView tickView) {

        }
    }
}
