package com.nativemodule;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

// 추상 클래스 ReactContextBaseJavaModule 상속
public class DeviceInfoModule extends ReactContextBaseJavaModule {

    DeviceInfoModule(ReactApplicationContext reactApplicationContext) {
        // 부모 클래스 생성자 명시적 호출, 매개변수 전달
        super(reactApplicationContext);
    }

    // React-Native에서 사용할수 있게 메소드 어노테이션 정의
    // 비동기함수
    @ReactMethod
    public void getSystemName(Promise promise) {
        try{
            promise.resolve("Android");
        }catch (Exception e) {
            promise.reject(e);
        }
    }

    @NonNull
    @Override
    public String getName() {
        // 네이티브 모듈 이름정의
        return "DeviceInfoModule";
    }
}
