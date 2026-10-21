import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int a = 114;
        int b = 162;
        int envelopeSize = a*b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длинну предмета: ");
        double a1 = scan.nextDouble();
        System.out.print("Введите ширину предмета: ");
        double a2 = scan.nextDouble();
        double itemSize = a1*a2;

        if (itemSize >= envelopeSize) {
            System.out.println("Предмет не поместиться в конверт");
        } else {
            System.out.println("Предмет поместиться в конверт");
        }

        System.out.print("Введите координату x: ");
        double x = scan.nextDouble();
        System.out.print("Введите координату y: ");
        double y = scan.nextDouble();
        if (x >= 0 && y >= 0 && x <= 2 && y <= 2) {
            System.out.println("Точка попадает в заштрихованую область от -2,-2 до 2,2");
        } else if (x <= 0 && y <= 0 && x >= -2 && y >= -2) {
            System.out.println("Точка попадает в заштрихованую область от -2,-2 до 2,2");
        } else {
            System.out.println("Точка не попадает в заштрихованую область от -2,-2 до 2,2");
        }
    }
}
