import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    isPrime = false;
                break;
            }
            if (isPrime) {
                System.out.println(i);
            }

        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите нечетное число больше 3: ");
        int n = scan.nextInt();
        if (n != 0 && n > 3) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || i == n || j == i || j == (n + 1) - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Ошибка!");
        }
    }
}