package Assignment5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.*;
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
        Scanner sc = new Scanner(System.in);
        int type;
        while(true){
            System.out.println("1.Write to output file 2.Read data from file to objects 3.Add the vehicle details 4.Display Details 5.exit");
            type = sc.nextInt();
            if(type == 5){
                break;
            }
            switch(type){
                case 1 :
                    fileWriter(outputfile,arr);
                    break;
                case 2 :
                    fileReader(outputfile,arr);
                    break;
                case 3:
                    AddVehicle(arr,sc);
                    break;
                case 4:
                    DisplayData(arr);
                    break;
            }
        }  
    }
    public static void DisplayData(ArrayList<Vehicle>arr){
        for(Vehicle v: arr){
            v.displayInfo();
        }
    }
    public static void AddVehicle(ArrayList<Vehicle>arr,Scanner sc){
        while(true){
            System.out.println("Add the vehicle Type 1.vehicle 2.car 3.Truck 4.Go to Back Step");
            int type=sc.nextInt();
            if(type == 4){
                break;
            }
            String make;
            String model;
            int year;
            double fuelCapacity;
            switch (type) {
                case 1:
                    System.out.println("Enter data: make ,model, year, fuelcapacity");
                    make=sc.next();
                    model=sc.next();
                    year=sc.nextInt();
                    fuelCapacity=sc.nextDouble();
                    Vehicle v = new Vehicle(make, model, year, fuelCapacity);
                    arr.add(v);
                    break;
                case 2:
                    System.out.println("Enter data: make ,model, year, fuelcapacity, numDoor, trunk capacity");
                    make=sc.next();
                    model=sc.next();
                    year=sc.nextInt();
                    fuelCapacity=sc.nextDouble();
                    int numDoor= sc.nextInt();
                    double trunkCapacity = sc.nextDouble(); 
                    Car c = new Car(make, model, year, fuelCapacity, numDoor, trunkCapacity);
                    arr.add(c);
                    break;
                case 3:
                System.out.println("Enter data: make ,model, year, fuelcapacity, cargoCapacity, towingCapacity");
                    make=sc.next();
                    model=sc.next();
                    year=sc.nextInt();
                    fuelCapacity=sc.nextDouble();
                    double cargoCapacity = sc.nextDouble();
                    double towingCapacity = sc.nextDouble();
                    Truck t = new Truck(make, model, year, fuelCapacity, cargoCapacity, towingCapacity);
                    arr.add(t);
                    break;
            }
        }

    }
    public static void fileWriter(String inputfile, ArrayList<Vehicle> arr){
        try{
            FileWriter w=new FileWriter(inputfile);
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
    public static void fileReader(String outputfile,ArrayList<Vehicle>arr)
    {
        try{
            FileReader r=new FileReader(outputfile);
            BufferedReader b=new BufferedReader(r);
            String line;
            while((line=b.readLine())!=null)
            {
                createObj(line,arr);
            }
        }
        catch(Exception e){
            System.out.println("error"+e.getMessage());
        }
    } 
    public static void createObj(String data,ArrayList<Vehicle>list)
    {
        String[] arr=data.split("\\s+");
        String make;
        String model;
        int year;
        double fuelCapacity;
        make=arr[1];
        model=arr[3];
        year=Integer.parseInt(arr[5]);
        fuelCapacity=Double.parseDouble(arr[7]);
        Vehicle a =new Vehicle(make, model, year, fuelCapacity);
        list.add(a);
        a.displayInfo();
    }
}