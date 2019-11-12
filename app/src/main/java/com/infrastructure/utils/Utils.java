package com.infrastructure.utils;

import android.app.Dialog;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

import com.infrastructure.ui.SweetAlertDialog;

public class Utils {

	public final static int convertToInt(Object value, int defaultValue) {
		if (value == null || "".equals(value.toString().trim())) {
			return defaultValue;
		}
		try {
			return Integer.valueOf(value.toString());
		} catch (Exception e) {
			try {
				return Double.valueOf(value.toString()).intValue();
			} catch (Exception e1) {
				return defaultValue;
			}
		}
	}

	public static int dip2px(Context context, float dpValue){
		final float scale = context.getResources().getDisplayMetrics().density;
		return  (int)(dpValue*scale + 0.5f);
	}

	public static int px2dip(Context context, float pxValue){
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int)(pxValue/scale + 0.5f);
	}

	public static int getScreenWidth(Context ctx){
		WindowManager wm = (WindowManager)ctx.getSystemService(Context.WINDOW_SERVICE);
		DisplayMetrics dm = new DisplayMetrics();
		wm.getDefaultDisplay().getMetrics(dm);
		return dm.widthPixels;
	}

	public static int getScreenHeight(Context ctx){
		WindowManager wm = (WindowManager)ctx.getSystemService(Context.WINDOW_SERVICE);
		DisplayMetrics dm = new DisplayMetrics();
		wm.getDefaultDisplay().getMetrics(dm);
		return dm.heightPixels;
	}

	public static float getScreenDensity(Context ctx){
		WindowManager wm = (WindowManager)ctx.getSystemService(Context.WINDOW_SERVICE);
		DisplayMetrics dm = new DisplayMetrics();
		wm.getDefaultDisplay().getMetrics(dm);
		return dm.density;
	}

	public static void showIOSDialog(Context m_context, String title, String msg){
		SweetAlertDialog.Builder builder = new SweetAlertDialog.Builder(m_context);
		builder.setTitle(title);
		builder.setMessage(msg);
		builder.setCancelable(false)
				.setNegativeButton("cancel", new SweetAlertDialog.OnDialogClickListener() {
					@Override
					public void onClick(Dialog dialog, int which) {
					}
				})
				.setPositiveButton("OK", new SweetAlertDialog.OnDialogClickListener() {
					@Override
					public void onClick(Dialog dialog, int which) {
					}
				});
		//Toast.makeText(m_context, "��ɼ���", Toast.LENGTH_SHORT).show();
		builder.show();
	}

	public static void showIOSDialog2(Context m_context, String title, String msg){
		SweetAlertDialog.Builder builder = new SweetAlertDialog.Builder(m_context);
		builder.setTitle(title);
		builder.setMessage(msg);
		builder.setCancelable(false)
				.setPositiveButton("OK", new SweetAlertDialog.OnDialogClickListener() {
					@Override
					public void onClick(Dialog dialog, int which) {
					}
				});
		//Toast.makeText(m_context, "��ɼ���", Toast.LENGTH_SHORT).show();
		builder.show();
	}
}
