import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число a: ");
        double a = input.nextInt();
        System.out.print("Введите число a: ");
        double b = input.nextInt();
        if ((Math.pow(a, 2) + Math.pow(b, 2)) > Math.pow((a + b), 2)) {
            System.out.println("сумма квадратов больше");
        } else if ((Math.pow(a, 2) + Math.pow(b, 2)) < Math.pow((a + b), 2)) {
            System.out.println("квадрат сумми больше");
        } else {
            System.out.println("Они равни");
        }
        int maxValue;
        System.out.print("Введите первое число: ");
        int number1 = input.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = input.nextInt();
        System.out.print("Введите третье число: ");
        int number3 = input.nextInt();
        maxValue = number1;
        if (number2 > maxValue) {
            maxValue = number2;
        }
        if (number3 > maxValue) {
            maxValue = number3;
        }
        System.out.println("Наибольшее число " + maxValue);

        System.out.print("Введите трехзначное число: ");
        int number = input.nextInt();
        if (number % 10 == 7 || number % 100 == 7 || number % 1000 == 7) {
            System.out.println("Даное число являеться счастливим");
        } else {
            System.out.println("Даное число не являеться счастливим");
        }
    }
}
