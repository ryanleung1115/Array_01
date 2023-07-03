import java.util.Arrays;

public class Array08 {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55, 66};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[arr1.length - 1 - i];
        }
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}
