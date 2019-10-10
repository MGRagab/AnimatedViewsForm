package com.mgragab.animatedviewsfrom.filters;

import androidx.annotation.NonNull;
import android.view.View;

/**
 * Tag filter.
 */
public class TagViewFilter extends AbstractEqualsViewFilter<String> {

    /**
     * Tag filter's contructor.
     *
     * @param viewTags View's tags.
     */
    public TagViewFilter(@NonNull final String[] viewTags) {
        super(viewTags);
    }

    @Override
    protected Object getObjectToMatch(final View view) {
        return view.getTag();
    }

}
