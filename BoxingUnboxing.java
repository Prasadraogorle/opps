public class BoxingUnboxing {

    public static void main(String[] args) {
        // Boxing
        int i = 10;
        Integer boxed = Integer.valueOf(i);
        System.out.println("Boxed integer: " + boxed);

        // Unboxing
        Integer j = new Integer(20);
        int unboxed = j.intValue();
        System.out.println("Unboxed integer: " + unboxed);

           }
}
