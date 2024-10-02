package vehicles;

public class ElectricCar extends Vehicle implements ElectricVehicle {
    private int batteryCapacity;
    public ElectricCar(String model, String license, String color, int year, String ownerName, int insuranceNumber, String engineType, int batteryCapacity){
        super(model, license, color, year, ownerName, insuranceNumber, "Electric");
    }
    public String vehicleType(){
        return "Electric Car";
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity=batteryCapacity;
    }

    @Override
    public String toString() {
        System.out.println(getModel() + " " + getLicense() + " " + getColor() + " " + getYear() + " ");
        System.out.println(getOwnerName() + " " + getInsuranceNumber() + " " + getEngineType() + " " + getBatteryCapacity());
        return super.toString();
    }
}
