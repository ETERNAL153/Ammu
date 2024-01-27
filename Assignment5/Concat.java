package Assignment5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Concat {
    public static void main(String args[]) {
        String inputfile1 = "input.txt"; // Change this to your first input file name
        String inputfile2 = "ram.txt"; // Change this to your second input file name
        String outputfile = "output.txt"; // Change this to your output file name
        writeConcatenatedFile(inputfile1, inputfile2, outputfile);
        System.out.println("Files data saved to " + outputfile);
    }

    private static void writeConcatenatedFile(String fileName1, String fileName2, String outfileName) {
        try (PrintWriter writer = new PrintWriter(outfileName)) {
            File file1 = new File(fileName1);
            File file2 = new File(fileName2);
            
            appendFileContents(writer, file1);
            appendFileContents(writer, file2);
        } catch (FileNotFoundException e) {
            System.out.println("Output file not found: " + e.getMessage());
        }
    }

    private static void appendFileContents(PrintWriter writer, File file) {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                writer.print(scanner.next());
                writer.print(" "); // Add a space between words for readability
            }
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + e.getMessage());
        }
    }
}
