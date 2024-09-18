package vehicles;

public class Car {
    private String ownerName;
    private int insuranceNumber;

    protected String engineType;

    //конструктор класса Car
    public Car(String ownerName, int insuranceNumber, String engineType) {
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }
    //сеттер OwnerName
    public void set_OwnerName() {
        this.ownerName = ownerName;
    }
    //сеттер InsuranceNumber
    public void set_InsuranceNumber() {
        this.insuranceNumber = insuranceNumber;
    }
    //геттер OwnerName
    public String get_OwnerName() {
        return ownerName;
    }
    //геттер InsuranceNumber
    public int get_InsuranceNumber() {
        return insuranceNumber;
    }
    //сеттер EngineType
    public void set_EngineType(String engineType) {
        this.engineType = engineType;
    }
    //геттер EngineType
    public String get_EngineType() {
        return engineType;
    }
}