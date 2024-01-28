package Assignment5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileComparator {
    public static void main(String[] args) {
        String filePath1 = "input.txt"; // Change this to the first file path
        String filePath2 = "ram.txt"; // Change this to the second file path
        String outputFilePath = "output.txt"; // Change this to the output file path

        try {
            boolean areIdentical = compareFiles(filePath1, filePath2);
            writeComparisonResult(outputFilePath, areIdentical);
            System.out.println("Comparison result saved to " + outputFilePath);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static boolean compareFiles(String filePath1, String filePath2) throws IOException {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(filePath1));
             BufferedReader reader2 = new BufferedReader(new FileReader(filePath2))) {
    
            String line1 = reader1.readLine();
            String line2 = reader2.readLine();
    
            while (line1 != null && line2 != null) {
                System.out.println(line1 + "  :  " + line2);
                if (!line1.equals(line2)) {
                    return false;
                }
                line1 = reader1.readLine();
                line2 = reader2.readLine();
            }

            // Check if both files have reached the end
            if (line1 != null || line2 != null) {
                return false; // One file has more lines than the other
            }
    
            return true; // Both files have the same content
        }
    }
    

    private static void writeComparisonResult(String outputFilePath, boolean areIdentical) throws IOException {
        try (FileWriter writer = new FileWriter(outputFilePath)) {
            writer.write("Files are " + (areIdentical ? "identical" : "different"));
        }
    }
}
