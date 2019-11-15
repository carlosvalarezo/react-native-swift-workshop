package com.workshop5;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import androidx.annotation.NonNull;

public class DemoModule extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;

    public DemoModule(@NonNull ReactApplicationContext reactContext) {
        super(reactContext);
        reactContext = reactContext;
    }

    @NonNull
    @Override
    public String getName() {
        return "DemoModule";
    }

    @ReactMethod
    public void showMesssage(String message, Callback function) {
        String result = message + " this text comes from android java!";
        function.invoke(result);
    }
}
