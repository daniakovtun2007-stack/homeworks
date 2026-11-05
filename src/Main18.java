import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String text = sc.nextLine();
        char[] letters = text.toLowerCase().toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'b') {
                count++;
            }
        }
        System.out.println("Количество букв b: " + count);

        System.out.println("Введите текст: ");
        String text1 = sc.nextLine();
        String[] words = text1.split(" ");
        String longestWord = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println("Самое длинное слово в предложении: " + longestWord);

        for (int i = 1; i <= 10; i++) {
            int decimalPlaces = i + 1;
            String formatString = "%." + decimalPlaces + "f%n";
            System.out.printf(formatString, Math.PI);
        }
    }
}
