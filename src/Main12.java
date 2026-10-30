import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{-3, 5, 0, -9, 15, 4};
        int[] arr2 = new int[]{2, 8, 4};
        int[] arr3 = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr3));

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter array size of integers: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Invalid input");
        } else {
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = rand.nextInt(-100, 100);
            }

            System.out.println(Arrays.toString(arr));

            System.out.print("Negative elements: ");
            boolean foundNegative = false;

            for (int element : arr) {
                if (element < 0) {
                    System.out.print(element + " ");
                    foundNegative = true;
                }
            }

            if (!foundNegative) {
                System.out.print("absent");
            }
        }
    }
}