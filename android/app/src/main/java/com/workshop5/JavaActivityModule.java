package com.workshop5;

import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import androidx.annotation.NonNull;

public class JavaActivityModule extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;

    @NonNull
    @Override
    public String getName() {
        return "JavaActivityModule";
    }

    JavaActivityModule(ReactApplicationContext context) {
        super(context);
        reactContext = context;
    }

    @ReactMethod
    public void openJavaActivity() {
        ReactApplicationContext activity = getReactApplicationContext();


        Intent rctActivityIntent = new Intent(activity, JavaActivity.class);
        if(rctActivityIntent.resolveActivity(activity.getPackageManager()) !=null ) {
            rctActivityIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            activity.startActivity(rctActivityIntent);
        }

    }
}
