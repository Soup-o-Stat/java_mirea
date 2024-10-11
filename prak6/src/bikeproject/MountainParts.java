package bikeproject;

public interface MountainParts {
    String TERRAIN = "off_road";

    void setSuspension(String newValue);
    String getSuspension();
    void setType(String newValue);
    String getType();
}