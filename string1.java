import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first employee name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second employee name: ");
        String name2 = sc.nextLine();

        if(name1.equalsIgnoreCase(name2))
            System.out.println("Both employees are working in the same department.");
        else
            System.out.println("Employees are working in different departments.");

        sc.close();
    }
}