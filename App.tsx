import React from 'react';
import {NativeModules, SafeAreaView, StyleSheet} from 'react-native';
import {NativeBaseProvider, Box, Button} from 'native-base';

export default function App() {
  const killApp = () => {
    NativeModules.ExitModule.exitApp();
  };

  const runCamera = () => {
    NativeModules.CameraModule.openCamera();
  };

  return (
    <NativeBaseProvider>
      <SafeAreaView style={styles.wrapper}>
        <Box>Hello world</Box>

        <Button width={100} height={50} onPress={killApp}>
          앱종료
        </Button>
        <Box height={20} />
        <Button width={100} height={50} onPress={runCamera}>
          카메라 실행
        </Button>
      </SafeAreaView>
    </NativeBaseProvider>
  );
}

const styles = StyleSheet.create({
  wrapper: {
    backgroundColor: '#fff',
    flex: 1,
  },
});
