// First interface
interface Payable {
    double calculateSalary();
    default void displayPaymentInfo() {
        System.out.println("Payment processed via bank transfer.");
    }
}

// Second interface
interface Insurable {
    double calculateInsurance();
    default void displayInsuranceInfo() {
        System.out.println("Health insurance policy active.");
    }
}

// Third interface
interface Taxable {
    double calculateTax();
}

// Class implementing multiple interfaces
class Employee implements Payable, Insurable, Taxable {
    private String name;
    private double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + 5000; // basic + allowance
    }

    @Override
    public double calculateInsurance() {
        return basicSalary * 0.02;
    }

    @Override
    public double calculateTax() {
        return basicSalary * 0.10;
    }

    public void displayAllDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("Insurance Deduction: " + calculateInsurance());
        System.out.println("Tax Deduction: " + calculateTax());
        displayPaymentInfo();
        displayInsuranceInfo();
    }
}

public class mp {
    public static void main(String[] args) {
        Employee emp = new Employee("Akshay", 30000);
        emp.displayAllDetails();
    }
}