package com.twopai.twopaibaselibrary.utils;

import android.content.Context;
import android.content.SharedPreferences;


public class PreferenceUtils {
    /**
     * 存入文件中的工程
     */
    public static final String PREFERENCES = "PREFERENCES";
    public static final String IS_LAUNCHED = "is_launched";
    public static final String TOKEN = "token";
/*******************************************************************************************************/
    /**
     * 设置string preferences
     */
    public static void setString(Context context, String key, String value) {
        SharedPreferences sp = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(key, value);
        editor.commit();
    }

    /**
     * 从preferences中获取,不存在则返回""
     *
     * @param context
     * @param key
     */
    public static String getString(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
        return sp.getString(key, "");
    }

    public static String getString(Context context, String key, String defaultValue) {
        SharedPreferences sp = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
        return sp.getString(key, defaultValue);
    }

    /**
     * 保存至preferences
     *
     * @param context
     * @param key
     * @param value
     */
    public static void setInt(Context context, String key, int value) {
        SharedPreferences sp = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    /**
     * 从preferences中获�?
     *
     * @param context
     * @param key
     */
    public static int getInt(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
        return sp.getInt(key, -1);
    }

    public static int getIntWithDefault(Context context, String key, int defaultValue) {
        SharedPreferences sp = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
        return sp.getInt(key, defaultValue);
    }

    /**
     * 从preferences中获�?
     *
     * @param context
     * @param key
     */
    public static String getStringWithDefault(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
        return sp.getString(key, "0");
    }

    /**
     * 删除preferences中的数据
     *
     * @param context
     * @param key
     */
    public static void delString(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.remove(key);
        editor.commit();
    }

    public static void clearShare(Context context){
        SharedPreferences sp = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.clear();
        edit.commit();
    }


    /**
     * @param context
     * @param key
     * @param value
     */
    public static void setLong(Context context, String key, long value) {
        SharedPreferences sp = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putLong(key, value);
        editor.commit();
    }

    public static long getLong(Context context, String key, long def) {
        SharedPreferences sp = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
        return sp.getLong(key, def);
    }

    public static void setBoolean(Context context, String key, boolean value) {
        SharedPreferences sp = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    public static boolean getBoolean(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
        return sp.getBoolean(key, false);
    }

    public static boolean getBoolean(Context context, String key, boolean defaultValue) {
        SharedPreferences sp = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
        return sp.getBoolean(key, defaultValue);
    }

}
