import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        double[] scores = new double[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.print("enter scores[" + i + "]: ");
            scores[i] = scanner.nextDouble();
        }

        System.out.println("output: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
    }
}
