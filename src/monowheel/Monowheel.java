package monowheel;

import java.util.Objects;

import wheel.WheeledTransportation;

public class Monowheel extends WheeledTransportation {
    private double maxWeight;
    private long serialNumber;
    private static long baseNumber = 55000; 
    
    public Monowheel(){
        super();
        this.maxWeight = 0.0;
        this.serialNumber= baseNumber++;
    }
    public Monowheel(int numberOfWheels, double maxSpeed,double maxWeight){
        super(numberOfWheels,maxSpeed);
        this.maxWeight= maxWeight;
        this.serialNumber=baseNumber++;
    }
    public Monowheel(Monowheel other) {
        super(other);
        this.maxWeight = other.maxWeight;
        this.serialNumber = baseNumber++;
    }

    public double getMaxWeight(){
        return maxWeight;
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
        return "Monowheel [maxWeight=" + maxWeight +
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
        Monowheel monowheel = (Monowheel) obj;
        return Double.compare(monowheel.maxWeight, maxWeight) == 0 && serialNumber == monowheel.serialNumber && super.equals(obj);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxWeight, serialNumber);
    }
    
}

