class Student {
    protected int rollNo;
    protected String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void displayStudentDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

class Marks extends Student {
    protected double[] subjectMarks; // marks in 5 subjects

    public Marks(int rollNo, String name, double[] subjectMarks) {
        super(rollNo, name);
        this.subjectMarks = subjectMarks;
    }

    public void displayMarks() {
        System.out.println("Marks in 5 subjects:");
        for (int i = 0; i < subjectMarks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + subjectMarks[i]);
        }
    }
}

class Result extends Marks {

    public Result(int rollNo, String name, double[] subjectMarks) {
        super(rollNo, name, subjectMarks);
    }

    public double calculateTotal() {
        double total = 0;
        for (double m : subjectMarks) {
            total += m;
        }
        return total;
    }

    public double calculateAverage() {
        return calculateTotal() / subjectMarks.length;
    }

    public char calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else if (avg >= 40) return 'D';
        else return 'F';
    }

    public void displayResult() {
        displayStudentDetails();
        displayMarks();
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
    }
}

public class ml {
    public static void main(String[] args) {
        double[] marks = {85, 92, 78, 88, 95};
        Result result = new Result(101, "Akshay", marks);
        result.displayResult();
    }
}