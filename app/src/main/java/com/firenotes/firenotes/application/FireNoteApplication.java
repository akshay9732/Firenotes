package com.firenotes.firenotes.application;

/**
 * Created by akshay on 24-06-2017.
 */

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class FireNoteApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}