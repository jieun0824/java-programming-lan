package midterm;

public class Train extends PublicTransport
{
    private Station station;
    
    //constructor
    public Train(String model, 
    		double baseFare, 
    		double totalFare, 
    		double farePerStation, 
    		int nStations) {
        this.station = new Station();
        this.setModel(model);
        this.setBaseFare(baseFare);
        this.setTotalFare(totalFare);
        this.station.setFarePerStation(farePerStation); //set Fareperstation by using station for composition
        this.station.setNStation(nStations);//set nstation by using station for composition
    }
    //calcuate total fare
    public void calculatePayment() {
        final double totalFare = super.getTotalFare();
        final double baseFare = super.getBaseFare();
        final int nStations = this.station.getNstation();
        final double farePerStation = this.station.getFarePerStation();
        if (nStations <= 5) { //if station num is lower than 5
            super.setTotalFare(baseFare);
        }
        else if (nStations > 5) { //if station num is bigger than 5
            super.setTotalFare(baseFare + (nStations - 5) * farePerStation);
        }
    }
    
    //getter and setter value
    public void setNStation(int nstations) {
        this.station.setNStation(nstations);
    }
    
    public void setFarePerStation(double fareperstation) {
        this.station.setFarePerStation(fareperstation);
    }
    
    public int getNstation() {
        return this.station.getNstation();
    }
    
    public double getFarePerStation() {
        return this.station.getFarePerStation();
    }
}