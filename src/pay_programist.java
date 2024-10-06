import java.util.Scanner;

public class pay_programist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 10 != 0)) {
            System.out.print(String.format("12/09/%d", year));
        }else{
            System.out.print(String.format("13/09/%d", year));
        }

    }
}
