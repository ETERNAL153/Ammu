package aircraft;

import java.util.Objects;

public class WorldWarIIAirplane extends Aircraft {
    private boolean twinEngine;
    private static long baseNumber=80000;
    private long serialNumber;

    public WorldWarIIAirplane(){
        super();
        this.twinEngine=false;
        this.serialNumber=baseNumber++;
    }
    public WorldWarIIAirplane(double price,double maxElevation,boolean twinEngine){
        super(price,maxElevation);
        this.twinEngine=twinEngine;
        this.serialNumber=baseNumber++;
    }
    public WorldWarIIAirplane(WorldWarIIAirplane other) {
        super(other); 
        this.twinEngine = other.twinEngine;
        this.serialNumber = baseNumber++;
    }
    public boolean gettwinEngine(){
        return twinEngine;
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
        return "WorldWarIIAirplane [twinEngine=" + twinEngine +
                ", serialNumber=" + serialNumber +
                ", price=" + getprice() +
                ", maxElevation=" + getmaxElevation() +
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
        WorldWarIIAirplane airplane = (WorldWarIIAirplane) obj;
        return twinEngine == airplane.twinEngine &&
                serialNumber == airplane.serialNumber &&
                Double.compare(airplane.getprice(), getprice()) == 0 &&
                Double.compare(airplane.getmaxElevation(), getmaxElevation()) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(twinEngine, serialNumber, getprice(), getmaxElevation());
    }
    
}
