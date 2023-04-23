import React from 'react';
import {NativeModules} from 'react-native';
import {NativeBaseProvider, Box, Button} from 'native-base';

export default function App() {
  const killApp = () => {
    NativeModules.exitModule.exitApp();
  };

  const runCamera = () => {
    // NativeModules.cameraModule.openCamera();
    console.log(
      'NativeModules.cameraModule',
      NativeModules.cameraModule.openCamera(),
    );
  };

  return (
    <NativeBaseProvider>
      <Box>Hello world</Box>

      <Button width={100} height={50} onPress={killApp}>
        앱종료
      </Button>
      <Box height={20} />
      <Button width={100} height={50} onPress={runCamera}>
        카메라 실행
      </Button>
    </NativeBaseProvider>
  );
}
