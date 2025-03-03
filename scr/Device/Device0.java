package Device;

import java.util.Objects;

public class Device0 implements Cloneable{
    private final String serialNumber;
    private String model;
    private static int totalDevices = 0;
    private int batteryLevel;

    public Device0(String serialNumber, String model) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.batteryLevel = 50;
        totalDevices++;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static int getTotalDevices() {
        return totalDevices;
    }

    public void setTotalDevices(int totalDevices) {
        this.totalDevices = totalDevices;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
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