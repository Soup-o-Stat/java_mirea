package vehicles;

public abstract class Vehicle {
    public String model;
    public String license;
    public String color;
    public int year;
    public String ownerName;
    public int insuranceNumber;
    protected String engineType;

    public abstract String vehicleType();

    public Vehicle(String model, String license, String color, int year, String ownerName, int insuranceNumber, String engineType) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }

    //сеттеры
    public void setModel(String model){
        this.model = model;
    }
    public void setLicense(String license){
        this.license = license;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    //геттер
    public String getModel(){
        return model;
    }
    public String getLicense(){
        return license;
    }
    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public int getInsuranceNumber(){
        return insuranceNumber;
    }
    public String getEngineType(){
        return engineType;
    }
}
