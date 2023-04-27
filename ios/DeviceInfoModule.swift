// Foundation 프레임워크 import
import Foundation

// Objective-C에서 해당모듈을 참조할때 사용할 이름 지정
@objc(DeviceInfoModule)

// 클래스선언 및 NSObject 상속
class DeviceInfoModule : NSObject {
  
  //  Objective-C에서 해당 함수를 참조할 때 사용할 이름을 지정
  @objc
  // 문자열 "iOS"를 반환하는 함수생성
  //  콜백으로 처리
  //  func getSystemName(_ callback: RCTResponseSenderBlock) {
  //    callback(["iOS"])
  //  }

  // 비동기 처리
  func getSystemName(_ resolve: RCTPromiseResolveBlock, rejecter reject: RCTPromiseRejectBlock) {
        resolve("iOS")
    }
  
  @objc
  // 리액트 네이티브가 메인 스레드에서 실행되도록 설정
  static func requiresMainQueueSetup() -> Bool {
    return true;
  }
  
}
