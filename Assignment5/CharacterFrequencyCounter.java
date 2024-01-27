package Assignment5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        String inputFileName = "input.txt"; // Change this to your input file name
        String outputFileName = "output.txt"; // Change this to your output file name

        try {
            Map<Character, Integer> frequencyMap = countCharacterFrequency(inputFileName);
            writeCharacterFrequency(outputFileName, frequencyMap);
            System.out.println("Character frequency saved to " + outputFileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static Map<Character, Integer> countCharacterFrequency(String fileName) throws IOException {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        FileReader f = new FileReader(fileName);
        try (BufferedReader reader = new BufferedReader(f)) {
            int character;
            while ((character = reader.read()) != -1) {
                char ch = (char) character;
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }
        return frequencyMap;
    }

    private static void writeCharacterFrequency(String fileName, Map<Character, Integer> frequencyMap) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        }
    }
}
//abcgsdf