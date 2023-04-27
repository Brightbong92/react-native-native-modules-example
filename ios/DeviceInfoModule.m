#import <Foundation/Foundation.h>

// RCTBridgeModule 임포트, React Native 모듈을 작성할 때 필요한 프로토콜 제공
#import "React/RCTBridgeModule.h"

// DeviceInfoModule 클래스를 NSObject 의 하위 클래스로 선언,
// RCT_EXTERN_MODULE 매크로를 사용해 React Native 모듈임을 나타냄
@interface RCT_EXTERN_MODULE(DeviceInfoModule, NSObject)

// React Native 에서 사용 가능한 메서드를 선언
// RCT_EXTERN_METHOD 매크로를 사용하며, 이 메서드는 getSystemName 이름으로 선언
// 비동기
RCT_EXTERN_METHOD(getSystemName:
                  (RCTPromiseResolveBlock)resolve
                  rejecter:(RCTPromiseRejectBlock)reject)

// 콜백으로 처리된다
//RCT_EXTERN_METHOD(getSystemName : (RCTResponseSenderBlock)callback)

@end
