package bikeproject;

public class RoadBike extends Bike implements RoadParts {
    private int tyreWidth;
    private int postHeight;

    public RoadBike() {
        this("drop", "racing", "smooth", "sport", 18, 23, 20);
    }

    public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears, int tyreWidth, int postHeight) {
        super(handleBars, frame, tyres, seatType, numGears);
        this.tyreWidth = tyreWidth;
        this.postHeight = postHeight;
    }

    @Override
    public void setTyreWidth(int newValue) {
        this.tyreWidth = newValue;
    }

    @Override
    public int getTyreWidth() {
        return this.tyreWidth;
    }

    @Override
    public void setPostHeight(int newValue) {
        this.postHeight = newValue;
    }

    @Override
    public int getPostHeight() {
        return this.postHeight;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("This road bike has a tyre width of " + this.tyreWidth + " mm and a post height of " + this.postHeight + " cm.");
    }
}
