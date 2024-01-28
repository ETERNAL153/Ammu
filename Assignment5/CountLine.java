package Assignment5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountLine {
    public static void main(String args[]) {
        String inputfile = "input.txt";
        String outputfile = "output.txt";

        try {
            int lineCount = countLines(inputfile);
            writeLineCount(outputfile, lineCount);
            System.out.println("Line count saved to " + outputfile);
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file: " + e.getMessage());
        }
    }

    private static int countLines(String inputFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            int count = 0;
            while (reader.readLine() != null) {
                count++;
            }
            return count;
        }
    }

    private static void writeLineCount(String outputFile, int lineCount) throws IOException {
        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write("Number of lines in file: " + lineCount);
        }
    }
}
