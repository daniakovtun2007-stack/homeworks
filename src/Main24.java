
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main24 {

    public static void main(String[] args) {

        File file = new File("file.txt");

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        try (PrintWriter printWriter = new PrintWriter(file)) {

            printWriter.println(Arrays.deepToString(array));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("File size: " + size(file));

        File directory = new File(".");

        catalogList(directory);
    }

    public static void catalogList(File f) {

        String[] files = f.list();

        if (files != null) {
            for (String name : files) {
                System.out.println(name);
            }
        }
    }

    public static long size(File f) {

        long bytes = f.length();

        if (bytes < 1000) {
            return bytes;
        } else if (bytes < 1000000) {
            return bytes / 1000;
        } else {
            return bytes / 1000000;
        }
    }
}

