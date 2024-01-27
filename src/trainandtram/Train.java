package trainandtram;

import java.util.Objects;

import wheel.WheeledTransportation;

public class Train extends WheeledTransportation {
    private int numOfVehicles;
    private String nameOfTheStartingStation;
    private String nameOfTheDestinationStation;
    private static long baseNumber = 10000;  // Make it static

    private long serialNumber;
    public Train(){
        super();
        this.numOfVehicles=0;
        this.nameOfTheStartingStation="";
        this.nameOfTheDestinationStation="";
        this.serialNumber = baseNumber++;
    }

    public Train(int numberOfWheels, double maxSpeed, int numOfVehicles, String nameOfTheStartingStation, String nameOfTheDestinationStation) {
        super(numberOfWheels, maxSpeed);
        this.numOfVehicles = numOfVehicles;
        this.nameOfTheStartingStation = nameOfTheStartingStation;
        this.nameOfTheDestinationStation = nameOfTheDestinationStation;
        this.serialNumber = baseNumber++;
    }
    public Train(Train other) {
        super(other);
        this.numOfVehicles = other.numOfVehicles;
        this.nameOfTheStartingStation = other.nameOfTheStartingStation;
        this.nameOfTheDestinationStation = other.nameOfTheDestinationStation;
        this.serialNumber = baseNumber++;
    }
    public int getNumOfVehicles(){
        return numOfVehicles;
    }
    @Override
    public long getSerialNumber() {
        return serialNumber;
    }
    public String getStartingStation() {
        return nameOfTheStartingStation;
    }
    public String getDestinationStation() {
        return nameOfTheDestinationStation;
    }
    public static long getNextSerialNumber() {
        return baseNumber + 1;
    }
    @Override
    public String toString() {
        return "Train [numOfVehicles=" + numOfVehicles +
                ", nameOfTheStartingStation='" + nameOfTheStartingStation + '\'' +
                ", nameOfTheDestinationStation='" + nameOfTheDestinationStation + '\'' +
                ", serialNumber=" + serialNumber +
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
        Train train = (Train) obj;
        return numOfVehicles == train.numOfVehicles &&
                Objects.equals(nameOfTheStartingStation, train.nameOfTheStartingStation) &&
                Objects.equals(nameOfTheDestinationStation, train.nameOfTheDestinationStation) &&
                serialNumber == train.serialNumber;
    }
    @Override
    public int hashCode() {
        return Objects.hash(numOfVehicles, nameOfTheStartingStation, nameOfTheDestinationStation, serialNumber);
    }
    

}