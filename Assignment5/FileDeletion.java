package Assignment5;
import java.io.File;

public class FileDeletion {
    public static void main(String[] args) {
        String filePath = "output2.txt"; // Change this to your file path

        try {
            deleteFile(filePath);
            System.out.println("File deleted successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred while deleting the file: " + e.getMessage());
        }
    }

    private static void deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            boolean deleted = file.delete();
            if (!deleted) {
                throw new RuntimeException("Failed to delete the file.");
            }
        } else {
            throw new RuntimeException("File does not exist.");
        }
    }
}
