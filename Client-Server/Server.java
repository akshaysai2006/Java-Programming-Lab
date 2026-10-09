import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] args) {
        int port = 5000;
        System.out.println("Server is starting and waiting for client connection on port " + port + "...");
        try (ServerSocket serverSocket = new ServerSocket(port);
             Socket socket = serverSocket.accept();
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {
            System.out.println("Client connected successfully!");
            String clientMessage = reader.readLine();
            System.out.println("Received from client: " + clientMessage);
            writer.println("Hello from Server! Message received successfully.");
        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());
        }
    }
}