package com.kyleduo.switchbutton;

import android.content.res.ColorStateList;
import android.util.Log;

/**
 * Generate thumb and background color state list use tintColor
 * Created by kyle on 15/11/4.
 */
public class ColorUtils {
	private static final int ENABLE_ATTR = android.R.attr.state_enabled;
	private static final int CHECKED_ATTR = android.R.attr.state_checked;
	private static final int PRESSED_ATTR = android.R.attr.state_pressed;

	public static ColorStateList generateThumbColorWithTintColor(final int tintColor) {
		int[][] states = new int[][]{
				{-ENABLE_ATTR, CHECKED_ATTR},
				{-ENABLE_ATTR},
				{PRESSED_ATTR, -CHECKED_ATTR},
				{PRESSED_ATTR, CHECKED_ATTR},
				{CHECKED_ATTR},
				{-CHECKED_ATTR}
		};

		int[] colors = new int[] {
				tintColor - 0xCC000000,
				0xFF696969,
				tintColor - 0x99000000,
				tintColor - 0x99000000,
				tintColor,
				0xFFEEEEEE
		};

		for (int i : colors) {
			Log.e("xx", Integer.toHexString(i));
		}
		return new ColorStateList(states, colors);
	}

	public static ColorStateList generateBackColorWithTintColor(final int tintColor) {
		int[][] states = new int[][]{
				{-ENABLE_ATTR, CHECKED_ATTR},
				{-ENABLE_ATTR},
				{CHECKED_ATTR, ENABLE_ATTR, PRESSED_ATTR},
				{-CHECKED_ATTR, ENABLE_ATTR, PRESSED_ATTR},
				{CHECKED_ATTR, ENABLE_ATTR},
				{-CHECKED_ATTR, ENABLE_ATTR}
		};

		int[] colors = new int[] {
				tintColor - 0xD0000000,
				0x20000000,
				tintColor - 0xD0000000,
				0x20000000,
				tintColor - 0xD0000000,
				0x20000000
		};

		for (int i : colors) {
			Log.e("xx", Integer.toHexString(i));
		}
		return new ColorStateList(states, colors);
	}
}