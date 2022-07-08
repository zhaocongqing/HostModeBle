package com.zcq.hostmodeble.ble.utils;

import android.util.Log;

/**
 * Create by zcq on 7/8/22 11:52 AM
 */
public class BleLog {

    public static boolean isPrint = true;
    private static final String defaultTag = "HostMode_Ble";

    public static void d(String msg) {
        if (isPrint && msg != null)
            Log.d(defaultTag, msg);
    }

    public static void i(String msg) {
        if (isPrint && msg != null)
            Log.i(defaultTag, msg);
    }

    public static void w(String msg) {
        if (isPrint && msg != null)
            Log.w(defaultTag, msg);
    }

    public static void e(String msg) {
        if (isPrint && msg != null)
            Log.e(defaultTag, msg);
    }

}