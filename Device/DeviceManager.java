package Device;

public class DeviceManager {
    void printDevice(Device0 device) {
        System.out.println(device);
    }

    void printDevice(Device0[] devices) {
        for (Device0 device : devices) {
            System.out.println(device);
        }
    }
        public static int getTotalDevices () {
            return Device0.getTotalDevices();
        }
        public static void chargeDevice (Chargeable device,int amount){
            device.charge(amount);
        }
        public static void chargeDevice (Chargeable[]devices,int amount){
            for (Chargeable device : devices) {
                device.charge(amount);
            }
        }
    }

