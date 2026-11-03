import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        int countCommasAndDots = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ',' || text.charAt(i) == '.') {
                countCommasAndDots++;
            }
        }
        System.out.println("Cuantity of commas and dots: " + countCommasAndDots);

        System.out.print("Enter text: ");
        String text1 = sc.nextLine();
        char [] symbols = text1.toCharArray();
        for (char s = 'a'; s <='z' ; s++){
            int count = 0;
            for (int i = 0; i < symbols.length; i++){
                if (symbols[i] == s){
                    count++;
                }
            }
            System.out.println(s + "-" + count);
        }
        System.out.print("Enter login: ");
        String login = sc.nextLine();

        if (isLoginValid(login)) {
            System.out.println("True login.");
        } else {
            System.out.println("False login.");
        }

    }

    public static boolean isLoginValid(String login) {
        if (login == null) {
            return false;
        }

        if (login.length() <= 6) {
            return false;
        }

        char firstChar = login.charAt(0);
        if (!((firstChar >= 'a' && firstChar <= 'z') || (firstChar >= 'A' && firstChar <= 'Z'))) {
            return false;
        }

        for (int i = 0; i < login.length(); i++) {
            char ch = login.charAt(i);
            boolean isLowerCaseEnglish = (ch >= 'a' && ch <= 'z');
            boolean isUpperCaseEnglish = (ch >= 'A' && ch <= 'Z');
            boolean isDigit = (ch >= '0' && ch <= '9');
            boolean isUnderscore = (ch == '_');

            if (!isLowerCaseEnglish && !isUpperCaseEnglish && !isDigit && !isUnderscore) {
                return false;
            }
        }

        return true;
    }
}
