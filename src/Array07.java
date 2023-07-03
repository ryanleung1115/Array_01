import java.util.Arrays;

public class Array07 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }

        arr2[0] = 111;
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}
