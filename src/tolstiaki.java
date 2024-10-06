import java.util.Collections;
import java.util.Scanner;

public class tolstiaki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите массы толстяков через пробел:");
        int weight_1 = scanner.nextInt();
        int weight_2 = scanner.nextInt();
        int weight_3 = scanner.nextInt();

        if ((weight_1 <= 94 || weight_1 > 727) && (weight_2 <= 94 || weight_2 > 727) && (weight_3 <= 94 || weight_3 > 727)) {
            System.out.println("Error");
        } else {
            int[] weights = {weight_1, weight_2, weight_3};

            int maxWeight = 0;
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] > maxWeight) {
                    maxWeight = weights[i];
                }
            }
            System.out.println(maxWeight);
        }


    }
}
