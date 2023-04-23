package com.nativemodule;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class DeviceInfoModule extends ReactContextBaseJavaModule {

    DeviceInfoModule(ReactApplicationContext context) {
        super(context);
    }

    @NonNull
    @Override
    public String getName() {
        return "DeviceInfoModule";
    }

}
