import java.util.Arrays;

public class Main20 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 9};
        System.out.println(Arrays.toString(nearTwoNumbers(array)));
        System.out.println(checkPrime(9));
        System.out.println(median(1, 7, 4, 9, 7, 10, 15));
    }

    public static int[] nearTwoNumbers(int[] arr) {
        int indexFirst = 0;
        int indexSecond = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) < Math.abs(arr[indexFirst] - arr[indexFirst])) {
                    indexFirst = i;
                    indexSecond = j;
                }
            }
        }
        return new int[]{arr[indexFirst], arr[indexSecond]};
    }

    public static boolean checkPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static int median(int... numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        if (numbers.length % 2 == 0) {
            return (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2;
        } else {
            return numbers[numbers.length / 2];
        }
    }
}
