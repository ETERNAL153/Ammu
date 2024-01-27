package wheel;

import java.util.Objects;

public class WheeledTransportation {
    private int numberOfWheels;
    private double maxSpeed;
    private long serialNumber;
    private static long baseNumber=0;
    public WheeledTransportation(){
        this.numberOfWheels=0;
        this.maxSpeed=0.0;
        this.serialNumber=baseNumber++;
    }
    public WheeledTransportation(int numberOfWheels, double maxSpeed) {
        this.numberOfWheels = numberOfWheels;
        this.maxSpeed = maxSpeed;
        this.serialNumber=baseNumber++;
    }
    public WheeledTransportation(WheeledTransportation other) {
        this.numberOfWheels = other.numberOfWheels;
        this.maxSpeed = other.maxSpeed;
        this.serialNumber = baseNumber++;
    }
    public long getSerialNumber() {
        return serialNumber;
    }
    public int getNumOfWheels(){
        return numberOfWheels;
    }
    public double getmaxSpeed(){
        return maxSpeed;
    }
    public static long getNextSerialNumber() {
        return baseNumber + 1;
    }
    public String toString() {
        return "WheeledTransportation [numberOfWheels=" + numberOfWheels + ", maxSpeed=" + maxSpeed + ", serialNumber=" + serialNumber + "]";
    }

    // equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WheeledTransportation that = (WheeledTransportation) obj;
        return numberOfWheels == that.numberOfWheels && Double.compare(that.maxSpeed, maxSpeed) == 0 && serialNumber == that.serialNumber;
    }
    @Override
    public int hashCode() {
        return Objects.hash(numberOfWheels, maxSpeed, serialNumber);
    }

}