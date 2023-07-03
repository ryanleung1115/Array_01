public class Array01 {
    public static void main(String[] args) {
        double[] hens = {3, 5, 1, 3.4, 2, 50};

        double totalWeight = 0;
        for (int i = 0; i < hens.length; i++) {
            System.out.println(i + ": " + hens[i]);
            totalWeight += hens[i];
        }
        System.out.println("total weight: " + totalWeight);
        double avgWeight = totalWeight / hens.length;
        System.out.println("average weight: " + avgWeight);
    }
}
