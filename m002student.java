class Student{
    String name;
    int rollNo,marks;

    Student(String n,int r,int m){
        name=n;
        rollNo=r;
        marks=m;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+grade());
        System.out.println();
    }

    String grade(){
        if(marks>=90)
            return "A";
        else if(marks>=75)
            return "B";
        else if(marks>=60)
            return "C";
        else if(marks>=40)
            return "D";
        else
            return "F";
    }
}

public class m002student{
    public static void main(String[] args){
        Student s1=new Student("Rahul",101,92);
        Student s2=new Student("Priya",102,68);

        s1.display();
        s2.display();
    }
}