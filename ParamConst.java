import java.util.Scanner;

class Student {
    String fullName;
    double semPercentage;
    String collegeName;
    int collegeCode;

    Student() {
        collegeName = "MVGR";
        collegeCode = 33;

    }

    Student(String fullName, double semPerentage) {
        this();
        this.fullName = fullName;
        this.semPercentage = semPerentage;

    }

    void display() {
        System.out.println("student full name " + fullName);
        System.out.println("student sem percentage " + semPercentage);
        System.out.println("student college name " + collegeName);
        System.out.println("student college code " + collegeCode);
    }
}

public class ParamConst {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = x.nextLine();
        System.out.print("Enter your Sem Percentage: ");
        double sem = x.nextDouble();
        Student student1 = new Student(name, sem);
        student1.display();
        x.close();
    }

}
