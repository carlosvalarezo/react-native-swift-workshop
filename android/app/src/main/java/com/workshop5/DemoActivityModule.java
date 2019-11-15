package com.workshop5;

import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import androidx.annotation.NonNull;

public class DemoActivityModule extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;

    public DemoActivityModule(@NonNull ReactApplicationContext reactContext) {
        super(reactContext);
        reactContext = reactContext;
    }

    @NonNull
    @Override
    public String getName() {
        return "DemoActivityModule";
    }

    @ReactMethod
    public void openActivity() {
        ReactApplicationContext activity = getReactApplicationContext();


        Intent rctActivityIntent = new Intent(activity, DemoActivity.class);
        if(rctActivityIntent.resolveActivity(activity.getPackageManager()) !=null ) {
            rctActivityIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            activity.startActivity(rctActivityIntent);
        }
    }
}
