package Assignment5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSplitter {
    public static void main(String[] args) {
        String inputFilePath = "input.txt"; // Change this to your input file path
        int splitLineNumber = 2; // Change this to the line number where you want to split the file

        String outputFilePath1 = "output1.txt"; // Change this to your output file path for the first part
        String outputFilePath2 = "output2.txt"; // Change this to your output file path for the second part

        try {
            splitFile(inputFilePath, splitLineNumber, outputFilePath1, outputFilePath2);
            System.out.println("File split successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while splitting the file: " + e.getMessage());
        }
    }

    private static void splitFile(String inputFilePath, int splitLineNumber,
                                  String outputFilePath1, String outputFilePath2) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             FileWriter writer1 = new FileWriter(outputFilePath1);
             FileWriter writer2 = new FileWriter(outputFilePath2)) {

            String line;
            int lineCount = 0;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                if (lineCount <= splitLineNumber) {
                    writer1.write(line + System.lineSeparator());
                } else {
                    writer2.write(line + System.lineSeparator());
                }
            }
        }
    }
}
