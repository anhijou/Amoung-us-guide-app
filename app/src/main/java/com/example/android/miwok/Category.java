package com.example.android.miwok;

import android.view.View;

public class Category {

    /** Default translation for the word */
    private String mcategorytitle;

    /** Miwok translation for the word */
    private Class mcategoryclass;

    /** Image resource ID for the word */
    private int mcategoryImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Category(Class categoryclass, int categoryImageResourceId) {
        //mcategorytitle = categorytitle;
        mcategoryclass = categoryclass;
        mcategoryImageResourceId = categoryImageResourceId;
    }

    /*public String getcategorytitle() {
        return mcategorytitle;
    }*/
    public Class getcategoryclass() {
        return mcategoryclass;
    }
    public int getcategoryImageResourceId() {
        return mcategoryImageResourceId;
    }
    public boolean hasImage() {
        return mcategoryImageResourceId != NO_IMAGE_PROVIDED;
    }

}
