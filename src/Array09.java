import java.util.Arrays;

public class Array09 {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55, 66};

        int temp;
        int len = arr1.length;
        for (int i = 0; i < len / 2; i++) {
            temp = arr1[len - 1 - i];
            arr1[len - 1 - i] = arr1[i];
            arr1[i] = temp;
        }
        System.out.println("arr1: " + Arrays.toString(arr1));
    }
}
