import Foundation
import UIKit

@objc(CameraModule)
class CameraModule : NSObject {
  
  @objc
  func openCamera() {
    DispatchQueue.main.async {
      if UIImagePickerController.isSourceTypeAvailable(.camera) {
        let imagePicker = UIImagePickerController()
        imagePicker.sourceType = .camera
        imagePicker.allowsEditing = false
        UIApplication.shared.keyWindow?.rootViewController?.present(imagePicker, animated: true, completion: nil)
      }
    }
  }
  
  @objc
  static func requiresMainQueueSetup() -> Bool {
    return true;
  }
}
