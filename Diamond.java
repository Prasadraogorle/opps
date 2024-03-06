class ClassA {
    void Aclass() {
        System.out.println("I am from class A");
    }
}

class ClassB extends ClassA {
    void Bclass() {
        System.out.println("I am from class B inherit from class A");
    }
}

class ClassC extends ClassA {
    void Cclass() {
        System.out.println("I am from class C inherit from class A");
    }
}
/*
 * class ClassD extends ClassC,ClassB{
 * here there is no concept of the multiple inheritance. java eliminates this
 * concept. Because
 * In this problem, there is the hierarchical inheritance half part and other
 * one is multiple
 * inheritance.
 * classA
 * / \
 * classB classC
 * \ /
 * classD
 * }
 */

public class Diamond {
    public static void main(String[] args) {
        ClassB obj1 = new ClassB();
        ClassC obj2 = new ClassC();
        obj1.Aclass();
        obj1.Bclass();
        obj2.Aclass();
        obj2.Cclass();
    }
}
