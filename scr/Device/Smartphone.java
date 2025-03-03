package Device;

public class Smartphone extends Device0 implements Chargeable {
    private int cameraResolution;

    public Smartphone(String serialNumber, String model, int cameraResolution) {
        super(serialNumber, model);
        this.cameraResolution = cameraResolution;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    @Override
    public void charge(int amount) {
        int newBatteryLevel = getBatteryLevel() + amount;
        if (newBatteryLevel > 100) {
            setBatteryLevel(100);
        } else {
            setBatteryLevel(newBatteryLevel);
        }
        System.out.println("Смартфон заряжен до " + getBatteryLevel() + "%");
    }

    @Override
    public String toString() {
        return super.toString() + ", камера: " + cameraResolution + " MP";
    }
}
