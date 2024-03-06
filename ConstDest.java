import java.util.Scanner;

class Student {
    String fullName;
    int rollNum;
    double semPercentage;
    String collegeName;
    int collegeCode;

    Student() {
        System.out.println("student ID is created");
    }

    Student(String fullName, int rollNum, double semPercentage, String collegeName, int collegeCode) {
        this.fullName = fullName;
        this.rollNum = rollNum;
        this.semPercentage = semPercentage;
        this.collegeName = collegeName;
        this.collegeCode = collegeCode;
    }

    void display() {
        System.out.println("student full name " + fullName);
        System.out.println("student roll number " + rollNum);
        System.out.println("student sem percentage " + semPercentage);
        System.out.println("student college name " + collegeName);
        System.out.println("student college code " + collegeCode);
    }
}

class ConstDest {
    public static void main(String[] args) {
        String fullName;
        int rollNum;
        double semPercentage;
        String collegeName;
        int collegeCode;
        Scanner input = new Scanner(System.in);
        System.out.print("Student name: ");
        fullName = input.nextLine();
        System.out.print("Enter your Roll Number: ");
        rollNum = input.nextInt();
        System.out.print("Enter your Sem Percentage: ");
        semPercentage = input.nextDouble();
        input.nextLine();
        System.out.print("Enter your College Name:  ");
        collegeName = input.nextLine();
        System.out.print("Enter your College Code: ");
        collegeCode = input.nextInt();
        Student constructor = new Student(fullName, rollNum, semPercentage, collegeName, collegeCode);
        constructor.display();
        input.close();
    }
}
