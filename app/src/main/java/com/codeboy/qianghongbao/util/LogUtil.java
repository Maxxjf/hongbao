package com.codeboy.qianghongbao.util;

import android.util.Log;

/**
 * Created by Ki on 2017/1/13.
 */

//Max日记工具类，记录日记的
public final class LogUtil {

    private static LogUtil instance = null;

    public synchronized static LogUtil getInstance() {
        if (instance == null) {
            instance = new LogUtil();
        }
        return instance;
    }

    private LogUtil() {

    }


    //    private final String TAG = getClass().getName();
    private static final String TAG = "max";//标记，
    public static final int VERBOSE = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
    public static final int WARN = 4;
    public static final int ERROR = 5;
    public static final int NOTHING = 6;
    public static int LEVEL = NOTHING;//设置打印等级，（假设这个值为NOTING的时候，就不打印任何日记）

    public static void v(String s) {
        if (LEVEL <= VERBOSE) {
            Log.v(TAG, s);
        }
    }

    public static void d(String s) {
        if (LEVEL <= DEBUG) {
            Log.d(TAG, s);
        }
    }

    public static void i(String s) {
        if (LEVEL <= INFO) {
            Log.i(TAG, s);
        }
    }

    public static void w(String s) {
        if (LEVEL <= WARN) {
            Log.w(TAG, s);
        }
    }

    public static void e(String s) {
        if (LEVEL <= ERROR) {
            Log.e(TAG, s);
        }
    }
}
