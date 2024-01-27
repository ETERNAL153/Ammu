package metro;

import java.util.Objects;

import trainandtram.Train;

public class Metro extends Train {
    private int totalNumOfStops;
    private static long baseNumber = 25000;
    private long serialNumber;
    public Metro(){
        super();
        this.totalNumOfStops=0;
        this.serialNumber=baseNumber++;
    }
    public Metro(int numberOfWheels, double maxSpeed, int numOfVehicles, String nameOfTheStartingStation, String nameOfTheDestinationStation, int totalNumOfStops ){
        super(numberOfWheels,maxSpeed,numOfVehicles,nameOfTheStartingStation,nameOfTheDestinationStation);
        this.totalNumOfStops = totalNumOfStops;
        this.serialNumber=baseNumber++;
    }
    public Metro(Metro other) {
        super(other);
        this.totalNumOfStops = other.totalNumOfStops;
        this.serialNumber = baseNumber++;
    }
    public int getTotalNumsOfStops(){
        return totalNumOfStops;
    }
    @Override
    public long getSerialNumber(){
        return serialNumber;
    }
    public static long getNextSerialNumber() {
        return baseNumber + 1;
    }
    @Override
    public String toString() {
        return "Metro [totalNumOfStops=" + totalNumOfStops +
                ", serialNumber=" + serialNumber +
                ", " + super.toString() +
                ']';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Metro metro = (Metro) obj;
        return totalNumOfStops == metro.totalNumOfStops && serialNumber == metro.serialNumber && super.equals(obj);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), totalNumOfStops, serialNumber);
    }
    
}
