import java.util.Scanner;

public class two_banditoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите простреленные банки Гарри и Ларии через пробел:");
        int garry = scanner.nextInt();
        int larry = scanner.nextInt();

        int ne_garry = larry - 1;
        int ne_larry = garry - 1;

        System.out.println(ne_garry + " " + ne_larry);

    }
}
