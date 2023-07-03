public class Array03 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        // int[] b = {1, 2, 3, 4, 5.0};    // double-> int, error
        int[] b = {1, 2, 3, 4, (int) 5.0};
        double[] c = {1.0, 2.0, 3.0, 4.0, 5};   // int -> double

        String[] names = {"jason", "jenny", "mike"};

        int[] d = new int[5];
        // ArrayIndexOutOfBoundsException
        // System.out.println(d[5]);
    }
}
