
class Superclass {
    public int a = 10;
    private int b = 20;
    protected int c = 30;

    public Superclass() {
        System.out.println("In super class");
        System.out.println("public:" + a);
        System.out.println("private:" + b);
        System.out.println("protected:" + c);
    }

    public int getb() {
        return b; // private variable 'b' accessible with in the class
    }
}

class Subclass extends Superclass {
    public Subclass() {
        super();
        System.out.println("In sub class");
        System.out.println("public:" + a);
        System.out.println("private:" + "private member cannot be accessed");
    }

    int getc() {
        return c; // protected variable accessible within the class and inherited class
    }
}

public class PublicInheri {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        System.out.println("In main(): Subclass inherits public Superclass");
        System.out.println("public:" + obj.a);
        // System.out.println("private:" + obj.b); // b has private access in Superclass
        // System.out.println("protected:" + obj.c); // c has protected access in
        // Superclass
        System.out.println("private:" + obj.getb());
        System.out.println("protected:" + obj.getc());
    }
}
