package com.firenotes.firenotes.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by WIN 10 on 6/24/2017.
 */

public class AppSession {

    private static AppSession session;
    private static final String USER_ID ="userid";
    private static final String TAG = AppSession.class.getName();
    private AppSession(){

    }

    public static AppSession getSession(){
        if (session == null){
            session = new AppSession();
        }
        return session;
    }

    public void saveUserId(Context context, String userId){
        SharedPreferences sharedpreferences = context.getSharedPreferences(TAG, Context.MODE_PRIVATE);
        sharedpreferences.edit().putString(USER_ID, userId).commit();
    }

    public String getUserId(Context context){
        SharedPreferences sharedpreferences = context.getSharedPreferences(TAG, Context.MODE_PRIVATE);
        return sharedpreferences.getString(USER_ID,"");
    }
}
