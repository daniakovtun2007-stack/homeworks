import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int n1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int n2 = sc.nextInt();
        System.out.print("Введите третье число: ");
        int n3 = sc.nextInt();
        System.out.print("Введите четвертое число: ");
        int n4 = sc.nextInt();
        int max = n1;
        if (n2 > max) {
            max = n2;
            if(n3 > max) {
                max = n3;
                if(n4 > max) {
                    max = n4;
                }
            }
        }
        System.out.println("Наибольшее число среди четырех: " + max);

        System.out.print("Введите номер квартиры: ");
        int apartment = sc.nextInt();

        if (apartment < 1 || apartment > 180) {
            System.out.println("Такой квартиры нет в доме.");
        } else {
            int entrance = (apartment - 1) / 36 + 1;
            int floor = ((apartment - 1) % 36) / 4 + 1;

            System.out.println("Подъезд: " + entrance);
            System.out.println("Этаж: " + floor);
        }
       System.out.print("Введите первую сторону треугольника: ");
        double a = sc.nextDouble();
        System.out.print("Введите вторую сторону треугольника: ");
        double b = sc.nextDouble();
        System.out.print("Введите третью сторону треугольника: ");
        double c = sc.nextDouble();
        if ((a+b)>c && (a+c)>b && (b+c)>a){
            System.out.println("Такой треугольник существует");
        } else {
            System.out.println("Такой треугольник не существует");
        }
    }
}
