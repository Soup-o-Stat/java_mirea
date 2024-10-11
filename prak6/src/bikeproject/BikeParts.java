package bikeproject;

public interface BikeParts {
    String COMPANY_NAME = "Oracle Cycles";

    void setHandleBars(String newValue);
    String getHandleBars();
    void setFrame(String newValue);
    String getFrame();
    void setTyres(String newValue);
    String getTyres();
    void setSeatType(String newValue);
    String getSeatType();
}