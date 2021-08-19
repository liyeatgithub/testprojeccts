package org.ly.loglib;

import android.util.Log;

/**
 * @Description:
 * @Author: Icarus
 * @Date: 2021/8/19
 */
public class LogUtil {
    public static final String TAG = "liye";

    public static void i(String msg) {
        Log.i(TAG, msg);
    }

    public static void test() {
        Log.i(TAG, "test...");
    }
}
