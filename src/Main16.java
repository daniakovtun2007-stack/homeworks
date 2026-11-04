import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        int countVowels = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter text: ");
        String text = sc.nextLine();
        text = text.toLowerCase();
        char[] letters = text.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'a' || letters[i] == 'e'  || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u' || letters[i] == 'y') {
                countVowels++;
            }
        }
        System.out.println("Vowel count: " + countVowels);

        System.out.println("Enter a text: ");
        String text1 = sc.nextLine();
        String result = "";
        for (int i = 0; i < text1.length(); i++) {
            String prefix = text1.substring(0, i);
            String suffix = text1.substring(text1.length() - i);
            if (prefix.toLowerCase().equals(suffix)) {
                result += prefix;
            }
            }

        System.out.println(result);
        System.out.println("Enter a text: ");
        String text2 = sc.nextLine();
        String[] words = text2.split(";");
        String result2 = words[0];
        for (int i = 0; i < words.length; i++) {
            if (result2.length() > words[i].length()) {
                result2 = words[i];
            }
        }
        System.out.println(result2);
    }
}
