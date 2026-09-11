class Employee {
    protected int empID;
    protected String name;
    protected double basicSalary;

    public Employee(int empID, String name, double basicSalary) {
        this.empID = empID;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateGrossSalary() {
        return basicSalary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class PermanentEmployee extends Employee {
    private double hra;
    private double da;

    public PermanentEmployee(int empID, String name, double basicSalary, double hra, double da) {
        super(empID, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    @Override
    public double calculateGrossSalary() {
        return basicSalary + hra + da;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

public class SI {
    public static void main(String[] args) {
        PermanentEmployee pe = new PermanentEmployee(101, "Akshay", 25000, 5000, 3000);
        pe.displayDetails();
    }
}