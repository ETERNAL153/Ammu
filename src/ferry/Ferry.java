package ferry;

import java.util.Objects;

public class Ferry {
    private double maxSpeed;
    private double maxLoad;
    private static long baseNumber=70000;
    private long serialNumber;

    public Ferry(){
        this.maxSpeed=0.0;
        this.maxLoad=0.0;
        this.serialNumber=baseNumber++;
    }
    public Ferry(double maxSpeed,double maxLoad){
        this.maxSpeed=maxSpeed;
        this.maxLoad=maxLoad;
        this.serialNumber=baseNumber++;
    }
    public Ferry(Ferry other) {
        this.maxSpeed = other.maxSpeed;
        this.maxLoad = other.maxLoad;
        this.serialNumber = baseNumber++;
    }
    public double getmaxLoad() {
        return maxLoad;
    }
    public double getmaxSpeed() {
        return maxSpeed;
    }
    public long getSerialNumber(){
        return serialNumber;
    }
    public static long getNextSerialNumber() {
        return baseNumber + 1;
    }
    @Override
    public String toString() {
        return "Ferry [maxSpeed=" + maxSpeed +
                ", maxLoad=" + maxLoad +
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
        Ferry ferry = (Ferry) obj;
        return Double.compare(ferry.maxSpeed, maxSpeed) == 0 &&
                Double.compare(ferry.maxLoad, maxLoad) == 0 &&
                serialNumber == ferry.serialNumber;
    }
    @Override
    public int hashCode() {
        return Objects.hash(maxSpeed, maxLoad, serialNumber);
    }
    
}
