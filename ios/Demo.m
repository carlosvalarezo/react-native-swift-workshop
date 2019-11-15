//
//  Demo.m
//  workshop5
//
//  Created by carlos-valarezo-loaiza on 11/15/19.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "React/RCTBridgeModule.h"
@interface RCT_EXTERN_MODULE(Demo, NSObject)
  RCT_EXTERN_METHOD(getValueFromDemo: (NSString*)text callback:(RCTResponseSenderBlock)callback)
@end
