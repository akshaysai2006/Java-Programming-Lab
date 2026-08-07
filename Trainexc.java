public class Trainexc {
    public static void main(String[] args) {
        String[] trainCodes = {"TN101", "AP202", "KA303", "KL404"};

        try {
            System.out.println("Train Code: " + trainCodes[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        }

        System.out.println("Program continues...");
    }
}