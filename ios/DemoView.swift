//
//  DemoView.swift
//  workshop5
//
//  Created by carlos-valarezo-loaiza on 11/15/19.
//  Copyright © 2019 Facebook. All rights reserved.
//

import Foundation

class DemoView: UIView {
  override init(frame:CGRect){
    super.init(frame: frame)
    
    let label = UILabel(frame: CGRect(x: 0, y: 0, width: 100,
                                      height: 50))
    label.text = "Swift ui"
    label.textAlignment = .center
    self.addSubview(label)
    
  }
  
  required init?(coder aDecoder: NSCoder) {
    fatalError("init(coder:) has not been implemented")
  }
  
}
