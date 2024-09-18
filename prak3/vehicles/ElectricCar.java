package vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String ownerName, int insuranceNumber, int batteryCapacity) {
        //вот эта хренотень обращается к папане (родительский класс, super) и передает параметры
        super(ownerName, insuranceNumber, "Electric");
        this.batteryCapacity = batteryCapacity;
    }
    //сеттер BatteryCapacity
    public void set_BatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    //геттер BatteryCapacity
    public int get_BatteryCapacity() {
        return batteryCapacity;
    }
}