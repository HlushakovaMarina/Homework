package Device;

class Laptop extends Device0 implements Chargeable {
    private int batteryLife;

    public Laptop(String serialNumber, String model, int batteryLife) {
        super(serialNumber, model);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public void charge(int amount) {
        int newBatteryLevel = getBatteryLevel() + amount;
        if (newBatteryLevel > 100) {
            setBatteryLevel(100);
        } else {
            setBatteryLevel(newBatteryLevel);
        }
        System.out.println("Ноутбук заряжен до " + getBatteryLevel() + "%");
    }

    @Override
    public String toString() {
        return super.toString() + ", время работы от батареи: " + batteryLife + " часов";
    }
}
