import java.util.Scanner;

public class Arifmetika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите А В С: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a * b == c) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

    }
}
