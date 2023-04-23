import Foundation

@objc(ExitModule)
class ExitModule : NSObject {
  
  @objc
  func exitApp() {
    exit(0);
  }
  
  @objc
  //  메인 스레드에서 실행되도록 설정
  static func requiresMainQueueSetup() -> Bool {
    return true;
  }
}

