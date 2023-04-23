import Foundation

@objc(ExitModule)
class ExitModule : NSObject {
  
  @objc
  func exitApp() {
    exit(0);
  }
}

