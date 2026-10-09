import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
public class FitnessApp {
    public static void main(String[] args) {
        String fileName = "user_profile.txt";
        String profileData = "--- Fitness App User Profile ---\n" +
                            "Name: Alex Smith\n" +
                             "Age: 28\n" +
                             "Weight: 70.5 kg\n" +
                             "Height: 175 cm\n" +
                             "Goal: Weight Loss & Endurance\n";
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            byte[] dataBytes = profileData.getBytes(StandardCharsets.UTF_8);
            fos.write(dataBytes);
            System.out.println("Success: User profile written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file: " + e.getMessage());
        }
        System.out.println("\nReading user profile from " + fileName + ":");
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int byteData;
            while ((byteData = fis.read()) != -1) 
            {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}