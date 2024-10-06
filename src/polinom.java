import java.util.Scanner;

public class polinom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int polinom = scanner.nextInt();

        int Xxxx = polinom / 1000;
        int xXxx = polinom / 100 % 10;
        int xxXx = polinom / 10 % 10;
        int xxxX = polinom % 10;

        if (Xxxx == xxxX && xXxx == xxXx) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
