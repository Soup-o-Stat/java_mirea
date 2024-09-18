package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        //Объект класса Car
        Car myCar = new Car("Владик", 2291489, "Самогонный");
        System.out.println("Владелец машины: " + myCar.get_OwnerName());
        System.out.println("Страховой номер машины: " + myCar.get_InsuranceNumber());
        System.out.println("Тип двигателя машины: " + myCar.get_EngineType());

        //Объект класса ElectricCar
        ElectricCar myElectricCar = new ElectricCar("Илон Саск", 7355608, 120);
        System.out.println("Владелец электромобиля: " + myElectricCar.get_OwnerName());
        System.out.println("Страховой номер электромобиля: " + myElectricCar.get_InsuranceNumber());
        System.out.println("Тип двигателя электромобиля: " + myElectricCar.get_EngineType());
        System.out.println("Емкость батареи: " + myElectricCar.get_BatteryCapacity());

        //изменение значения BatteryCapacity
        myElectricCar.set_BatteryCapacity(25000);
        System.out.println("Новая емкость батареи: " + myElectricCar.get_BatteryCapacity());
    }
}
