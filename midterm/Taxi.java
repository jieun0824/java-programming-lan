package midterm;

public class Taxi extends PublicTransport
{
    double farePerKm;
    double distance;
    
    //constructor
    public Taxi(String model, double baseFare, double totalFare, double farePerKm, double distance) {
        super(model, baseFare, totalFare, farePerKm, distance);
        this.setFarePerKm(farePerKm);
        this.setDistance(distance);
    }
    
    //calculate total fare(basfare+distance*farePerKm)
    public void calculatePayment() {
        double totalFare = super.getTotalFare();
        double baseFare = super.getBaseFare();
        totalFare = baseFare + this.distance * this.farePerKm;
        super.setTotalFare(totalFare);
    }
    
    //getter and setter methods
    public double getFarePerKm() {
        return this.farePerKm;
    }
    
    public void setFarePerKm(final double farePerKm) {
        this.farePerKm = farePerKm;
    }
    
    public double getDistance() {
        return this.distance;
    }
    
    public void setDistance(final double distance) {
        this.distance = distance;
    }
}