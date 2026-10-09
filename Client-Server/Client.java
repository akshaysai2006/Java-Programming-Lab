import java.io.*;
import java.net.*;
public class Client {
    public static void main(String[] args) {
        String serverAddress = "127.0.0.1"; // localhost
        int port = 5000;
        try (Socket socket = new Socket(serverAddress, port);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            System.out.println("Connected to the server.");
            String message = "Hello Server, this is the Client!";
            writer.println(message);
            System.out.println("Sent to server: " + message);
            String response = reader.readLine();
            System.out.println("Received from server: " + response);
        } catch (UnknownHostException e) {
            System.out.println("Server not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}