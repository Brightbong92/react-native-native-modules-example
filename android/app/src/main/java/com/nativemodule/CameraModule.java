package com.nativemodule;

import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class CameraModule extends ReactContextBaseJavaModule  {

    private static final int REQUEST_IMAGE_CAPTURE = 1;

    CameraModule(ReactApplicationContext context) {
        super(context);
    }

    @NonNull
    @Override
    public String getName() {
        return "CameraModule";
    }

    @ReactMethod
    public void openCamera() {
        Intent intent = new Intent(getReactApplicationContext(), CameraPreviewActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getReactApplicationContext().startActivity(intent);
    }
}