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

package com.fis.fisglobal.lib.utils;

/**
 * Created by Jaspreet.Chhabra on 3/29/2017.
 */


import android.content.Context;
import android.graphics.Typeface;

import java.util.Hashtable;

public class FontCache {

    private static Hashtable<String, Typeface> fontCache = new Hashtable<String, Typeface>();

    public static Typeface get(String name, Context context) {
        Typeface tf = fontCache.get(name);
        if (tf == null) {
            try {
                tf = Typeface.createFromAsset(context.getAssets(), name);
            } catch (Exception e) {
                return null;
            }
            fontCache.put(name, tf);
        }
        return tf;
    }
}
