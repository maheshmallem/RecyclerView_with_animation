package com.mahesh504.recycleview_sample.util;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;

public class AnimationUtil {
    public static void animate(RecyclerView.ViewHolder holder,boolean goesdown)
    {
        AnimatorSet animatorSet=new AnimatorSet();
        @SuppressLint("ObjectAnimatorBinding") ObjectAnimator animatorTransilateY= ObjectAnimator.ofFloat(holder.itemView,"translationY",goesdown==true ? 200 :-200,0);
        animatorTransilateY.setDuration(1200);

        animatorSet.playTogether(animatorTransilateY);
        animatorSet.start();
    }

}