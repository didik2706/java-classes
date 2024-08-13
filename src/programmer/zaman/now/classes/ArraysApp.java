package programmer.zaman.now.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
                1, 12,3,4,5,6,3,22,3,54,11
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 6));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 31));

        int[] results = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(results));

        int[] results2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(results2));
    }
}
