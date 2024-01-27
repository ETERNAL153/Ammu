package Assignment5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        String inputFileName = "input.txt"; // Change this to your input file name
        String outputFileName = "ram.txt"; // Change this to your output file name

        try {
            int wordCount = countWords(inputFileName);
            writeWordCount(outputFileName, wordCount);
            System.out.println("Word count saved to " + outputFileName);
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + e.getMessage());
        }
    }

    private static int countWords(String fileName) throws FileNotFoundException {
        int count = 0;
        File f = new File(fileName);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                sc.next();
                count++;
            }
        }
        return count;
    }

    private static void writeWordCount(String fileName, int wordCount) {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println("Word count: " + wordCount);
        } catch (FileNotFoundException e) {
            System.out.println("Output file not found: " + e.getMessage());
        }
    }
}
