import java.util.Scanner;

public class zhuravliki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество журавликов: ");
        int zhuravli = scanner.nextInt();

        int petya = zhuravli / 6;
        int kate = (4 * zhuravli) / 6;
        int sergey = zhuravli / 6;
        System.out.println(petya + " " + kate + " " + sergey);

    }
}
