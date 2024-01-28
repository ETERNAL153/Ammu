package Assignment5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WordReplacement {
    public static void main(String[] args) {
        String inputFilePath = "input.txt"; // Change this to your input file path
        String outputFilePath = "output.txt"; // Change this to your output file path
        String searchWord = "old_word"; // Change this to the word you want to replace
        String replacementWord = "new_word"; // Change this to the replacement word

        try {
            replaceWord(inputFilePath, outputFilePath, searchWord, replacementWord);
            System.out.println("Word replaced successfully. Modified content saved to " + outputFilePath);
        } catch (IOException e) {
            System.out.println("An error occurred while replacing the word: " + e.getMessage());
        }
    }

    private static void replaceWord(String inputFilePath, String outputFilePath,
                                    String searchWord, String replacementWord) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             FileWriter writer = new FileWriter(outputFilePath)) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(searchWord, replacementWord);
                writer.write(line + System.lineSeparator());
            }
        }
    }
}

