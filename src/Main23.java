
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main23 {

    public static void main(String[] args) {

        String[] goods = {"Mars", "Snickers", "Twix", "Bounty"};
        double[] prices = {0.75, 0.8, 0.6, 0.7};
        int[] sales = {200, 250, 150, 180};

        String del = ";";

        File file = new File("report.csv");

        saveReport(file, del, goods, prices, sales);

        readFile(file);

        System.out.println(
                "Most expensive good is: "
                        + findExpensiveSales(file, del)
        );
    }

    public static void saveReport(
            File file,
            String del,
            String[] goods,
            double[] price,
            int[] sales) {

        try (PrintWriter pw = new PrintWriter(file)) {

            for (int i = 0; i < goods.length; i++) {

                pw.println(
                        goods[i] + del + price[i] + del + sales[i]
                );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(File file) {

        try (Scanner scan = new Scanner(file)) {

            while (scan.hasNextLine()) {

                String line = scan.nextLine();

                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String findExpensiveSales(File file, String del) {

        double expensiveGood = 0;
        String expensiveName = "";

        try (Scanner scan = new Scanner(file)) {

            while (scan.hasNextLine()) {

                String line = scan.nextLine();

                String[] data = line.split(del);

                String name = data[0];

                double price = Double.parseDouble(data[1]);

                if (price > expensiveGood) {

                    expensiveGood = price;

                    expensiveName = name;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return expensiveName;
    }
}
