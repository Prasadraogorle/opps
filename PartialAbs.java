abstract class shape {
    abstract void perimeter();

    void display() {
    }
}

class Rectangle extends shape {
    float l, b;

    Rectangle(float l, float b) {
        this.l = l;
        this.b = b;
    }

    void perimeter() {
        System.out.println(2 * (l + b));
    }
}

class Triangle extends shape {
    float a, b, c;

    Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void perimeter() {
        System.out.println(a + b + c);
    }
}

public class PartialAbs {
    public static void main(String[] args) {
        Rectangle x = new Rectangle(4, 9);
        Triangle y = new Triangle(1.2f, 2.7f, 3.5f);
        System.out.print("perimeter of rectangle : ");
        x.perimeter();
        System.out.print("perimeter of triangle : ");
        y.perimeter();
    }
}
