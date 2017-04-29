package com.androidviewanimations.library.specials.in;

import android.animation.ObjectAnimator;
import android.view.View;

import com.androidviewanimations.easing.Glider;
import com.androidviewanimations.easing.Skill;
import com.androidviewanimations.library.BaseViewAnimator;

public class DropOutAnimator extends BaseViewAnimator {
    @Override
    protected void prepare(View target) {
        int distance = target.getTop() + target.getHeight();
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "alpha", 0, 1),
                Glider.glide(Skill.BounceEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "translationY", -distance, 0))
        );
    }
}
