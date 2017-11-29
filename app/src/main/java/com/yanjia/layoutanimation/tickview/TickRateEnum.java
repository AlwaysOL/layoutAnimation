package com.yanjia.layoutanimation.tickview;

/**
 * @User Created by yanjia on 2017/11/28.
 * @Description
 */

public enum TickRateEnum {
    SLOW(800, 480, 720),
    NORMAL(500, 300, 450),
    FAST(300, 120, 270);

    private int mRingAnimatorDuration;
    private int mCircleAnimatorDuration;
    private int mScaleAnimatorDuration;

    public static final int RATE_MODE_SLOW = 0;
    public static final int RATE_MODE_NORMAL = 1;
    public static final int RATE_MODE_FAST = 2;

    TickRateEnum(int mRingAnimatorDuration, int mCircleAnimatorDuration, int mScaleAnimatorDuration) {
        this.mRingAnimatorDuration = mRingAnimatorDuration;
        this.mCircleAnimatorDuration = mCircleAnimatorDuration;
        this.mScaleAnimatorDuration = mScaleAnimatorDuration;
    }

    public int getmRingAnimatorDuration() {
        return mRingAnimatorDuration;
    }

    public void setmRingAnimatorDuration(int mRingAnimatorDuration) {
        this.mRingAnimatorDuration = mRingAnimatorDuration;
    }

    public int getmCircleAnimatorDuration() {
        return mCircleAnimatorDuration;
    }

    public void setmCircleAnimatorDuration(int mCircleAnimatorDuration) {
        this.mCircleAnimatorDuration = mCircleAnimatorDuration;
    }

    public int getmScaleAnimatorDuration() {
        return mScaleAnimatorDuration;
    }

    public void setmScaleAnimatorDuration(int mScaleAnimatorDuration) {
        this.mScaleAnimatorDuration = mScaleAnimatorDuration;
    }

    public static TickRateEnum getRateEnum(int rateMode){
        TickRateEnum tickRateEnum;
        switch (rateMode){
            case RATE_MODE_SLOW:
                tickRateEnum = TickRateEnum.SLOW;
                break;
            case RATE_MODE_NORMAL:
                tickRateEnum = TickRateEnum.NORMAL;
                break;
            case RATE_MODE_FAST:
                tickRateEnum = TickRateEnum.FAST;
                break;
            default:
                tickRateEnum = TickRateEnum.NORMAL;
                break;
        }

        return tickRateEnum;
    }
}
