package com.mgragab.animatedviewsfrom;

import android.view.animation.Animation;

/**
 * Animation provider.
 */
public interface AnimationProvider {

    /**
     * Provides a new animation instance.
     * @return New animation instance.
     */
    Animation provide();

}
