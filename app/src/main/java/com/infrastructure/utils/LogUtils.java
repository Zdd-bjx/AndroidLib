package com.infrastructure.utils;

import android.util.Log;
/**
 *
 * @ClassName: LogUtils
 * @Description: 用LEVEL来控制log输出
 * @author zdd
 * @date 2018年6月22日 上午10:19:04
 *
 */
public class LogUtils {
	private static final int ALL = 6;
	private static final int VERBOSE = 5;
	private static final int DEBUG = 4;
	private static final int INFO = 3;
	private static final int WARN = 2;
	private static final int ERR = 1;
	private static final int NOTHING = 0;

	private static final int LEVEL = DEBUG;
	
	public static void LogV(String TAG, String msg) {
		if (LEVEL>=VERBOSE) {
			Log.v(TAG, msg);
		}
	}
	public static void LogD(String TAG, String msg) {
		if (LEVEL>=DEBUG) {
			Log.v(TAG, msg);
		}
	}
	public static void LogI(String TAG, String msg) {
		if (LEVEL>=INFO) {
			Log.v(TAG, msg);
		}
	}
	public static void LogW(String TAG, String msg) {
		if (LEVEL>=WARN) {
			Log.v(TAG, msg);
		}
	}
	public static void LogE(String TAG, String msg) {
		if (LEVEL>=ERR) {
			Log.v(TAG, msg);
		}
	}
	
	
}
