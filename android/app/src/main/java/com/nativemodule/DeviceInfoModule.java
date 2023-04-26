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
    // 기본적으로 ReactMethod는 비동기 지만,
    // isBlockingSynchronousMethod옵션을 이용해 동기적으로 사용가능
    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getSystemName() {
        return "Android";
    }

    @NonNull
    @Override
    public String getName() {
        // 네이티브 모듈 이름정의
        return "DeviceInfoModule";
    }
}
