//
//  DemoViewManager.swift
//  workshop5
//
//  Created by carlos-valarezo-loaiza on 11/15/19.
//  Copyright © 2019 Facebook. All rights reserved.
//

import Foundation

@objc(DemoViewManager)
class DemoViewManager: RCTViewManager {
  
  override func view() -> UIView! {
   return DemoView()
  }
  
  override static func requiresMainQueueSetup() -> Bool {
    return true
  }
}
