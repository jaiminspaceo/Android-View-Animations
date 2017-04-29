package com.androidviewanimations.easing;

import com.androidviewanimations.easing.back.BackEaseIn;
import com.androidviewanimations.easing.back.BackEaseInOut;
import com.androidviewanimations.easing.back.BackEaseOut;
import com.androidviewanimations.easing.bounce.BounceEaseIn;
import com.androidviewanimations.easing.bounce.BounceEaseInOut;
import com.androidviewanimations.easing.bounce.BounceEaseOut;
import com.androidviewanimations.easing.circ.CircEaseIn;
import com.androidviewanimations.easing.circ.CircEaseInOut;
import com.androidviewanimations.easing.circ.CircEaseOut;
import com.androidviewanimations.easing.cubic.CubicEaseIn;
import com.androidviewanimations.easing.cubic.CubicEaseInOut;
import com.androidviewanimations.easing.cubic.CubicEaseOut;
import com.androidviewanimations.easing.elastic.ElasticEaseIn;
import com.androidviewanimations.easing.elastic.ElasticEaseOut;
import com.androidviewanimations.easing.expo.ExpoEaseIn;
import com.androidviewanimations.easing.expo.ExpoEaseInOut;
import com.androidviewanimations.easing.expo.ExpoEaseOut;
import com.androidviewanimations.easing.linear.Linear;
import com.androidviewanimations.easing.quad.QuadEaseIn;
import com.androidviewanimations.easing.quad.QuadEaseInOut;
import com.androidviewanimations.easing.quad.QuadEaseOut;
import com.androidviewanimations.easing.quint.QuintEaseIn;
import com.androidviewanimations.easing.quint.QuintEaseInOut;
import com.androidviewanimations.easing.quint.QuintEaseOut;
import com.androidviewanimations.easing.sine.SineEaseIn;
import com.androidviewanimations.easing.sine.SineEaseInOut;
import com.androidviewanimations.easing.sine.SineEaseOut;

public enum Skill {

    BackEaseIn(BackEaseIn.class),
    BackEaseOut(BackEaseOut.class),
    BackEaseInOut(BackEaseInOut.class),

    BounceEaseIn(BounceEaseIn.class),
    BounceEaseOut(BounceEaseOut.class),
    BounceEaseInOut(BounceEaseInOut.class),

    CircEaseIn(CircEaseIn.class),
    CircEaseOut(CircEaseOut.class),
    CircEaseInOut(CircEaseInOut.class),

    CubicEaseIn(CubicEaseIn.class),
    CubicEaseOut(CubicEaseOut.class),
    CubicEaseInOut(CubicEaseInOut.class),

    ElasticEaseIn(ElasticEaseIn.class),
    ElasticEaseOut(ElasticEaseOut.class),

    ExpoEaseIn(ExpoEaseIn.class),
    ExpoEaseOut(ExpoEaseOut.class),
    ExpoEaseInOut(ExpoEaseInOut.class),

    QuadEaseIn(QuadEaseIn.class),
    QuadEaseOut(QuadEaseOut.class),
    QuadEaseInOut(QuadEaseInOut.class),

    QuintEaseIn(QuintEaseIn.class),
    QuintEaseOut(QuintEaseOut.class),
    QuintEaseInOut(QuintEaseInOut.class),

    SineEaseIn(SineEaseIn.class),
    SineEaseOut(SineEaseOut.class),
    SineEaseInOut(SineEaseInOut.class),

    Linear(Linear.class);


    private Class easingMethod;

    private Skill(Class clazz) {
        easingMethod = clazz;
    }

    public BaseEasingMethod getMethod(float duration) {
        try {
            return (BaseEasingMethod) easingMethod.getConstructor(float.class).newInstance(duration);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Error("Can not init easingMethod instance");
        }
    }
}
