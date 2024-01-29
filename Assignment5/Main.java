package Assignment5;

import java.io.FileWriter;
import java.util.ArrayList;

class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected double fuelCapacity;
    public Vehicle(String make, String model, int year, double fuelCapacity)
    {
        this.make=make;
        this.model=model;
        this.year=year;
        this.fuelCapacity=fuelCapacity;
    }
    public void displayInfo()
    {
        System.out.println("make"+make + " " +"model"+model+" "+"year"+" "+year+" "+"fuel capacity"+fuelCapacity);
    }
}
class Car extends Vehicle{
    private int numDoors;
    private double trunkCapacity;
    public Car(String make, String model, int year, double fuelCapacity,int numDoors, double trunkCapacity)
    {
        super(make, model, year, fuelCapacity);
        this.numDoors=numDoors;
        this.trunkCapacity=trunkCapacity;
    }
    public double calculateFuelEfficiency()
    {
        return trunkCapacity/numDoors;
    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("numDoors"+ numDoors+" "+ "trunkCapacity"+trunkCapacity);
    }
}
class Truck extends Vehicle{
    private double cargoCapacity;
    private double towingCapacity;
    public Truck(String make, String model, int year, double fuelCapacity, double cargoCapacity, double towingCapacity)
    {
        super(make, model, year, fuelCapacity);
        this.cargoCapacity=cargoCapacity;
        this.towingCapacity=towingCapacity;
    }
    public double calculateFuelEfficiency()
    {
        return towingCapacity/cargoCapacity;
    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("cargoCapacity"+ cargoCapacity+" "+ "towingCapacity"+towingCapacity);
    }

}
public class Main{
    public static void main(String[] args) {
        String outputfile="output.txt";
        ArrayList<Vehicle>arr=new ArrayList<>();
        Truck obj1=new Truck("steel", "bmw", 1974, 2000, 3000, 1000);
        Car obj2=new Car("plasterOfParis", "benz", 1876, 200, 4, 100);
        Vehicle obj3=new Vehicle("clay", "suzuki", 1987, 600);
        arr.add(obj1);
        arr.add(obj2);
        arr.add(obj3);
        try{
            FileWriter w=new FileWriter(outputfile);
            for(Vehicle v: arr){
                w.write("make "+v.make+" "+"model "+v.model+" "+"year "+v.year+" "+"fuel "+v.fuelCapacity+System.lineSeparator());
                System.out.println(v.make);
            }
            System.out.println("Data updated");
            w.close();
        }
        catch(Exception e){
            System.out.println("error"+e.getMessage());
        }
        
    }
}
