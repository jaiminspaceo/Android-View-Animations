package com.androidviewanimations.library;

import com.androidviewanimations.library.attention.BounceAnimator;
import com.androidviewanimations.library.attention.FlashAnimator;
import com.androidviewanimations.library.attention.PulseAnimator;
import com.androidviewanimations.library.attention.ShakeAnimator;
import com.androidviewanimations.library.attention.TadaAnimator;
import com.androidviewanimations.library.attention.WaveAnimator;
import com.androidviewanimations.library.attention.WobbleAnimator;
import com.androidviewanimations.library.bouncing_entrances.BounceInAnimator;
import com.androidviewanimations.library.bouncing_entrances.BounceInDownAnimator;
import com.androidviewanimations.library.bouncing_entrances.BounceInUpAnimator;
import com.androidviewanimations.library.fading_entrances.FadeInAnimator;
import com.androidviewanimations.library.fading_entrances.FadeInDownAnimator;
import com.androidviewanimations.library.fading_entrances.FadeInRightAnimator;
import com.androidviewanimations.library.fading_entrances.FadeInUpAnimator;
import com.androidviewanimations.library.fading_exits.FadeOutAnimator;
import com.androidviewanimations.library.fading_exits.FadeOutDownAnimator;
import com.androidviewanimations.library.fading_exits.FadeOutLeftAnimator;
import com.androidviewanimations.library.fading_exits.FadeOutUpAnimator;
import com.androidviewanimations.library.flippers.FlipInXAnimator;
import com.androidviewanimations.library.flippers.FlipInYAnimator;
import com.androidviewanimations.library.flippers.FlipOutYAnimator;
import com.androidviewanimations.library.rotating_entrances.RotateInAnimator;
import com.androidviewanimations.library.rotating_entrances.RotateInDownLeftAnimator;
import com.androidviewanimations.library.rotating_entrances.RotateInDownRightAnimator;
import com.androidviewanimations.library.rotating_entrances.RotateInUpRightAnimator;
import com.androidviewanimations.library.sliders.SlideInDownAnimator;
import com.androidviewanimations.library.sliders.SlideInLeftAnimator;
import com.androidviewanimations.library.sliders.SlideInRightAnimator;
import com.androidviewanimations.library.sliders.SlideInUpAnimator;
import com.androidviewanimations.library.specials.HingeAnimator;
import com.androidviewanimations.library.specials.RollInAnimator;
import com.androidviewanimations.library.specials.RollOutAnimator;
import com.androidviewanimations.library.specials.in.DropOutAnimator;
import com.androidviewanimations.library.specials.in.LandingAnimator;
import com.androidviewanimations.library.specials.out.TakingOffAnimator;
import com.androidviewanimations.library.zooming_entrances.ZoomInAnimator;
import com.androidviewanimations.library.zooming_entrances.ZoomInDownAnimator;
import com.androidviewanimations.library.zooming_entrances.ZoomInLeftAnimator;
import com.androidviewanimations.library.zooming_entrances.ZoomInRightAnimator;
import com.androidviewanimations.library.zooming_entrances.ZoomInUpAnimator;
import com.androidviewanimations.library.zooming_exits.ZoomOutAnimator;
import com.androidviewanimations.library.zooming_exits.ZoomOutDownAnimator;

public enum Techniques {

    DropOut(DropOutAnimator.class),
    Landing(LandingAnimator.class),
    TakingOff(TakingOffAnimator.class),

    Flash(FlashAnimator.class),
    Pulse(PulseAnimator.class),
    Shake(ShakeAnimator.class),
    Wobble(WobbleAnimator.class),
    Bounce(BounceAnimator.class),
    Tada(TadaAnimator.class),
    Wave(WaveAnimator.class),

    Hinge(HingeAnimator.class),
    RollIn(RollInAnimator.class),
    RollOut(RollOutAnimator.class),

    BounceIn(BounceInAnimator.class),
    BounceInDown(BounceInDownAnimator.class),
    BounceInUp(BounceInUpAnimator.class),

    FadeIn(FadeInAnimator.class),
    FadeInUp(FadeInUpAnimator.class),
    FadeInDown(FadeInDownAnimator.class),
    FadeInRight(FadeInRightAnimator.class),

    FadeOut(FadeOutAnimator.class),
    FadeOutDown(FadeOutDownAnimator.class),
    FadeOutLeft(FadeOutLeftAnimator.class),
    FadeOutUp(FadeOutUpAnimator.class),

    FlipInX(FlipInXAnimator.class),
    FlipInY(FlipInYAnimator.class),
    FlipOutY(FlipOutYAnimator.class),
    RotateIn(RotateInAnimator.class),
    RotateInDownLeft(RotateInDownLeftAnimator.class),
    RotateInDownRight(RotateInDownRightAnimator.class),
    RotateInUpRight(RotateInUpRightAnimator.class),

    SlideInLeft(SlideInLeftAnimator.class),
    SlideInRight(SlideInRightAnimator.class),
    SlideInUp(SlideInUpAnimator.class),
    SlideInDown(SlideInDownAnimator.class),

    ZoomIn(ZoomInAnimator.class),
    ZoomInDown(ZoomInDownAnimator.class),
    ZoomInLeft(ZoomInLeftAnimator.class),
    ZoomInRight(ZoomInRightAnimator.class),
    ZoomInUp(ZoomInUpAnimator.class),

    ZoomOut(ZoomOutAnimator.class),
    ZoomOutDown(ZoomOutDownAnimator.class);

    private Class animatorClazz;

    private Techniques(Class clazz) {
        animatorClazz = clazz;
    }

    public BaseViewAnimator getAnimator() {
        try {
            return (BaseViewAnimator) animatorClazz.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}
