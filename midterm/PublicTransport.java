package midterm;

public abstract class PublicTransport implements Payable
{
    private String model;
    private double baseFare;
    private double totalFare;
    
    @Override
    public abstract void calculatePayment();
    
    
    public PublicTransport() {
        this.model = ""; //initializing the value first
        this.baseFare = 0.0;
        this.totalFare = 0.0;
    }
    //constructor for bus and train
    public PublicTransport(String model, double baseFare, double totalFare, double farePerStation, int nStations) {
        this.setModel(model);
        this.setBaseFare(baseFare);
        this.setTotalFare(totalFare);
    }
    //constructor for taxi
    public PublicTransport(String model, double baseFare, double totalFare, double farePerKm, double distance) {
        this.setModel(model);
        this.setBaseFare(baseFare);
        this.setTotalFare(totalFare);
    }
    
    //getter and setter
    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public double getBaseFare() {
        return this.baseFare;
    }
    
    public void setBaseFare(double baseFare) {
        this.baseFare = baseFare;
    }
    
    public double getTotalFare() {
        return this.totalFare;
    }
    
    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }
}