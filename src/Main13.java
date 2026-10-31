import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 7, -2, 5},
                {3, 9, 1, 15},
                {8, 1, -1, 2},
                {3, 2, 10, 1}
        };

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            int max = array[i][0];

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }

            sum += max;
        }

        System.out.println("Summa: " + sum);

        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            int value = i;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value;
                value = (value + 1) % 10;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println();

        int[][] array1 = new int[5][5];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = rand.nextInt(0, 2);
            }
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.println(Arrays.toString(array1[i]));
        }

        System.out.println("Enter integer number x from 0 to 4: ");
        int x = sc.nextInt();
        System.out.println("Enter integer number y from 0 to 4: ");
        int y = sc.nextInt();
        if (x < 0 || y < 0 || x >= 5 || y >= 5) {
            System.out.println("Invalid input");
        } else {

            for (int di = -1; di <= 1; di++) {
                for (int dj = -1; dj <= 1; dj++) {
                    if (di == 0 && dj == 0) continue;

                    int ni = x + di;
                    int nj = y + dj;

                    if (ni >= 0 && ni < 5 && nj >= 0 && nj < 5) {
                        if (array1[ni][nj] == 1) {
                            count++;
                        }
                    }
                }
            }

            System.out.println("Кількість одиниць навколо: " + count);
        }
    }
    }
