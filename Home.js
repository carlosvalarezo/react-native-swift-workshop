/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React from 'react';
import {
  SafeAreaView,
  StyleSheet,
  ScrollView,
  View,
  Text,
  StatusBar,
  Alert,
  NativeModules,
} from 'react-native';

import {Demo} from './Demo';

import {
  Header,
  LearnMoreLinks,
  Colors,
  DebugInstructions,
  ReloadInstructions,
} from 'react-native/Libraries/NewAppScreen';

import {Avatar, Button, Icon} from 'react-native-elements';

const Home = ({navigation}) => {
  return (
    <>
      <StatusBar barStyle="dark-content" />
      <SafeAreaView>
        <ScrollView
          contentInsetAdjustmentBehavior="automatic"
          style={styles.scrollView}>
          <Button
            icon={<Icon type="entypo" name="globe" size={15} color="white" />}
            title="Open profile"
            onPress={() => navigation.navigate('Profile')}
          />
          <Button
            icon={<Icon type="entypo" name="globe" size={15} color="white" />}
            title="Call iOS invisible"
            onPress={() =>
              Demo.getValueFromDemo('lorenxo el gato', result =>
                Alert.alert(result),
              )
            }
          />
          <Button
            icon={<Icon type="entypo" name="globe" size={15} color="white" />}
            title="Open iOS"
            onPress={() => navigation.navigate('DemoView')}
          />
          <Avatar rounded icon={{name: 'home'}} />
        </ScrollView>
      </SafeAreaView>
    </>
  );
};

const styles = StyleSheet.create({
  scrollView: {
    backgroundColor: Colors.lighter,
  },
  engine: {
    position: 'absolute',
    right: 0,
  },
  body: {
    backgroundColor: Colors.white,
  },
  sectionContainer: {
    marginTop: 32,
    paddingHorizontal: 24,
  },
  sectionTitle: {
    fontSize: 24,
    fontWeight: '600',
    color: Colors.black,
  },
  sectionDescription: {
    marginTop: 8,
    fontSize: 18,
    fontWeight: '400',
    color: Colors.dark,
  },
  highlight: {
    fontWeight: '700',
  },
  footer: {
    color: Colors.dark,
    fontSize: 12,
    fontWeight: '600',
    padding: 4,
    paddingRight: 12,
    textAlign: 'right',
  },
});

export default Home;
