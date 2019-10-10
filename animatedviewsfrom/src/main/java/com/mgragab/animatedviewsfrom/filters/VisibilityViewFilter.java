package com.mgragab.animatedviewsfrom.filters;

import android.view.View;

import androidx.annotation.NonNull;

/**
 * Visibility filter.
 */
public class VisibilityViewFilter implements ViewFilter {

    /**
     * View's visibilities.
     */
    private final int[] viewVisibilities;

    /**
     * Visibility filter's contructor.
     *
     * @param viewVisibilities View's visibilities.
     */
    public VisibilityViewFilter(@NonNull final int[] viewVisibilities) {
        this.viewVisibilities = viewVisibilities;
    }

    @Override
    public boolean filter(final View view) {
        return FilterHelper.arrayContains(viewVisibilities, view.getVisibility());
    }

}
