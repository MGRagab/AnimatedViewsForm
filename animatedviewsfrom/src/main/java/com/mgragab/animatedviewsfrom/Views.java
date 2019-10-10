package com.mgragab.animatedviewsfrom;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

/**
 * Views librarie entry point.
 */
public final class Views {

    /**
     * Helps to find child views.
     * @param rootViews Root views.
     * @return Views finder.
     */
    public static ViewsFinder from(@NonNull final ViewGroup... rootViews){
        return new ViewsFinder(rootViews);
    }

}
