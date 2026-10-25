import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        int n = sc.nextInt();
        if (n > 0) {
            while (n > 0) {
                sum += n % 10;
                n = n / 10;
            }
            System.out.println("Сумма всех чисел из которых состоит натуральное число " + sum);
        } else {
            System.out.println("Введите натуральное число!");
        }
        int start = 1;
        int end = 20;
        for (int i = start; i <= end; i++) {
         if (i % 3 == 0 && i % 5 == 0) {
             System.out.println("=");
         }
             else if (i % 3 == 0) {
                System.out.println("+");
            } else if (i % 5 == 0) {
                System.out.println("-");

            } else {
                System.out.println(i);
            }
        }
    }
}
