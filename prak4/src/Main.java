import vehicles.ElectricCar;
import vehicles.Vehicle;
import vehicles.Car;

//Created by Soup-o-Stat!!!

public class Main {
    public static void main(String[] args) {
        Car common_car=new Car("uazik", "22814x", "red", 2013, "Sam Stone", 1226533, "Classic");
        System.out.println(common_car.vehicleType());
        common_car.setModel("Serious Uazik 3000");
        System.out.println(common_car.toString());
        ElectricCar common_elcar= new ElectricCar("tesla 228", "usa govna", "black", 2077, "Ilon Sask", 1212231, "Electric", 220);
        System.out.println(common_elcar.vehicleType());
        common_elcar.setBatteryCapacity(120);
        System.out.println(common_elcar.toString());
    }
}