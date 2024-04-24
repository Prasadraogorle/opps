interface Area {
    void area();// abstract public void area();
}

interface Perimeter {
    void perimeter();// abstract public void perimeter();
}

class Rectangle implements Area, Perimeter {
    float length, breadth;

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("Area of Rectangle is " + length * breadth);
    }

    public void perimeter() {
        System.out.print("Perimeter of Rectangle is " + 2 * (length + breadth));
    }
}

public class PureAbs {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(5, 4);
        obj.area();
        obj.perimeter();
    }
}
