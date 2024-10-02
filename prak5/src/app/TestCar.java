package app;
import vehicles.ElectricCar;
import vehicles.Car;

public class TestCar {
    public static void main(String[] args) {
        Car common_car = new Car("McQueen", "MIT", "red", 2016, "Soup-o-Stat", 122354, "Combustion");
        ElectricCar common_el_car = new ElectricCar("Papa Mobile", "Holy", "yellow", 2003, "Father from SS4", 12345678, "Electric", 220);
        common_car.setYear(2010);
        common_car.setOwnerName("Nyashka");

        common_el_car.setYear(2020);
        common_el_car.setOwnerName("Sam Stone");

        common_car.setInsuranceNumber(2291489);
        common_el_car.setInsuranceNumber(7355608);

        common_el_car.setBatteryCapacity(120);
        System.out.println(common_el_car.getBatteryCapacity());

        common_car.toString();
        common_el_car.toString();

        System.out.println("This program has been made by Soup-o-Stat!");
    }
}
