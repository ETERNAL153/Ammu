package trainandtram;

import java.util.Objects;

import metro.Metro;

public class Tram extends Metro {
    private int yearOfCreation;
    private static long baseNumber = 30000;
    private long serialNumber;
    public Tram(){
        super();
        this.yearOfCreation=0;
        this.serialNumber=baseNumber++;

    }

    public Tram(int numberOfWheels, double maxSpeed, int numOfVehicles, String nameOfTheStartingStation, String nameOfTheDestinationStation, int totalNumberOfStops, int yearOfCreation ){
        super(numberOfWheels,maxSpeed,numOfVehicles,nameOfTheStartingStation,nameOfTheDestinationStation,totalNumberOfStops);
        this.yearOfCreation = yearOfCreation;
        this.serialNumber=baseNumber++;
    }
    public Tram(Tram other) {
        super(other);
        this.yearOfCreation = other.yearOfCreation;
        this.serialNumber = baseNumber++;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
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
        return "Tram [yearOfCreation=" + yearOfCreation +
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
        Tram tram = (Tram) obj;
        return yearOfCreation == tram.yearOfCreation && serialNumber == tram.serialNumber && super.equals(obj);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), yearOfCreation, serialNumber);
    }
    
}