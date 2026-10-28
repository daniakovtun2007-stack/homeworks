import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n from 4 to 16: ");
        int n = sc.nextInt();
        int result = 1;
        if (n < 4 || n > 16) {
            System.out.println("Invalid input");
        } else {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }
        System.out.println("The result of factorial is: " + result);

        int number = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + " = " + number * i);
        }
        System.out.print("Enter width 3 or more: ");
        int w = sc.nextInt();
        System.out.print("Enter height 3 or more: ");
        int h = sc.nextInt();
        if (w < 3 || h < 3) {
            System.out.println("Invalid input");
        } else {
            for (int i = 1; i <= w; i++) {
                for (int j = 1; j <= h; j++) {

                    if (i == 1 || i == w || j == h || j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
    }
}