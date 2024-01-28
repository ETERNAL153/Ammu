package Assignment5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Backup {
    public static void main(String[] args) {
        String inputfile = "input.txt";
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String outputfile = inputfile + timeStamp;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputfile));
            FileWriter writer = new FileWriter(outputfile);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.write(line + System.lineSeparator());
            }
            writer.close(); // Close the FileWriter
            reader.close(); // Close the BufferedReader
            System.out.println("Backup file saved as: " + outputfile);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace(); // Print the full stack trace
        }
    }
}
