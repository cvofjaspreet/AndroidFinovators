/*
 *
 *
 *  © Copyright 2017
 *  Fidelity National Information Services, Inc. and/or its subsidiaries - All Rights Reserved worldwide.
 *
 *  This document is protected under the trade secret and copyright laws as the
 * property of Fidelity National Information Services, Inc. and/or its subsidiaries.
 *
 *  Copying, reproduction or distribution should be limited and only to employees
 * with a “need to know” to do their job. Any disclosure of this document to third
 * parties is strictly prohibited.
 *
 *
 */

package com.fis.fisglobal.lib.widget.textview;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.TextView;

import com.fis.fisglobal.lib.utils.FontCache;

/**
 * Created by Jaspreet.Chhabra on 3/29/2017.
 */

public class RegularTextView extends AppCompatTextView {
    public RegularTextView(Context context) {
        super(context);
        if (!isInEditMode())
            init();
    }

    public RegularTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode())
            init();
    }

    protected void init() {
        setTypeface(FontCache.get("fonts/regular.ttf", getContext()));
    }
}
