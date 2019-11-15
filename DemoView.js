import React from 'react';
import {requireNativeComponent, View} from 'react-native';

const DemoViewiOS = requireNativeComponent('DemoView');

const DemoView = () => {
  return (
    <View>
      <DemoViewiOS />
    </View>
  );
};

export default DemoView;
