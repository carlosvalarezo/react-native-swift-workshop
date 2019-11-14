package com.workshop5;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class JavaModule extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;

    JavaModule(ReactApplicationContext context) {
        super(context);
        reactContext = context;
    }

    @Override
    public String getName() {
        return "JavaModule";
    }

    @ReactMethod
    public void returnStringFromJava(String text, Callback function){
        String result = text + " this text comes from android java!";
        function.invoke(result);

    }
}
