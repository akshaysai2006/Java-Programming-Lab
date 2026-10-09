import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class TextEditor {
    public static void main(String[] args) {
        String fileName = "document.txt";
        String editorContent = "Welcome to the Text Editor!\n" +
                             "File: document.txt\n" +
                             "Status: Saved successfully.\n" +
                             "Content: FileWriter and FileReader handle character data directly in Java.";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(editorContent);
            System.out.println("Success: Content written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file: " + e.getMessage());
        }
        System.out.println("\nReading content from " + fileName + ":");
        try (FileReader reader = new FileReader(fileName)) {
            int charData;
            while ((charData = reader.read()) != -1) {
                System.out.print((char) charData);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}