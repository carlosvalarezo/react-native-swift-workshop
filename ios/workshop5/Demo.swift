//
//  Demo.swift
//  workshop5
//
//  Created by carlos-valarezo-loaiza on 11/15/19.
//  Copyright © 2019 Facebook. All rights reserved.
//

import Foundation
@objc(Demo)
class Demo: NSObject {
  
  @objc static func requiresMainQueueSetup() -> Bool {
    return true
  }
  
  func getValue(_ text: String) -> String{
    let result = "Hello " + text + " from swift..."
    print(result)
    return result
  }
  
  @objc func getValueFromDemo(_ text: String, callback: RCTResponseSenderBlock){
    callback([getValue(text)])
  }
}
