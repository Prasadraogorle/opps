import java.util.Scanner;
import java.lang.Math;

class Basiccalci {
    public double x;
    public double y;

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiplication(double x, double y) {
        return x * y;
    }

    public double divison(double x, double y) {
        return x / y;
    }
};

class Scientificcalci extends Basiccalci {
    public double squareroot(double x) {
        return Math.sqrt(x);
    }

    public double powerof(double x, double y) {
        return Math.pow(x, y);
    }

};

public class simple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scientificcalci s1 = new Scientificcalci();
        double x, y;
        int c;
        System.out.println("Choice numbers with operations");
        System.out.println("1.Addition" + "\n"
                + "2.Subtraction" + "\n"
                + "3.Multiplication" + "\n"
                + "4.Divison" + "\n"
                + "5.Square root of a number" + "\n"
                + "6.Power of a number");
        System.out.print("Enter the choice you desired to perform: ");
        c = input.nextInt();
        System.out.print("Enter the values: ");
        x = input.nextDouble();
        y = input.nextDouble();

        switch (c) {
            case 1:
                System.out.println(x + " + " + y + " = " + s1.add(x, y));
                break;

            case 2:
                System.out.println(x + " - " + y + " = " + s1.subtract(x, y));
                break;
            case 3:
                System.out.println(x + " * " + y + " = " + s1.multiplication(x, y));
                break;
            case 4:
                System.out.println(x + " / " + y + " = " + s1.divison(x, y));
                break;
            case 5:
                System.out.println("square root " + x + " is " + s1.squareroot(x));
                break;
            case 6:
                System.out.println(x + " power of " + y + " is :" + s1.powerof(x, y));
                break;
            default:
                System.out.println("Invalid choice is given");
                break;
        }
        input.close();
    }

}
