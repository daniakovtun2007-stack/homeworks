import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        int count = 0;
        int [] arr = {0, 5, 2, 4, 7, 1, 3, 19};
          for (int i = 0; i < arr.length; i++) {
              if (arr[i] % 2 == 1) {
                  count++;
              }
          }
        System.out.println("count: " + count);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите элемент " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Ваш массив:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        Random rand = new Random();
        int[] firstArray = new int[15];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = rand.nextInt(1, 50);
        }

        int[] secondArray = new int[firstArray.length * 2];

        for (int i = 0; i < firstArray.length; i++) {

            secondArray[i] = firstArray[i];

            secondArray[i + firstArray.length] = firstArray[i] * 2;
        }

        System.out.println("Перший масив: " + Arrays.toString(firstArray));
        System.out.println("Другий масив: " + Arrays.toString(secondArray));
    }
}

