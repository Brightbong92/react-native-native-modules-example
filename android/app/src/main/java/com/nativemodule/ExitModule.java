package com.nativemodule;

import android.content.Intent;
import android.content.Context;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class ExitModule extends ReactContextBaseJavaModule  {
    ExitModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void exitApp() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        android.os.Process.killProcess(android.os.Process.myPid());
    }

    @NonNull
    @Override
    public String getName() {
        return "ExitModule";
    }
}
