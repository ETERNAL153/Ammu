package main;

import aircraft.*;
import ferry.Ferry;
import metro.Metro;
import monowheel.Monowheel;
import trainandtram.Train;
import trainandtram.Tram;
import wheel.WheeledTransportation;

public class Main {

    public static void main(String[] args) {
        // Create objects from each class
        Train train1 = new Train(4, 60.5, 8, "Station X", "Station Y");
        Train train2 = new Train(6, 55.2, 10, "Station P", "Station Q");
        Train train3 = new Train(8, 72.3, 12, "Station M", "Station N");

        Metro metro1 = new Metro(6, 45.8, 10, "Station A", "Station B", 15);
        Metro metro2 = new Metro(8, 50.0, 12, "Station C", "Station D", 20);
        Metro metro3 = new Metro(10, 55.5, 14, "Station E", "Station F", 25);

        Tram tram1 = new Tram(6, 35.2, 6, "Station M", "Station N", 8, 1995);
        Tram tram2 = new Tram(4, 30.0, 4, "Station K", "Station L", 5, 2000);
        Tram tram3 = new Tram(8, 40.5, 8, "Station R", "Station S", 10, 2010);

        Monowheel monowheel1 = new Monowheel(1, 20.0, 150.0);

        Ferry ferry1 = new Ferry(25.0, 200.0);

        Aircraft aircraft1 = new Aircraft(100.0, 10000.0);
        WorldWarIIAirplane airplane1 = new WorldWarIIAirplane(500.0, 50000.0, true);

        // Display information using toString() method
        System.out.println("Train 1 Data:");
        System.out.println(train1.toString());

        System.out.println("Metro 1 Data:");
        System.out.println(metro1.toString());

        System.out.println("Tram 1 Data:");
        System.out.println(tram1.toString());

        System.out.println("Monowheel 1 Data:");
        System.out.println(monowheel1.toString());

        System.out.println("Ferry 1 Data:");
        System.out.println(ferry1.toString());

        System.out.println("Aircraft 1 Data:");
        System.out.println(aircraft1.toString());

        System.out.println("WW2 Airplane 1 Data:");
        System.out.println(airplane1.toString());

        // Test equality using equals method
        System.out.println("Train 1 and Metro 1 Equality: " + train1.equals(metro1));
        System.out.println("Aircraft 1 and Ferry 1 Equality: " + aircraft1.equals(ferry1));

        // Test getNextSerialNumber
        System.out.println("Next Serial Number for Train: " + Train.getNextSerialNumber());
        System.out.println("Next Serial Number for Aircraft: " + Aircraft.getNextSerialNumber());

        // Test equality using equals() method
        System.out.println("Train 1 equals Train 2: " + train1.equals(train2));

        // Create arrays with mixed objects
        // WheeledTransportation[] array1 = {train1, metro1, tram1, monowheel1, ferry1, aircraft1, airplane1};
        WheeledTransportation[] array2 = {train2, metro2, tram2, train3, metro3, tram3};

        // Call findLeastAndMostExpensiveAircraft() with the arrays
        // findLeastAndMostExpensiveAircraft(array1);
        // findLeastAndMostExpensiveAircraft(array2);
    }

    // Find and display least and most expensive Aircraft objects
    // private static void findLeastAndMostExpensiveAircraft(WheeledTransportation[] array) {
    //     double leastExpensive = Double.MAX_VALUE;
    //     double mostExpensive = Double.MIN_VALUE;
    //     Aircraft leastExpensiveAircraft = null;
    //     Aircraft mostExpensiveAircraft = null;

    //     for (WheeledTransportation transportation : array) {
    //         if (transportation instanceof Aircraft) {
    //             Aircraft aircraft = (Aircraft) transportation;
    //             double price = aircraft.getprice();
    //             if (price < leastExpensive) {
    //                 leastExpensive = price;
    //                 leastExpensiveAircraft = aircraft;
    //             }
    //             if (price > mostExpensive) {
    //                 mostExpensive = price;
    //                 mostExpensiveAircraft = aircraft;
    //             }
    //         }
    //     }

    //     if (leastExpensiveAircraft != null && mostExpensiveAircraft != null) {
    //         System.out.println("Least Expensive Aircraft:");
    //         System.out.println(leastExpensiveAircraft.toString());

    //         System.out.println("Most Expensive Aircraft:");
    //         System.out.println(mostExpensiveAircraft.toString());
    //     } else {
    //         System.out.println("No Aircraft objects found in the array.");
    //     }
    // }
}
