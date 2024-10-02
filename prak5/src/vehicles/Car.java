package vehicles;

public class Car extends Vehicle {
    public Car(String model, String license, String color, int year, String ownerName, int insuranceNumber, String engineType) {
        super(model, license, color, year, ownerName, insuranceNumber, "Combustion");
    }

    public String vehicleType() {
        return "Car";
    }

    public String toString() {
        System.out.println(getModel() + " " + getLicense() + " " + getColor() + " " + getYear() + " ");
        System.out.println(getOwnerName() + " " + getInsuranceNumber() + " " + getEngineType());
        return super.toString();
    }
}