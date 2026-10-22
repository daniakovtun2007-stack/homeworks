import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 1 до 31 января месяца: ");
        int date = sc.nextInt();
        switch(date){
            case 6, 7, 13, 14, 20, 21, 27, 28:
                System.out.println(date + " это выходной день");
                break;
            case 1, 2, 3, 4, 5, 8, 9 ,10, 11, 12, 15, 16, 17, 18, 19,
                     22, 23, 24, 25, 26, 29, 30, 31:
                System.out.println(date + " это рабочий день");
            break;
            default:
                System.out.println("Неправильная дата");
        }
        System.out.print("Введите номер месяца от 1 до 12: ");
        int month = sc.nextInt();
        switch(month){
            case 1, 2, 12:
                System.out.println("Это зима");
                break;
            case 3, 4, 5:
                System.out.println("Это весна");
                break;
            case 6, 7, 8:
                    System.out.println("Это лето");
                    break;
            case 9, 10, 11:
                System.out.println("Это осень");
        }

    }
}
