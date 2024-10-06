import java.util.Scanner;

public class cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество гостей: ");
        int guests = scanner.nextInt();

        if (guests % 2 == 0) {
            System.out.println(guests - 1);
        } else if (guests==1) {
            System.out.println(0);
        }else {
            System.out.println(guests);
        }

    }
}
