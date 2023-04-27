import React from 'react';
import {
  Alert,
  NativeModules,
  Platform,
  SafeAreaView,
  StyleSheet,
} from 'react-native';
import {NativeBaseProvider, Box, Button, Text} from 'native-base';

export default function App() {
  const exitApp = () => {
    NativeModules.ExitModule.exitApp();
  };

  const runCamera = () => {
    NativeModules.CameraModule.openCamera();
  };

  const getDeviceInfo = async () => {
    if (Platform.OS === 'android') {
      const systemName = NativeModules.DeviceInfoModule.getSystemName();
      Alert.alert(systemName);
    } else if (Platform.OS === 'ios') {
      const systemName =
        await NativeModules.DeviceInfoModule.getSystemName().then(
          (res: string) => {
            return res;
          },
        );
      Alert.alert(systemName);
    }
  };

  return (
    <NativeBaseProvider>
      <SafeAreaView style={styles.wrapper}>
        <Text fontSize={'20px'}>Native Modules</Text>

        <Button height={50} onPress={exitApp}>
          앱종료
        </Button>
        <Box height={20} />
        <Button height={50} onPress={runCamera}>
          카메라 실행
        </Button>
        <Box height={20} />
        <Button width={'auto'} height={50} onPress={getDeviceInfo}>
          디바이스 정보 가져오기
        </Button>
      </SafeAreaView>
    </NativeBaseProvider>
  );
}

const styles = StyleSheet.create({
  wrapper: {
    flex: 1,
    justifyContent: 'center',
    backgroundColor: '#fff',
  },
});
