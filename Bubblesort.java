class Sort<T extends Comparable<T>> {
    void bubblesort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + ",");
        }
        System.out.println("\b" + " }");
    }
}

public class Bubblesort {

    public static void main(String[] args) {

        Integer intarr[] = { 1, 6, 5, 2, 3 };
        String strarr[] = { "python", "java", "CPP", "C", };

        Sort<Integer> obj = new Sort<>();
        System.out.print("After sorting the Integer array: ");
        obj.bubblesort(intarr);

        Sort<String> obj1 = new Sort<>();
        System.out.print("After sorting the String array: ");
        obj1.bubblesort(strarr);
    }

}
