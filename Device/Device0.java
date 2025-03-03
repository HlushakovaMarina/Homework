package Device;

import java.util.Objects;

public class Device0 {
    private final String serialNumber;
    private static String model;
    private static int totalDevices = 0;
    private static int batteryLevel;

    public Device0(String serialNumber, String model) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.batteryLevel = 50;
        totalDevices++;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Device0.model = model;
    }

    public static int getTotalDevices() {
        return totalDevices;
    }

    public static void setTotalDevices(int totalDevices) {
        Device0.totalDevices = totalDevices;
    }

    public static int getBatteryLevel() {
        return batteryLevel;
    }

    public static void setBatteryLevel(int batteryLevel) {
        Device0.batteryLevel = batteryLevel;
    }

    @Override
    public String toString() {
        return "Устройство: " + model + ", серийный номер: "
                + serialNumber + ", заряд: " + batteryLevel + "%";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device0 device0 = (Device0) o;
        return Objects.equals(serialNumber, device0.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(serialNumber);
    }
    @Override
    public Device0 clone() {
        try {
            return (Device0) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }

    }
}