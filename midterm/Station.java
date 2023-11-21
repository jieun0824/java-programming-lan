package midterm;

public class Station
{
	//composition for bus and train
    public double farePerStation;
    public int nStations;
    
    //getter and setter (will be used in bus and train class)
    public int getNstation() {
        return this.nStations;
    }
    
    public void setNStation(int nStations) {
        this.nStations = nStations;
    }
    
    public double getFarePerStation() {
        return this.farePerStation;
    }
    
    public void setFarePerStation(double farePerStation) {
        this.farePerStation = farePerStation;
    }
}