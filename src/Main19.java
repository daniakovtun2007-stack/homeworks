import java.util.Arrays;

public class Main19 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 8};
        int result = countOddElement(array);
        System.out.println("Количество нечетных элементов: " + result);
        int[] arr = getOddElement(array);
        System.out.println(Arrays.toString(arr));
        System.out.println(sumDigits(123));
    }

    public static int countOddElement(int[] array) {
        if (array == null) {
            return 0;
        }

        int count = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] getOddElement(int[] array) {
        int[] oddElements = new int[countOddElement(array)];
        int insertIndex = 0;

        for (int element : array) {
            if (element % 2 != 0) {
                oddElements[insertIndex] = element;
                insertIndex += 1;
            }
        }

        return oddElements;
    }
    public static int sumDigits(int number) {
        int sum = 0;
       while (number > 0) {
           int digit = number % 10;
           sum += digit;
           number /= 10;
       }
        return sum;
        }
    }