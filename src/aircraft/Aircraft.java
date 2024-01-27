package aircraft;

import java.util.Objects;

public class Aircraft {
    private double price;
    private double maxElevation;
    private static long baseNumber=75000;
    private long serialNumber;

    public Aircraft(){
        this.price=0.0;
        this.maxElevation=0.0;
        this.serialNumber=baseNumber++;
    }
    public Aircraft(double price,double maxElevation){
        this.price=price;
        this.maxElevation=maxElevation;
        this.serialNumber=baseNumber++;
    }
    public Aircraft(Aircraft other) {
        this.price = other.price;
        this.maxElevation = other.maxElevation;
        this.serialNumber = baseNumber++;
    }
    public double getprice() {
        return price;
    }
    public double getmaxElevation() {
        return maxElevation;
    }
    public long getSerialNumber(){
        return serialNumber;
    }
    public static long getNextSerialNumber() {
        return baseNumber + 1;
    }
    @Override
    public String toString() {
        return "Aircraft [price=" + price +
                ", maxElevation=" + maxElevation +
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
        Aircraft aircraft = (Aircraft) obj;
        return Double.compare(aircraft.price, price) == 0 &&
                Double.compare(aircraft.maxElevation, maxElevation) == 0 &&
                serialNumber == aircraft.serialNumber;
    }
    @Override
    public int hashCode() {
        return Objects.hash(price, maxElevation, serialNumber);
    }
}
