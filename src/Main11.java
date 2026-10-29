import java.util.Random;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{-3, 5, 0, -9, 15, 4};
        int[] arr2 = new int[]{-5, 3, 1, 2, 8, 4};
        int[] arr3 = new int[6];

        for (int i = 0; i < arr3.length; i++) {
            int max = arr1[i];
            if (arr2[i] > max) {
                max = arr2[i];
            }
            arr3[i] = max;
        }
        for (int el : arr3) {
            System.out.println(el);
        }

        int sum = 0;
        int[] arr4 = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = random.nextInt(10);
        }
        for (int i = 0; i < arr4.length; i++) {
            sum += arr4[i];
        }
        System.out.println("---");
        System.out.println(sum);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter odd number: ");
        int n = scan.nextInt();

        if (n % 2 == 0) {
            System.out.println("Invalid number");
        } else {
            int[] arr = new int[n];
            int mid = n / 2;

            for (int i = 0; i < n; i++) {
                if (i <= mid) {
                    arr[i] = i + 1;
                } else {
                    arr[i] = n - i;
                }
            }
            for (int element : arr) {
                System.out.print(element + " ");
            }
        }
    }
}